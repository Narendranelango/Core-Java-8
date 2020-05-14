import java.util.*;
class IncomeCal{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of hours worked in a day");
        int hrs=sc.nextInt();
        if(hrs<0||hrs>24)
        {
            System.out.println("Unable to calculate the earnings");
        }
        else{
            int total=365*hrs*100;
            System.out.println("Total income in a year:"+total);
        }
    }
}