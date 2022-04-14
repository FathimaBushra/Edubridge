package practice_qns;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SampleConnection1104 {

	public static void main(String[] args) {
	
	ArrayList<String> orders = new ArrayList<>();
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/edubridge","root","S##48k@qirt");  
			  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from orders");  
            while (rs.next()) {
            	System.out.println("ORD_NUM " + rs.getDouble("ord_num")+"\t||" +
            "   ORD_AMOUNT : " + rs.getDouble("ord_amount")
            	+"\t||"+"ADVANCE_AMOUNT : " + rs.getDouble("advance_amount"));
            }
				con.close(); 
			}catch(Exception e){ System.out.println(e);}  
	}

}
//String query = "insert into book(bname) values(?)";
//PreparedStatement pdstmt = con.prepareStatement(query);
////set the values
//pdstmt.setString(1,first_name);
//pdstmt.executeUpdate();
//
//System.out.println("Successs"); 
