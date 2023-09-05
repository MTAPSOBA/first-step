package tapsobajdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;

public class DemoClass {

	public static void main(String[] args) throws Exception {

		
		Class.forName("com.myswl.jdbc.driver");
		
		Connection con = DriverManager.getConnection(url, Username, Passport);
		
	}

}

