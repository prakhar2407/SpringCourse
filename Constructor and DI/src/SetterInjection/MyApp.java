package SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("SetterInjectionconfig.xml");
        CricketCoach myCCoach = new CricketCoach();
        myCCoach.setFortune(ifortune);
        Fortune fortune=new Fortune();


    }
}

