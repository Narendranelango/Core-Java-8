import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name:");
        String a=s.nextLine();
        System.out.println("Enter the panno:");
        s.next();
        String b=s.nextLine();
        System.out.println("Enter the emailid:");
        s.next();
        String e=s.nextLine();
        System.out.println("Enter the salary:");
        //s.next();
        int c=s.nextInt();
        System.out.println("Enter the name:");
        s.nextLine();
        String d=s.nextLine();
        System.out.println("Enter the panno:");
        s.next();
        String f=s.nextLine();
        System.out.println("Enter the emailid:");
        s.next();
        String g=s.nextLine();
        System.out.println("Enter the salary:");
        int h=s.nextInt();
        Customer a1=new Customer(a,b,e,c);
        //a1.setName(a);
        //a1.setPanno(b);
        //a1.setEmailid(e);
        //a1.setSalary(c);
        Customer a2=new Customer(d,f,g,h);
        //a2.setName(d);
        //a2.setPanno(f);
        //a2.setEmailid(g);
        //a2.setSalary(h);
        boolean a3=true;
        a3=a1.equals(a2);
        if (a3==true)
        System.out.println("Both the objects are equal.");
        else
        System.out.println("Both the objects are not equal.");
    }
}