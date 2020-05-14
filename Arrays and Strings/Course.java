import java.util.*;
public class Course
{
    public static void main (String[] args) {
        /* code */
    
        Scanner sc = new Scanner(System.in);
        String course[]=new String[20];
        int found=0;
        System.out.println("Enter no of course:");
        int num=sc.nextInt();
        sc.nextLine();
        if(num>0)
        {
            System.out.println("Enter course names:");
            for(int i=0;i<num;i++)
            course[i]=sc.nextLine();
            System.out.println("Enter the course to be searched:");
            String name=sc.nextLine();
            for(int i=0;i<num;i++)
            {
                if(name.equalsIgnoreCase(course[i]))
                {
                    System.out.println(name+" course is available");
                    found=1;
                    break;
                }
            }
            if(found==0)
            System.out.println(name+" course is not available");
        }
        else
        System.out.println("Invalid Range");
    }
}