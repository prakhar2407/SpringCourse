package com.ncu.Controller;

import com.ncu.Model.Student;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@SessionAttributes("student")
public class ControllerClass {
    @ModelAttribute("student")
    public Student setUpStudentForm() {
        return new Student();
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/")
    public String method1(){
        return "homeController";
    }

    @RequestMapping("/StudentForm")
    public String method1(Model model){
        model.addAttribute("student",new Student());
        return "StudentForm";
    }

    @RequestMapping("/ResultofForm")
    public String method2(@Valid @ModelAttribute("student") Student student, BindingResult br){
        System.out.println(student.getFname());
        System.out.println(student.getLname());
        if (br.hasErrors()){
            return "StudentForm";
        }
        else {

            return "ProcessedStudentForm";
        }
    }
}
