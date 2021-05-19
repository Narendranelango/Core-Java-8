import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCDemo {
	//Step 1: load driver class
	//step 2:get connection from driver manager
	//step 3:get Statement from statement
	//step 4:get ResultSet from Statement
	//Step 5:Print the ResultSet
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("connection.prop");
		 Properties p=new Properties (); 
	        p.load (fis); 
	        String url=(String) p.get("URL");
		// TODO Auto-generated method stub
		try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=  DriverManager.getConnection(url,"root", "root");
            System.out.println(con);
            Statement stat=con.createStatement();
            String select="Select * from emp";
            String insert="insert into emp values(103,'Narendr','E')";
            int rowi=stat.executeUpdate(insert);
            System.out.println(rowi);
            ResultSet rs=stat.executeQuery(select);
          while(rs.next()) {
        	  int id=rs.getInt("id");
        	  String fin=rs.getString("fname");
        	  String lin=rs.getString("lname");
        	  System.out.println("ID: "+id+" Fname: "+fin+" Lname: "+lin);
          }
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
	}
	}