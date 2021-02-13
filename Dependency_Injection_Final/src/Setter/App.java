package Setter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Employee employee = (Employee) context.getBean("employeeBean");
        System.out.println(employee);
    }
}
