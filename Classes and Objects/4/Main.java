import java.util.*;
public class Main
{
    public static Employee getEmployeeDetails()
    {
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();
        System.out.println("Enter Id:");
        int empId=sc.nextInt();
        obj.setEmployeeId(empId);
        sc.nextLine();
        System.out.println("Enter name:");
        String empName=sc.nextLine();
        obj.setEmployeeName(empName);
        System.out.println("Enter salary:");
        double salary=sc.nextDouble();
        obj.setSalary(salary);
        return obj;
    }
    public static int getPFPercentage()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        int pf=sc.nextInt();
        return pf;
    }
    public static void main (String[] args) {
        Employee empObj = new Employee();
        empObj=getEmployeeDetails();
        int pf1=getPFPercentage();
        empObj.calculateNetSalary(pf1);
        System.out.println("Id : "+empObj.getEmployeeId());
        System.out.println("Name : "+empObj.getEmployeeName());
        System.out.printf("Salary : %.1f\n",empObj.getSalary());
        System.out.printf("Net Salary : %.1f",empObj.getNetSalary());
        
    }
    
}