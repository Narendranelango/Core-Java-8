import java.util.*;
public class Factorial
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int fact=1,sum=0,check=0;
        System.out.println("Enter the elements:");
        int a[]=new int[size];
        int item;
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
            item=a[i];
            if(item>0 && item%10==item)
            {
                check=1;
                for(int j=1;j<=item;j++)
                fact=fact*j;
                //System.out.println(fact);
                sum=sum+fact;
            }
            //sum=sum+fact;
            fact=1;
        }
        if(check==0)
        System.out.println("No positive and single digit numbers found in an array");
        else
        System.out.println(sum);
    }
}