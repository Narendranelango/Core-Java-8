import java.util.*;
public class StudentMain
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();
        System.out.println("Enter the id:");
        obj.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the name");
        obj.setName(sc.nextLine());
        System.out.println("Enter the no of subjects:");
        int num=sc.nextInt();
        int marks[]=new int[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter marks for subject "+(i+1)+":");
            marks[i]=sc.nextInt();
        }
        obj.setMarks(marks);
        System.out.println("Id:"+obj.getId());
        System.out.println("Name:"+obj.getName());
        obj.calculateAvg();
        System.out.printf("Average:%.6f\n",obj.getAverage());
        obj.findGrade();
        System.out.println("Grade:"+obj.getGrade());
    }
}