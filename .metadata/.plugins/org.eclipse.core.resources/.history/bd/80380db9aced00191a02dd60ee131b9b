package isro;
import java.sql.*;


public class DatabaseConnect {
	
	public static Connection mkconnection() throws Exception
	{ 
		String url="jdbc:mysql://localhost:3306/space";
	String uname="root";
	String pword="hrishi2sql";
	//String query="select name from student where student_id=2" ;
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn=DriverManager.getConnection(url,uname,pword);
	
	return conn;
		
	}

}
