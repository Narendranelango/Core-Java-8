import java.util.*;
public class StudentMain
{
    public static Student getStudentDetails()
    {
        //Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        int num,m;
        //int marks[]=new int[100];
        int marks[];
        while(true)
        {
            System.out.println("Enter the no of subjects:");
            num=sc.nextInt();
            if(num>0)
            {
                marks=new int[num];
                for(int i=0;i<num;i++)
                {
                    while(true)
                    {
                        System.out.println("Enter mark for subject "+(i+1)+":");
                        m=sc.nextInt();
                        if(m>=0 && m<=100)
                        {
                            marks[i]=m;
                            break;
                        }
                        else
                        System.out.println("Invalid Mark");
                    }
                }
                //s1.setMarks(marks);
                break;
            }
            else
            {
                System.out.println("Invalid number of subject");
            }
        }
        Student s1=new Student(id,name,marks);
        return s1;
    }
    public static void main (String[] args) {
      Student s2;
      s2=getStudentDetails();
      s2.calculateAvg();
      s2.findGrade();
      System.out.println("Id:"+s2.getId());
      System.out.println("Name:"+s2.getName());
      System.out.printf("Average:%.2f\n",s2.getAverage());
      System.out.println("Grade:"+s2.getGrade());
    }
}