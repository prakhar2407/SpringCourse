package Constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Employee employee = context.getBean("employeeBean",Employee.class);
        System.out.println(employee);
    }
}
