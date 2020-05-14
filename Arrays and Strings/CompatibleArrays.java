import java.util.*;
public class CompatibleArrays
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1[]=new int[100];
        int a2[]=new int[100];
        System.out.println("Enter the size for First array:");
        int size1=sc.nextInt();
        if(size1>0)
        {
            System.out.println("Enter the elements for First array:");
            for(int i=0;i<size1;i++)
            a1[i]=sc.nextInt();
        }
        else
        {
            System.out.println("Invalid array size");
            System.exit(0);
        }
        System.out.println("Enter the size for Second array:");
        int size2=sc.nextInt();
        if(size2>0)
        {
            System.out.println("Enter the elements for Second array:");
            for(int i=0;i<size2;i++)
            a2[i]=sc.nextInt();
        }
        else
        {
            System.out.println("Invalid array size");
            System.exit(0);
        }
        int notCompatible=0;
        if(size1==size2)
        {
            for(int i=0;i<size1;i++)
            {
                if(a1[i]<a2[i])
                {
                    notCompatible=1;
                    break;
                }
            }
            if(notCompatible==0)
            System.out.println("Arrays are Compatible");
            else
            System.out.println("Arrays are Not Compatible");
        }
        else
        System.out.println("Arrays are Not Compatible");
    }
}