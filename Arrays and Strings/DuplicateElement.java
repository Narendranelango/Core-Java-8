import java.util.*;
public class DuplicateElement
{
    public static void main (String[] args) {
        /* code */
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array:");
    int size=sc.nextInt();
    //int a[]=new int[size+1];
    if(size>0)
    {
        int a[]=new int[size+1];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the position of the element to be replicated:");
        int pos=sc.nextInt();
        if(pos>=size)
        {
            System.out.println("Position is greater than the size of an array");
            System.exit(0);
        }
        else
        {
            a[size]=a[pos];
            for(int i=0;i<=size;i++)
            System.out.println(a[i]);
        }
    }
    else
    {
        System.out.println("Invalid array size");
        System.exit(0);
    }
        
    }
}