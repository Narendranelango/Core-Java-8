import java.util.*;
public class PanCard
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String pan;
        int invalid=0;
        System.out.println("Enter the PAN no:");
        pan=sc.nextLine();
        if(pan.length()==10)
        {
            for(int i=0;i<5;i++)
            {
                if(pan.charAt(i)<65 || pan.charAt(i)>90)
                {
                    invalid=1;
                    break;
                }
            }
            if(invalid==0)
            {
                for(int i=5;i<=8;i++)
                {
                    if(pan.charAt(i)<48 || pan.charAt(i)>57)
                    {
                        invalid=1;
                        break;
                    }
                }
                if(invalid == 0 && pan.charAt(9)>=65 && pan.charAt(9)<=90)
                System.out.println("Valid PAN no");
                else
                System.out.println("Invalid PAN no");
            }
            else
            System.out.println("Invalid PAN no");
            
        }
        else
        System.out.println("Invalid PAN no");
    }
}