package Com.tapsoba.SpringStudentInfo;

import org.springframework.beans.factory.annotation.Value;

public class Student {
@Value("${Student.FirstName}")
	private String FirstName;

@Value("${Student.Lastname}")
private String LastName;

@Value("${Student.Email}")
	private String Email;

@Value("${Student.PhoneNumber}")
	private String PhoneNumber;
	 
	
	public void DisplaysStudentsInfo() {
		
		System.out.println("FirstNme :" + FirstName );
		System.out.println("LastName :" + LastName );
		System.out.println("Email  :" +  Email );
		System.out.println("PhoneNumber :" + PhoneNumber );
	}
	}


