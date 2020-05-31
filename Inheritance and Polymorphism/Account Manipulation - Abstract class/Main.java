import java.util.Scanner;
public class Main{
public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();//account number
        int a2=s.nextInt();//customer id
        String b2=s.nextLine();//customer name
        s.nextLine();
        String c2=s.nextLine();//emailid
        Customer c=new Customer(a2,b2,c2);
        System.out.println("balance");
        double b=s.nextDouble();//balance
        System.out.println("min");
        double d=s.nextDouble();//minimum balance
        System.out.println("amount");
        double f=s.nextDouble();//amount
        SavingsAccount a1=new SavingsAccount(a,c,b,d);
        boolean e=a1.withdraw(f);
        if(e==true)
        System.out.println("withdraw successful");
        else
        System.out.println("failed");
    }
}