package practice_qns;
import java.sql.*;
public class MyConnection {

	public static void main(String[] args) {
	
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/edubridge","root","S##48k@qirt");  
			  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from foods");  
            while (rs.next()) {
            	System.out.println("ITEM ID: " + rs.getString(1)+"\t||" + "   ITEM Name: " + rs.getString(2)
            	+"\t||"+"ITEM UNIT: " + rs.getString(3)+"\t||" + " COMPANY ID: " + rs.getString(4));
            }
				con.close(); 
			}catch(Exception e){ System.out.println(e);}  
		}
	}


