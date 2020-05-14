import java.util.*;
public class EvenNumber
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        String digit="";
        int count=0;
        if(size>0)
        {
            System.out.println("Enter the array elements:");
            int arr[]=new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]%10==arr[i] && arr[i]%2==0)
                {
                    count++;
                    digit=digit+arr[i];
                }
            }
            if(count==0)
            System.out.println("Single digit even number is not found in the array");
            else
            System.out.println(digit);
        }
        else
        System.out.println("Invalid array size");
    }
}