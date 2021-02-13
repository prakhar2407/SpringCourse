import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppPrototype {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Prototype.xml");
        TennisCoach tennisCoach1 = context.getBean("myCoach",TennisCoach.class);
        TennisCoach tennisCoach2 = context.getBean("myCoach",TennisCoach.class);
        tennisCoach1.setName("Akshay");
        tennisCoach2.setName("Rahul");
        System.out.println(tennisCoach1);
        System.out.println(tennisCoach2);
        System.out.println(tennisCoach1.getName());
        System.out.println(tennisCoach2.getName());
    }
}
