import java.util.*;
public class Count
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        String name1=name.toLowerCase();
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if((name1.charAt(i)>='a' && name1.charAt(i)<='z') || name1.charAt(i)==' ')
            {
                count++;
            }
            else
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
        System.out.println(name+" has "+count+" characters");
    }
}