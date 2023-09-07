package Com.tapsoba.HommeDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean.xml file loaded!");

		Human human = context.getBean("humano" , Human.class);
		
		
		human.Heartpumpimg();
			}
		

		
		
		
	}

