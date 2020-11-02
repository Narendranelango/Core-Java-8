package Lseven;
import java.util.*;
class Employee implements Comparable<Employee>{
	private int id;
	private float salary;
	private String name;
	private String designation;
	private String insuranceScheme;
	public Employee(int id, float salary, String name, String designation,String insuranceScheme) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
		this.insuranceScheme=insuranceScheme;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", designation=" + designation + ", insuranceScheme=" + insuranceScheme + "]";
	}
	@Override
	public int compareTo(Employee e) {
		if(this.salary<e.salary)
			return -1;
		else if(this.salary==e.salary)
			return 0;
		else
			return 1;
	}
}
class EmployeeServiceImpl {
	Map<Employee,String> map =new TreeMap<Employee,String> ();
	
	public Map<Employee, String> getMap() {
		return map;
	}
	public void setMap(Map<Employee, String> map) {
		this.map = map;
	}
	
	public void addEmployee(Employee e,String dummy) {
		map.put(e, dummy);
	}
	public Employee findEmployee(String insurance) 
	{
		for(Map.Entry<Employee, String> emp :map.entrySet()) 
		{
			Employee e=emp.getKey();
			if((e.getInsuranceScheme()).equalsIgnoreCase(insurance))
				return e;
		}
		return null;
	}
	public boolean deleteEmployee(int id) {
		for(Map.Entry<Employee, String> emp :map.entrySet()) 
		{
			Employee e=emp.getKey();
			if(e.getId()==id) 
				{
				map.remove(e);
				return true;
				}		
		}
		return false;
	}		
}
public class ServiceMain{
	public static void main(String args[]) {
		EmployeeServiceImpl eso =new EmployeeServiceImpl();
		// hard coding sample list of employees...
		Employee e1=new Employee(1,10000,"Natasha","System Associate","Scheme C");
		Employee e2=new Employee(2,20000,"Peggy Carter","Programmer","Scheme B");
		Employee e3=new Employee(3,45000,"Bruce","Manager","Scheme A");
		Employee e4=new Employee(4,5000,"Steve","Clerk","No Scheme");
		//Adding the employees into treemap.. key=Employee, value=dummy string
		eso.addEmployee(e1, "#");
		eso.addEmployee(e2, "#");
		eso.addEmployee(e3, "#");
		eso.addEmployee(e4, "#");
		System.out.println("Enter Insurance Scheme to find Employee details :");
		String insuranceScheme=new Scanner(System.in).nextLine();
		Employee emp= eso.findEmployee(insuranceScheme);
		System.out.println("Employee Details :"+emp+"\n");
		System.out.println("Enter employee id to delete employee details :");
		int id=new Scanner(System.in).nextInt();
		boolean isDeleted =eso.deleteEmployee(id);
		if(isDeleted)
			System.out.println("Employee deleted successfully\n");
		else
			System.out.println("Employee not deleted .. Id not found\n");
		System.out.println("Employee Details\n");
		Map<Employee,String> map=eso.getMap();
		for(Map.Entry<Employee, String> empl :map.entrySet()) 
		{
			Employee e=empl.getKey();
			System.out.println("Employee ID :"+e.getId());
			System.out.println("Employee Name :"+e.getName());
			System.out.println("Employee Salary :"+e.getSalary());
			System.out.println("Employee Designation :"+e.getDesignation());
			System.out.println("Employee InsuranceScheme :"+e.getInsuranceScheme());
			System.out.println("\n");
		}
	}
}