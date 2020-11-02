
//class Student implements Comparable<Student>
//{
//	private int rollno;
//	private String name;
//	public Student(int rollno, String name) {
//		this.rollno = rollno;
//		this.name = name;
//	}
//	@Override
//	public int hashCode() {
//		System.out.println("Inside Hash Code");
//		return this.rollno;
//	}
//	@Override
//	public boolean equals(Object obj) {
//        System.out.println("Inside equals()");
//        if (obj instanceof Student)
//        {
//            Student s= (Student)obj;
//            if(this.rollno==s.rollno && this.name.equals(s.name) )
//            {
//                return true;
//            }
//        }
//        return false;
//    }													 																		
//	@Override
//	public String toString()
//	{
//		return rollno+" "+name;
//	}
//	
//	@Override
//	public int compareTo(Student s) {
//		// TODO Auto-generated method stub
//		
//	
//	if(this.rollno<s.rollno)
//	{
//		return -1;
//	}
//	else if(this.rollno==s.rollno)
//	{
//		return 0;
//	}
//	else
//	{
//		return 1;
//	}
//	//return this.name.compareTo(s.name);
//}
//}
//public class CollectionDemo {
//	public void testSets()
//	{
//		Set<Student> set=new TreeSet<>();
//		set.add(new Student(10,"Han"));//returns 10 in hashcode()
//		set.add(new Student(11,"Rob"));//returns 11 in hashcode()
//		set.add(new Student(9,"Eric"));//returns 12 in hashcode()
//		set.add(new Student(13,"Ban"));//returns 13 in hashcode()
////		set.add(new Student(10,"Naren"));//returns 10 in hashcode()
////		set.add(new Student(10,"Naren"));//	returns 10 in hashcode()	
////		set.add(10);//primitive 10 is converted into object of wrapper class Integer.java 
////		set.add(new Integer(100));
////		set.add(4);//autoboxing
////	set.add(new Integer(4));
////	set.add(new Integer(4));
////	set.add(new Integer(5));
////		set.add(1);
//		Iterator it=set.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//	}
//	public void testList() {
//		List list=new Vector();//list is a interface and arraylist is a class.
//		list.add(10);
//		list.add("Naren");
//		list.add(new Object());
//		list.add(5);
//		for(int i=0;i<list.size();i++)
//		{
//			Object obj=list.get(i);	
//			System.out.println(obj);
//			}
//		System.out.println("__________________");
//		Iterator iter=list.iterator();//
//		while(iter.hasNext())
//		{
//			Object obj=iter.next();
//			System.out.println(obj);
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CollectionDemo demo = new CollectionDemo();
//		//demo.testList();
//		demo.testSets();
//		int x=5;
//		Integer i=new Integer("5");
//		float z=i.floatValue();
//		String str="123";
//		int sj=Integer.parseInt(str);
////		System.out.println(sj);
//	}
//}
/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;*/
import java.util.*;

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		return s1.getName().compareTo(s2.getName());
	}

}

class Student // implements Comparable<Student>
{
	private int rollno;
	private String name;

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals()");
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.rollno == s.rollno && this.name.equalsIgnoreCase(s.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Inside hashCode()");
		return this.rollno;
	}

	@Override
	public String toString() {

		return rollno + ": " + name;
	}

	/*
	 * @Override public int compareTo(Object arg0) {
	 * 
	 * return 0; }
	 */

	// @Override
	public int compareTo(Student s) {
		/*
		 * if(this.rollno<s.rollno) { return 1; } else if(this.rollno==s.rollno) {
		 * return 0; } else { return -1; }
		 */
		return this.name.compareTo(s.name);

	}

}// class Student

public class CollectionDemo {
	public void testMap() {
		Map<Student,Integer> map=new TreeMap(new StudentComparator());
		map.put(new Student(10,"Erics"),10);map.put(new Student(100,"Ericss"),11);map.put(new Student(1000,"Ericsss"),12);
		map.put(new Student(10000,"Ericssss"),10);
		Set set= map.keySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+" "+value);
		}
	}
	public void testSets() {
		Set<Student> set = new TreeSet<>(new StudentComparator());
		// Student s1=new Student(10,"Han");

		set.add(new Student(12, "Eric"));// returns 12 in hashCode()
		set.add(new Student(10, "Han"));// returns 10 in hashCode()
		set.add(new Student(11, "Rob"));// returns 11 in hashCode()

		/*
		 * set.add(new Student(10,"rOb")); set.add(new Student(10,"RoB")); set.add(new
		 * Student(10,"ROB")); set.add(new Student(10,"roB"));//returns 10 in hashCode()
		 */

		// set.add(10); // primitive 10 is converted into object of wrapper class
		// Integer.java automatically
		// set.add(55);// autoboxing

		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public void testLists() {
		List list = new Vector(); // Pet p=new Dog();

		list.add(5);
		list.add(8);
		list.add(6);
		// list.add(new Object());
		list.add(10);

		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println("_________________________");
		Iterator iter = list.iterator();

		while (iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);

		}

	}

	public static void main(String[] args) {

		CollectionDemo demo = new CollectionDemo();
		// demo.testLists();
		//demo.testSets();
		demo.testMap();

		/*
		 * int x=5; //primitive Integer i=new Integer("5"); int y=i.intValue(); float
		 * z=i.floatValue(); String str="123.5"; float sj=Float.parseFloat(str);
		 * System.out.println(sj);
		 */
	}

}

