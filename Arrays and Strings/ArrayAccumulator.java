import java.util.*;
public class ArrayAccumulator
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int first[]=new int[100];
        int second[]=new int[100];
        //int third[]=new int[100];
        System.out.println("Enter the size of first array:");
        int size1=sc.nextInt();
        if(size1>0)
        {
            System.out.println("Enter elements for first array:");
            for(int i=0;i<size1;i++)
            first[i]=sc.nextInt();
        }
        else
        {
            System.out.println("Invalid array size");
            System.exit(0);
        }
        System.out.println("Enter the size of second array:");
        int size2=sc.nextInt();
        if(size2>0)
        {
            System.out.println("Enter elements for second array:");
            for(int i=0;i<size2;i++)
            second[i]=sc.nextInt();
        }
        else
        {
            System.out.println("Invalid array size");
            System.exit(0);
        }
        int size,k=0;
        if(size1<=size2)
        size=size1;
        else
        size=size2;
        int s=size2-size;
        int f=size1-size;
        for(int i=0;i<size;i++)
        {
            System.out.println(first[i]+second[i]);k++;
        }
        if(s>0)
        {
            for(int i=0;i<s;i++){
            System.out.println(second[k]);k++;}
        }
        if(f>0)
        {
            for(int i=0;i<f;i++){
            System.out.println(first[k]);k++;}
        }
        
    }
    
}