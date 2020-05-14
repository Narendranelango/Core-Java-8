import java.util.*;
class RegistrationDetails{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your phoneno:");
        String no=sc.next();
        System.out.println("Enter your qualification:");
        sc.nextLine();
        String qualification=sc.nextLine();
        System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        String mailid=sc.nextLine();
        System.out.println("Enter your noofexperience[if any]:");
        float experience=sc.nextFloat();
        System.out.println("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+mailid+" within 2 working days");
    }
    
    
    
}