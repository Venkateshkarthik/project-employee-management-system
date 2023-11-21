import java.sql.*;

public class Employee {
      public static void main(String[]args)throws Exception 
      {
    	   employee1();
      }
      public static void employee1()throws Exception
      {
    	  String url ="jdbc:mysql://localhost:3307/dsky";
    	  String username="root";
    	  String password="1999";
    	  String Query="insert into dsky.trun values(?,?,?)";
    	  Connection con = DriverManager.getConnection(url, username, password);
     	  PreparedStatement pst =con.prepareStatement(Query);
     	  pst.setInt(1,101);
     	  pst.setString(2,"raghu");
     	  pst.setInt(3,1000);
        pst.setLong(4,9876543291L);
        pst.setString(5,"trichy");
     	  pst.executeUpdate();
  		  con.close();
    	  
      }
}
