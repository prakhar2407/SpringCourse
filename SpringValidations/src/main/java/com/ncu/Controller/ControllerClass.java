package com.ncu.Controller;

import com.ncu.Model.Student;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class ControllerClass {
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/StudentForm")
    public String method1(Model model){
        model.addAttribute("student",new Student());
        return "StudentForm";
    }

    @RequestMapping("/ResultofForm")
    public String method2(@Valid @ModelAttribute("student") Student theStudent, BindingResult br){
        System.out.println(theStudent.getFname());
        System.out.println(theStudent.getLname());
        if (br.hasErrors()){
            return "StudentForm";
        }
        else {
            return "ProcessedStudentForm";
        }
    }
}
