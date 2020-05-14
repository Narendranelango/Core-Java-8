import java.util.*;
public class Sum
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        if(size>0)
        {
            System.out.println("Enter the elements:");
            int a[]=new int[size];
            for(int i=0;i<size;i++)
            a[i]=sc.nextInt();
            int max=a[0],min=a[0];
            for(int i=1;i<size;i++)
            {
                if(max<a[i])
                {
                    max=a[i];
                }
                else if(min>a[i])
                {
                    min=a[i];
                }
            }
            System.out.println(max+min);
        }
        else
        {
            System.out.println("Invalid Array Size");
        }
    }
}