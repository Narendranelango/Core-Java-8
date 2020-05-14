import java.util.*;
public class CumulativeSum
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[20];
        int sumarr[]=new int[20];
        int sum=0;
        System.out.println("Enter the number of elements");
        int size=sc.nextInt();
        if(size>0)
        {
            System.out.println("Enter the elements");
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
                sum=sum+arr[i];
                sumarr[i]=sum;
            }
            for(int i=0;i<size;i++)
            System.out.print(sumarr[i]+" ");
        }
        else
        System.out.println("Invalid Range");
    }
}