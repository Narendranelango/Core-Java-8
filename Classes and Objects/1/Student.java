public class Student
{
    private int id;
    private String name;
    private float average;
    private char grade;
    private int[] marks;
    public Student(int id,String name,int[] marks)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setAverage(float average)
    {
        this.average=average;
    }
    public float getAverage()
    {
        return average;
    }
    public void setGrade(char grade)
    {
        this.grade=grade;
    }
    public char getGrade()
    {
        return grade;
    }
    public void setMarks(int[] marks)
    {
        this.marks=marks;
    }
    public int[] getMarks()
    {
        return marks;
    }
    public void calculateAvg()
    {
        int sum=0;
        int num=marks.length;
        for(int i=0;i<num;i++)
        {
            sum=sum+marks[i];
        }
        float avg=(float)sum/num;
        setAverage(avg);
    }
    public void findGrade()
    {
        int flag=1;
        float avg=getAverage();
        int num=marks.length;
        /*for(int i=0;i<num;i++)
        {
            if(marks[i]<=50)
            {
                setGrade('F');
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            if(avg>=80 && avg<=100)
            setGrade('O');
            else
            setGrade('A');
        }*/
        for(int i=0;i<num;i++)
        {
            if(marks[i]>=50)
            {
                if(avg>=80 && avg<=100)
                setGrade('O');
                else
                setGrade('A');
            }
            else
            {
                setGrade('F');
                break;
            }
        }
    }
}