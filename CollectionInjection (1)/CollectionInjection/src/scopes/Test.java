package scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		A aobject1 = (A)context.getBean("aobj");
		A aobject2 =  (A)context.getBean("aobj");
	  System.out.println(aobject1);
	  System.out.println(aobject1);
		aobject1.getBclass();
	  aobject2.getBclass();
				
	}

}
