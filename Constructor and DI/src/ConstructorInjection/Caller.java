package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Caller {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        DAO dao = (DAO)ac.getBean("dao");
        DAO dao2 = (DAO)ac.getBean("dao2");
        dao.create();
//        dao.read();
    }
}
