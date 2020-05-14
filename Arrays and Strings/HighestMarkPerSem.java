import java.util.*;
public class HighestMarkPerSem
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int num=sc.nextInt();
        int subs[]=new int[num];
        int marks[][]=new int[10][10];
        int maxMarks[]=new int[num];
        int i,j,noofsubs,max;
        for(i=0;i<num;i++)
        {
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            subs[i]=sc.nextInt();
        }
        for(i=0;i<num;i++)
        {
            noofsubs=subs[i];
            //int marks[][]=new int[num][noofsubs];
            System.out.println("Marks obtained in semester "+(i+1)+":");
            for(j=0;j<noofsubs;j++)
            {
                marks[i][j]=sc.nextInt();
                if(marks[i][j]<0 || marks[i][j]>100)
                {
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }
            }
            max=marks[i][0];
            for(j=1;j<noofsubs;j++)
            {
                if(max<marks[i][j])
                max=marks[i][j];
            }
            maxMarks[i]=max;
        }
        for(i=0;i<num;i++)
        {
            System.out.println("Maximum mark in "+(i+1)+" semester:"+maxMarks[i]);
        }
        
    }
}