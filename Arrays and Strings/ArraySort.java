import java.util.*;
public class ArraySort{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int len1,len2,i,j,temp;
        if(size%2==0)
        len1=size/2;
        else
        len1=(size/2)+1;
        len2=size-len1;
        if(size>0)
        {
            System.out.println("Enter the elements:");
            int first[]=new int[len1];
            int second[]=new int[len2];
            for(i=0;i<len1;i++)
            first[i]=sc.nextInt();
            for(i=0;i<len2;i++)
            second[i]=sc.nextInt();
            for(i=0;i<(len1-1);i++)
            {
                for(j=0;j<(len1-1-i);j++)
                {
                    if(first[j]>first[j+1])
                    {
                        temp=first[j];
                        first[j]=first[j+1];
                        first[j+1]=temp;
                    }
                }
            }
            for(i=0;i<(len2-1);i++)
            {
                for(j=0;j<(len2-1-i);j++)
                {
                   if(second[j]<second[j+1])
                   {
                       temp=second[j];
                       second[j]=second[j+1];
                       second[j+1]=temp;
                   }
                }
            }
            for(i=0;i<len1;i++)
            System.out.println(first[i]);
            for(i=0;i<len2;i++)
            System.out.println(second[i]);
        }
        else
        System.out.println("Array size should be greater then 0");
    }
}