import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Log4JDemo {
	private static Logger myLogger=Logger.getLogger(Log4JDemo.class.getName());
	private Object x;
	public void do_something(int a,float b) {
		myLogger.info("Inside do_something with parameters: "+a+" "+b);
		myLogger.debug("Operation performed successfully");
	if(x!=null) {
		myLogger.error("Error occured");
	}
	myLogger.info("Exiting");
	}
public static void main(String[] args) {
	PropertyConfigurator.configure("Resources/log4j.properties");
	Log4JDemo demo=new Log4JDemo();
	demo.do_something(1,(float) 1.2);
}
}