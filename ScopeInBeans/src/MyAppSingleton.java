import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppSingleton {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Singleton.xml");
        TennisCoach tennisCoach1 = context.getBean("myTennisCoach",TennisCoach.class);
        TennisCoach tennisCoach2 = context.getBean("myTennisCoach",TennisCoach.class);
        System.out.println(tennisCoach1);
        System.out.println(tennisCoach2);
        tennisCoach1.setName("Akshay");
        tennisCoach2.setName("Rahul");
        System.out.println(tennisCoach1.getName());
        System.out.println(tennisCoach2.getName());
    }
}
