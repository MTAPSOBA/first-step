package Com.tapsoba.Phone_Springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("bean.xml file loaded!");
		// Get the bean
		Airtel iser = applicationContext.getBean("airtel" ,Airtel.class);
		//fdsfsdf
		// Calling the methods
		iser.activationServices();
		 
	}
}
