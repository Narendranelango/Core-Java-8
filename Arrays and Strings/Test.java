import java.util.*;
public class Test
{
    static int num;
    static int calculateAverage(int[] age)
    {
        int sum=0;
        for(int i=0;i<num;i++)
        sum=sum+age[i];
        return sum;
    }
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        num=sc.nextInt();
        if(num>=2)
        {
            int age[]=new int[num];
            System.out.println("Enter the age for "+num+" employees:");
            for(int i=0;i<num;i++)
            {
                age[i]=sc.nextInt();
                if(age[i]<28 || age[i]>40)
                {
                    System.out.println("Invalid age encountered!");
                    System.exit(0);
                }
            }
            System.out.printf("The average age is %.2f",(double)calculateAverage(age)/num);
        }
        else
        System.out.println("Please enter a valid employee count");
    }
}