public class Student
{
        private int id;
        private String name;
        private int marks[]=new int[20];
        private float average;
        private char grade;
        public void setId(int id)
        {
            this.id=id;
        }
        public void setName(String name)
        {
            this.name=name;
        }
        public void setMarks(int [] m)
        {
            for(int i=0;i<m.length;i++)
            //{
            marks[i]=m[i];
            //System.out.println(marks[i]+" ");}
        }
        public void calculateAvg()
        {
            int sum=0,count=0;
            for(int i=0;marks[i]!=0;i++)
            {
                sum=sum+marks[i];
                count++;
            }
            //System.out.println("Sum="+sum);
            float avg=(float)sum/count;
            setAverage(avg);
        }
        public void setAverage(float avg)
        {
            average=avg;   
        }
        public void findGrade()
        {
            int fail=0;
            for(int i=0;marks[i]!=0;i++)
            {
                if(marks[i]<50)
                {
                    fail=1;
                    break;
                }
            }
            if(fail==1)
            setGrade('F');
            else
            {
                if(average>=80 && average<=100)
                setGrade('O');
                else if(average>=50 && average<=79)
                setGrade('A');
                else
                setGrade('F');
            }
        }
        public void setGrade(char g)
        {
            grade=g;
        }
        public int getId()
        {
            return id;
        }
        public String getName()
        {
            return name;
        }
        public float getAverage()
        {
            return average;
        }
        public char getGrade()
        {
            return grade;
        }
        public int[] getMarks()
        {
            return marks;
        }
}