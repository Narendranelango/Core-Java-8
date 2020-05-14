import java.util.*;
public class InterchangeArray
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int array1[]=new int[20];
        int array2[]=new int[20];
        int temp;
        System.out.println("Enter the number of elements in the first array :");
        int num1=sc.nextInt();
        if(num1<=0)
        {
            System.out.println("Invalid range");
            System.exit(0);
        }
        System.out.println("Enter the elements in the first array");
        for(int i=0;i<num1;i++)
        array1[i]=sc.nextInt();
        System.out.println("Enter the number of elements in the second array :");
        int num2=sc.nextInt();
        if(num2<=0)
        {
            System.out.println("Invalid range");
            System.exit(0);
        }
        else if(num2!=num1)
        {
            System.out.println("Unable to swap size differs");
            System.exit(0);
        }
        else
        {
            System.out.println("Enter the elements in the second array :");
            for(int i=0;i<num2;i++)
            array2[i]=sc.nextInt();
        }
        for(int i=0;i<num1;i++)
        {
            temp=array1[i];
            array1[i]=array2[i];
            array2[i]=temp;
        }
        System.out.println("The first array after swapping is :");
        for(int i=0;i<num1;i++)
        System.out.print(array1[i]+" ");
        System.out.println("\nThe second array after swapping is :");
        for(int i=0;i<num1;i++)
        System.out.print(array2[i]+" ");
    }
    
}