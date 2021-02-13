package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Customer cust=(Customer)context.getBean("customer");
		System.out.println(cust.toString());

	}

}
	

