import java.util.*;
public class Highestmark
{
    public static void main (String[] args) {
        /* code */
    
        Scanner sc = new Scanner(System.in);
        int marks[]=new int[6];
        for(int i=0;i<6;i++)
        {
            marks[i]=sc.nextInt();
            if(marks[i]<0)
            {
                System.out.println("Invalid Mark");
                System.exit(0);
            }
        }
        int max=marks[0];
        for(int i=1;i<6;i++)
        {
            if(max<marks[i])
            max=marks[i];
        }
        System.out.println("Highest mark is "+max);
        
    }
}