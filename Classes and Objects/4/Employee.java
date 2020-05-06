import java.util.*;
public class Employee
{
    private int employeeId;
    private String employeeName;
    private double salary,netSalary;
    public void setEmployeeId(int employeeId)
    {
        this.employeeId=employeeId;
    }
    public void setEmployeeName(String employeeName)
    {
        this.employeeName=employeeName;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public void calculateNetSalary(int pfpercentage)
    {
        setNetSalary(salary-(pfpercentage*salary/100.0));
    }
    public void setNetSalary(double netSalary)
    {
        this.netSalary=netSalary;
    }
    public int getEmployeeId()
    {
        return employeeId;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public double getSalary()
    {
        return  salary;
    }
    public double getNetSalary()
    {
        return netSalary;
    }
}