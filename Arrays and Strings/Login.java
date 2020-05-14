import java.util.*;
public class Login
{
    private String userName,password;
    public Login(String name,String pwd)
    {
        userName=name;
        password=pwd;
    }
    public String getUserName()
    {
        return userName;
    }
    public String getPassword()
    {
        return password;
    }
    public boolean validate()
    {
        if(userName.equals("john") && password.equals("123abc"))
        return true;
        else
        return false;
    }
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username:");
        String name=sc.nextLine();
        System.out.println("Enter the password:");
        String pwd=sc.nextLine();
        Login obj=new Login(name,pwd);
        if(obj.validate())
        System.out.println("Valid user");
        else
        System.out.println("Invalid user");
    }
}