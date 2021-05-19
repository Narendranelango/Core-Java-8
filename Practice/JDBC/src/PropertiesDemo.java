
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class PropertiesDemo {
//	public static Properties createDefaultProperties() {
//		Properties tempProp = new Properties();
//		tempProp.setProperty("url", "jdbc:mysql://localhost:3306/mydb");
//		tempProp.setProperty("driver", "com.mysql.jdbc.Driver");
//		tempProp.setProperty("username", "root");
//		tempProp.setProperty("password", "root");
//		tempProp.list(System.out);
//		return tempProp;
//	}
//
//	public static void saveProperties(Properties p, String fileName) {
//		{
//			
//			FileOutputStream fos = null;
//			try {
//				fos = new FileOutputStream(fileName);
//				p.store(fos, "Storing DB configuration");
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} finally {
//				try {
//					fos.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//public static Properties loadProperties(String filename, Properties prop)
//{
//	FileInputStream fis=null;
//	try {
//		fis=new FileInputStream(filename);
//	
//			prop.load(fis);
//		 catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		
//	}
//	finally {
//		try {
//			fis.close();
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	return prop;
//	}
//	public static Properties alterProperties(Properties p)
//	{
//		Enumeraton enProps=p.propertyNames();
//		while(enProps.hasMoreElements())
//	}
//	}
//	public static void main(String[] args) {
//		Properties myProp;
//		Properties myNewProp;
//		myProp = createDefaultProperties();
//		saveProperties(myProp,"C:\\Java8\\dbconfig.properties");
//		myNewProp=loadProperties("C:\\Java8\\dbconfig.properties");
//		System.out.println(myNewProp);
//		String driver=myNewProp.getProperty("driver");
//		System.out.println(driver);
//	}
//}

















import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
     
	public static Properties createDefaultProperties() {
		Properties tempProp=new Properties();
		
		tempProp.setProperty("url", "jdbc:mysql://localhost:3306/mydb");
        tempProp.setProperty("driver", "com.mysql.jdbc.Driver");
        tempProp.setProperty("username", "root");
        tempProp.setProperty("password", "root");
        tempProp.list(System.out);
        return tempProp;
    }
	
	public static void saveProperties(Properties p, String fileName) 
	{
		FileOutputStream fos=null;
		try 
		{
			fos=new FileOutputStream(fileName);
			p.store(fos,"Saving the Db configurations...");
		} 
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		finally 
		{
			try 
			{
				fos.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	}
     
   public static Properties loadProperties(String filename) 
   {
	   FileInputStream fis=null;
	   Properties prop=new Properties();
	   try 
	   {
		   
		fis=new FileInputStream(filename);
		prop.load(fis);
		
	   } 
	   catch (FileNotFoundException e) 
	   {
		   
		e.printStackTrace();
		
	   }
	   catch (IOException e) 
	   {
		   
		e.printStackTrace();
		
	   }
	   
	   finally 
	   {
		try 
		{
			fis.close();	 
		 } 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	 }
	   return prop;
 }
   
   public static Properties alterProperties(Properties p)
   {
	   Properties newProps=new Properties();
	   Enumeration enProps=p.propertyNames();
	   String key="";
	   while(enProps.hasMoreElements())
	   {
		   key=(String) enProps.nextElement();
		   if(key.equals("password"))
		   {
			   newProps.setProperty(key,"newroot");
		   }
	   }
	   return newProps;
   }
   
	public static void main(String[] args) 
	{
		Properties  myProp;
		Properties mynewProp;
		
		myProp=createDefaultProperties();
		saveProperties(myProp,"C:\\Java8\\dbconfig.properties");
		mynewProp=loadProperties("C:\\Java8\\dbconfig.properties");
	    System.out.println(mynewProp);
	    System.out.println("_________");
	    String driver=mynewProp.getProperty("driver");
		System.out.println(driver);
	    String url=mynewProp.getProperty("driver");
			System.out.println(url);
		    String username=mynewProp.getProperty("driver");
			System.out.println(username);
		    String psw=mynewProp.getProperty("driver");
			System.out.println(psw);
			mynewProp=alterProperties(mynewProp);
			System.out.println(mynewProp);
		
	}

}