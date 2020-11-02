
//////import java.awt.List;
////import java.util.ArrayList;
////import java.util.Collections;
////
////class Demo {
////	public String firstName;
////	public String lastName;
////	public String gender;
////
////	public String getFirstName() {
////		return firstName;
////	}
////
////	public void setFirstName(String firstName) {
////		this.firstName = firstName;
////	}
////
////	public String getLastName() {
////		return lastName;
////	}
////
////	public void setLastName(String lastName) {
////		this.lastName = lastName;
////	}
////
////	public String getGender() {
////		return gender;
////	}
////
////	public void setGender(String gender) {
////		this.gender = gender;
////	}
////
////	public void gender() {
////		
////		if (gender == "M" || gender == "F")
////			System.out.println("Done");
////		else
////			System.out.println("Wrong Details");
////	}
////
////	public String toString() {
////		return firstName + " : " + lastName + " " + gender;
////	}
////
////	public void calc() {
////
////	}
////}
////
////public class Practice {
////	enum Gen{
////		M,F	;
////	}
////	public static void main(String args[]) {
////		Demo d = new Demo();
////		d.setFirstName("Naren");
////		d.setLastName("E");
////		d.setGender("M");
////		d.gender();
////		System.out.println("Person Details");
////		System.out.println("______________________");
////		System.out.println(d.getFirstName());
////		System.out.println(d.getLastName());System.out.println(d.getGender());
////	}
////}
////
////
////
////
////
////
////
////////class Basic{
////////	public int id;
////////	public String name;
////////	public Basic(int id,String name)
////////	{
////////		this.id=id;
////////		this.name=name;
////////	}
////////	public Basic() {
////////		// TODO Auto-generated constructor stub
////////	}
////////	public void imp(Basic[] b)
////////	{
////////		for(Basic c:b)
////////		{
////////			System.out.println(c);
////////		}
////////	}
////////	public String toString() {
////////		return id+" "+name;
////////	}
////////}
////////public class Practice{
////////	
////////	public static void main(String[] args)
////////	{
////////		Basic a=new Basic();
////////		Basic[] b=new Basic[] {new Basic(10,"N"),new Basic(20,"Narenn"),new Basic(30,"Narennnnnn")};
//////////		b[0]=new Basic (10,"Naren");
//////////		b[1]=new Basic(20,"Narenn");
//////////		b[2]=new Basic(30,"Narennnnnn");
////////		a.imp(b);
////////	}
////////}
//////
////
////
////
////
//////import java.util.*;
//////public class Practice{
//////	public static void main(String[] args)
//////	{
//////		Book ba=new Book();
//////		Scanner sc=new Scanner(System.in);
//////		System.out.println("Enter the Book name:");
//////		String a=sc.nextLine();
//////		System.out.println("Enter the price:");
//////		int b=sc.nextInt();sc.nextLine();
//////		System.out.println("Enter the Author anme:");
//////		String c=sc.nextLine();
//////		ba.setBookName(a);
//////		ba.setBookPrice(b);
//////		ba.setAuthorName(c);
//////		System.out.println("Book Details");
//////		System.out.println("Book name: "+ba.getBookName());
//////		System.out.println("Book Price: "+ba.getBookPrice());
//////		System.out.println("Author Name: "+ba.getAuthorName());
//////	}
//////}
//////class Book{
//////	private String bookName;
//////	private int bookPrice;
//////	private String authorName;
//////	public String getBookName() {
//////		return bookName;
//////	}
//////	public void setBookName(String bookName) {
//////		this.bookName = bookName;
//////	}
//////	public int getBookPrice() {
//////		return bookPrice;
//////	}
//////	public void setBookPrice(int bookPrice) {
//////		this.bookPrice = bookPrice;
//////	}
//////	public String getAuthorName() {
//////		return authorName;
//////	}
//////	public void setAuthorName(String authorName) {
//////		this.authorName = authorName;
//////	}
//////	
//////}
////
////
////
////
////
////
////
////
//////import java.util.*;
//////public class Practice{
//////	public static Employee getEmployeeDetails()
//////	{
//////		Employee emp=new Employee();
//////		Scanner sc=new Scanner(System.in);
//////		System.out.println("Enter Id:");
//////		int a=sc.nextInt();sc.nextLine();
//////		emp.setEmployeeId(a);
//////		System.out.println("Enter Name:");
//////		String b=sc.nextLine();
//////		emp.setEmployeeName(b);
//////		System.out.println("Enter Salary:");
//////		int c=sc.nextInt();
//////		emp.setSalary(c);
//////		return emp;
//////	}
//////	public static int getPFPercentage()
//////	{
//////	Scanner sc=new Scanner(System.in);
//////	System.out.println("Enter the pf:");
//////	int p=sc.nextInt();
//////	return p;
//////	}
//////	public static void main(String[] args)
//////	{
//////		Employee e1=new Employee();
//////		e1=getEmployeeDetails();
//////		int pf=getPFPercentage();
//////		e1.calculateNetSalary(pf);
//////		System.out.println("Id:"+e1.getEmployeeId());
//////		System.out.println("Name"+e1.getEmployeeName());
//////		System.out.println("Salary"+e1.getSalary());
//////		System.out.println("Net Salary"+e1.getNetSalary());
//////	}
//////}
//////class Employee{
//////	private int employeeId;
//////	private String employeeName;
//////	private double salary;
//////	private double netSalary;
//////	public int getEmployeeId() {
//////		return employeeId;
//////	}
//////	public void setEmployeeId(int employeeId) {
//////		this.employeeId = employeeId;
//////	}
//////	public String getEmployeeName() {
//////		return employeeName;
//////	}
//////	public void setEmployeeName(String employeeName) {
//////		this.employeeName = employeeName;
//////	}
//////	public double getSalary() {
//////		return salary;
//////	}
//////	public void setSalary(double salary) {
//////		this.salary = salary;
//////	}
//////	public double getNetSalary() {
//////		return netSalary;
//////	}
//////	public void setNetSalary(double netSalary) {
//////		this.netSalary = netSalary;
//////	}
////	public void calculateNetSalary(int pfpercentage) {
////		netSalary=salary-(salary*(pfpercentage))/100;
////		setNetSalary(netSalary);
////	}
////	
////}
////
////
////
////
////
////
////
////
////
////
//////
//////import java.util.*;
//////public class Practice{
//////	public static void main(String args[])
//////	{
//////		Set<Student> se=new TreeSet<Student>(); //In hash duplicates allowed and the hash() and Equals() are called.
//////			se.add(new Student(1220,"Naren"));
//////			se.add(new Student(120,"Anush"));
//////			se.add(new Student(130,"Nare"));
//////			se.add(new Student(23330,"Anus"));
//////			se.add(new Student(10,"Nar"));
//////			se.add(new Student(20,"Anu"));
//////			se.add(new Student(10,"Nar"));
//////			se.add(new Student(20,"Anu"));
//////		Iterator ite=se.iterator();
//////			while(ite.hasNext())
//////			{
//////				System.out.println(ite.next());
//////			}
//////		}
//////	}
//////class Student implements Comparable<Student>{
//////	private int rollno;
//////	private String name;
//////	public Student(int rollno,String name) {
//////		this.rollno=rollno;
//////		this.name=name;
//////	}
//////	public int getRollno() {
//////		return rollno;
//////	}
//////	public void setRollno(int rollno) {
//////		this.rollno = rollno;
//////	}
//////	public String getName() {
//////		return name;
//////	}
//////	public void setName(String name) {
//////		this.name = name;
//////	}
//////	@Override
//////	public String toString() {
//////		return rollno + " : " + name;
//////	}
//////	@Override
//////	public int compareTo(Student s) {
////////		if(this.rollno<s.rollno) 
////////			return -1;
////////			else if(this.rollno==s.rollno)
////////			 return 0;
////////			else
////////			 return 1;
//////		return this.name.compareTo(s.name);
//////	}
//////	@Override
//////	public int hashCode() {
//////		
//////		return this.rollno;
//////	}
//////	@Override
//////	public boolean equals(Object o) {
//////		System.out.println("Equals");
//////		if(o instanceof Student)
//////		{
//////		Student s=(Student) o;
//////		if(this.rollno==s.rollno && this.name.equalsIgnoreCase(s.name))
//////			return true;
//////		}
//////		return false;
//////	}
//////}
//////class Collec
//////{
//////	private String product;
//////	public Collec(String product) {
//////		this.product=product;
//////	}
//////	public String toString()
//////	{
//////		return product;
//////	}
//////}
////
////
////
////
//////public class Practice{
//////	public static void main(String[] args)
//////	{
//////		ArrayList list=new ArrayList();
//////		list.add("Processor");
//////		list.add("MotherBoard");
//////		list.add("HardDisk");
//////		list.add("Coolers");
//////		list.add("Graphic card");
//////		Collections.sort(list);
//////		list.forEach(str-> System.out.println(str));//Using For Each
//////	/*	for(int i=0;i<list.size();i++) {
//////			Object o=list.get(i);
//////			System.out.println(o);
//////		} Used For the purpose of displaying the list */	
//////		}
//////}
////
////
////
////
////
////
////
////
////
////
//////import java.util.Arrays;  
//////public class Practice 
//////{  
//////public static void main(String args[])   
//////{   
//////String[] products = new String[5];
//////products[0]="Processor";
//////products[1]="MotherBoard";
//////products[2]="HardDisk";
//////products[3]="Coolers";
//////products[4]="Graphic Card"; 
//////Arrays.sort(products);   
//////System.out.println(Arrays.toString(products));  
//////}  
//////}
////
////
////
////
////
////import java.util.*;
////import java.util.*;
////
////
////
////
////
////
////
////
////
////
////
////
//////import java.util.*;
//////
//////public class Practice {
//////	public static void main(String[] args) {
////////	    Scanner sc=new Scanner(System.in);
//////		String n = "Cognizant Technologies Solution";
//////		String[] d = n.split(" ");
//////		int len = d.length;
//////		for (int i = 0; i < len; i++) {
//////			String n1 = d[i];
//////			String n4 = n1.substring(0, 1);
//////			System.out.print(n4);
//////
//////		}
//////
//////	}
//////
//////}
////
////
////
////
////
//////import java.time.LocalDate;
//////import java.time.LocalDateTime;
//////import java.time.Month;
//////import java.time.Period;
//////import java.time.format.DateTimeFormatter;
//////public class Practice {
//////	public static void main(String[] args) {
//////		LocalDate curdate=LocalDate.now();
//////		System.out.println("Tomorrow:"+curdate.plusMonths(12));
//////	}
//////}
//
//
//
//
//
//
//
//
//import java.util.Scanner;
//public class Practice {
//	public static String concat(String str)
//	{
//		String res= str+str;
//		return res;
//	}//concat
//	public static String oddHash(String str)
//	{
//		for(int i=0;i<=str.length();i++)
//		{
//			if(i%2!=0)
//			{
//				str = str.substring(0,i-1) + "#" + str.substring(i, str.length());
//			}
//		}
//		return str;
//	}//oddHash
//	
//	public static String duplicate(String str)
//	{
//		String res="";
//		
//		for(int i=0; i<str.length();i++)
//		{
//			if(i+1<str.length() && str.charAt(i)!=str.charAt(i+1))
//			{
//				res=res+str.charAt(i);
//			}
//			if(i+1==str.length())
//			{
//				res=res+str.charAt(i);
//			}
//		}
//
//		return res;
//	}//duplicate
//	
//	public static String oddUpper(String str)
//	{
//		str=str.toLowerCase();
//		String res="";
//		for(int i=0;i<str.length();i++)
//		{
//			if(i%2==0)
//			{
//				res=res+Character.toLowerCase(str.toCharArray()[i]);
//			}
//			else
//			{
//				res=res+Character.toUpperCase(str.toCharArray()[i]);
//			}
//		}
//		return res;
//	}//oddUpper
//	
//	public static void main(String[] args) {
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter String: ");
//		String str= sc.nextLine();
//		
//		System.out.println("Enter operation to perform:");
//		System.out.println("\n1. Add string to itself\n2. Replace odd positions with #");
//		System.out.println("3. Remove duplicate characters in the String\n4. Change odd characters to upper case");
//		
//		int ch=sc.nextInt();
//		switch(ch)
//		{
//		case 1: 
//			System.out.println(concat(str));
//		break;
//		case 2: System.out.println(oddHash(str));
//		break;
//		case 3: System.out.println(duplicate(str));
//		break;	
//		case 4: System.out.println(oddUpper(str));
//		break;
//		}//switch
//	}
//
//}

//class Account {
//
//	private long accNum;
//	private Person accHolder;
//	private double balance;
//	
//	
//	public Account(long accNum, Person accHolder, double balance) {
//		super();
//		this.accNum = accNum;
//		this.accHolder = accHolder;
//		this.balance = balance;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//	
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//	
//	public void setPerson(Person accHolder) {
//		this.accHolder = accHolder;
//	}
//	
//	public Person getPerson() {
//		return accHolder;
//	}
//	
//	public long getAccNum() {
//		return accNum;
//	}
//	public void setAccNum(long accNum) {
//		this.accNum = accNum;
//	}
//	
//	public void deposit(double amt) {
//		if(amt>0){
//			balance+=amt;
//			setBalance(balance);
//	}
//	}
//	
//	public void withdraw(double amt) {
//		if(balance>0 && amt<=balance){
//			balance-=amt;
//		    setBalance(balance);
//		}
//	}
//	
//	
//}
//
//class SavingsAccount extends Account {
//	private final double minBalance=300;
//	
//	
//	public SavingsAccount(long accNum, Person accHolder, double balance) {
//		super(accNum, accHolder, balance);
//		
//	}
//	public void withdraw(double amt) {
//		
//		double bal=getBalance();
//		double res=bal-amt;
//		if(res<minBalance) 
//			System.out.println("Insufficient Balance...");
//		else
//			setBalance(res);
//			
//		}
//}
//class Person{
//	private String name;
//	private float age;
//	
//	
//	public Person(String name, float age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//	public float getAge() {
//		return age;
//	}
//	public void setAge(float age) {
//		this.age = age;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//	
//
//}
//public class Practice{
//	public static void main(String[] args) {
//        Person p1 =new Person("Smith",21);
//        Person p2 =new Person("Kathy",21);
//		 SavingsAccount obj1=new SavingsAccount(100,p1,20000);
//	     SavingsAccount obj2=new SavingsAccount(101,p2,30000);
//        obj1.deposit(20);
//        obj2.withdraw(3000);
//        System.out.println(obj2.getBalance());
//     
//	}
//}

//import java.util.*;
//class Ticket{
//	int ticketid;
//	int price;
//	static int availableTickets;
//	public void setTicketid(int ticketid) {
//		this.ticketid=ticketid;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public static int getAvailableTickets() {
//		return availableTickets;
//	}
//	public static void setAvailableTickets(int availableTickets) {
//		if(availableTickets>0)
//		Ticket.availableTickets = availableTickets;
//	}
//	public int getTicketid() {
//		return ticketid;
//	}
//	public int calculateTicketCost(int nooftickets) {
//		int amount = 0;
//		if(nooftickets<availableTickets) {
//			availableTickets=availableTickets-nooftickets;
//			amount=nooftickets*price;	
//			return amount;
//		}
//		else {
//			return -1;
//		}
//	}
//}
//public class Practice{
//	public static void main(String[] args) {
//		Ticket t=new Ticket();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the no of bookings");
//		int a=sc.nextInt();
//		for(int i=0;i<a;i++) {
//		System.out.println("Enter the available tickets:");
//		int b=sc.nextInt();
//		t.setAvailableTickets(b);
//		System.out.println("Enter the ticket id");
//		int c=sc.nextInt();
//		t.setTicketid(c);
//		System.out.println("Enter the price:");
//		int d=sc.nextInt();
//		t.setPrice(d);
//		System.out.println("Enter the no of tickets:");
//		int e=sc.nextInt();
//		System.out.println("Available tickets: "+t.getAvailableTickets());
//		System.out.println("Total amount:"+t.calculateTicketCost(e));
//		System.out.println("Avaiable ticket after booking: "+t.getAvailableTickets());
//		}
//	}
//}

//public class Practice{
//	public static String dopractice() {
//		try {
//			int[] a= {10,20,30,4};
//		    int c=7;
//		    System.out.println(a[c]);
//			
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Out of Bounds");
//		}
//		return "";
//	}
//	public static void main(String[] args)
//	{
//		String c=dopractice();
//		System.out.println(c);
//	}
//}

//import java.util.InputMismatchException;
//public class Practice{
//	public String doDivision(int a,int b) {
//		try {
//			int c=a/b;
//			return (c+" is the answer");
//		}
//		catch(ArithmeticException e) {
//			return("Divide by Zero exxxception");
//		}
//		catch(InputMismatchException e1) {
//			return("Inpute error");
//		}
//		
//		
//	}
//	public static void main(String[] args)
//	{
//		Practice pr=new Practice();
//		String ans=pr.doDivision(10, 5);
//		System.out.println(ans);
//	}
//}

//import java.util.*;
//public class Practice{
//	public static void main(String[] args)
//	{
//		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(10,20,30));
//		System.out.println(list);
//		Set set=new HashSet();
//		set.add("Naren");
//		System.out.println(set);
//		Map<Integer,String> map=new HashMap<>();
//		map.put(1, "naren");
//		map.put(2, "Mahi");
//		Set ma=map.keySet();
//		Iterator it=ma.iterator();
//		while(it.hasNext()) {
//			Object key=it.next();
//			Object value=map.get(key);
//			System.out.print(key+" "+map );
//		}
//	}
//}



//import java.util.*;
//import java.util.regex.*;
//public class Practice{
//	static boolean isValid(String email) {
//	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
//	      return email.matches(regex);
//	   }
//	   public static void main(String[] args) {
//	      String email = "Narendran275@gmail.com";
//	      System.out.println("The E-mail ID is: " + email);
//	      System.out.println("Is the above E-mail ID valid? " + isValid(email));
//	   }
//	}

//class Email {
//	private String from;
//	private String to;
//	private String subject;
//	private String body;
//
//	public String getFrom() {
//		return from;
//	}
//
//	public void setFrom(String from) {
//		this.from = from;
//	}
//
//	public String getTo() {
//		return to;
//	}
//
//	public void setTo(String to) {
//		this.to = to;
//	}
//
//	public String getSubject() {
//		return subject;
//	}
//
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
//
//	public String getBody() {
//		return body;
//	}
//
//	public void setBody(String body) {
//		this.body = body;
//	}
//
//	@Override
//	public String toString() {
//		return "Email [from=" + from + ", to=" + to + ", subject=" + subject + ", body=" + body + "]";
//	}
//}
//class Sender <T>{
//private T message;
//
//public T getMessage() {
//	return message;
//}
//
//public void setMessage(T message) {
//	this.message = message;
//}
//public void sendMessage()
//{
//	System.out.println("Message Type: "+getMessage().getClass());
//	System.out.println("Contents are:"+getMessage());
//}
//}
//
//
//public class Practice{
//	public static void main(String[] args) {
//	Sender<String> s1=new Sender<>();
//	s1.setMessage("Message da!!!!!!!");
////	System.out.println(s1.getMessage());
//	s1.sendMessage();
//	Email myEmail = new Email();
//    myEmail.setFrom("test@igate.com");
//    myEmail.setTo("admin@igate.com");
//    myEmail.setSubject("Need to block cafeteria for personal event");
//    myEmail.setBody("To celebrate IGATE birthday!");
//	Sender<Email> s2=new Sender<>();
//	s2.setMessage(myEmail);
////	System.out.println(s2.getMessage());
//	s2.sendMessage();
//	}
//}







//
//
//import java.util.*;
//public class Practice {
//
//	public static void main(String[] args) {
//
//		String str = "The first second was alright but the second second was tough.";
//
//		System.out.println("Original String: ");
//		System.out.println(str);
//
//		/*
//		 * Since the words are separated by space, we will split the string by one or
//		 * more space
//		 */
//
//		String[] strWords = str.split(" ");
//
//		// convert String array to LinkedHashSet to remove duplicates
//		LinkedHashSet<String> lhSetWords = new LinkedHashSet<String>(Arrays.asList(strWords));
//
//		// join the words again by space
//		StringBuilder sbTemp = new StringBuilder();
//		int index = 0;
//
//		for (String s : lhSetWords) {
//
//			if (index > 0)
//				sbTemp.append(" ");
//
//			sbTemp.append(s);
//			index++;
//		}
//
//		str = sbTemp.toString();
//
//		System.out.println("String after removing duplicate words: ");
//		System.out.println(str);
//
//	}
//}






//
//public class Practice{
//	public static void main(String[] args) {
//		String str="HII";
//		StringBuffer sb=new StringBuffer(str);
//		sb.reverse();
//		String str1=sb.toString();
//		System.out.println(str1);
//	}
//	
//}






/*Duplicate Words in a String*/




//import java.util.*;
//public class Practice{
//	public static void main(String[] args) {
//		String str="Naren Naren is a Engineer is .";
//		String[] s=str.split(" ");
//		System.out.println(str);
//		LinkedHashSet<String> l=new LinkedHashSet<String>(Arrays.asList(s));
//		StringBuffer sb=new StringBuffer();
//		int i=0;
//		for(String si : l)
//		{
//			if(i>=0)
//			{
//				sb.append(" ");
//				sb.append(si);
//				i++;
//			}
//		}
//		String ans=sb.toString();
//		System.out.println(ans);
//	}
//}




public class Practice{
	public static void main(String[] args)
	{
		String s="Hii How are youuuuu";
	}
}