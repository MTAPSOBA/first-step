package Com.navin.talusko1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml") ;

		Vehicle Obj = (Vehicle) context.getBean("vehicle");

		Obj.drive();

	}

}
