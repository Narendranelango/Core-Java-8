import java.util.*;
class IncrementCalculation{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        int sal=sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        float apr=sc.nextFloat();
        if(sal<=0||apr<1||apr>5)
        {
            System.out.println("Invalid Input");
        }
       
        else{
            if(apr>=1&&apr<=3){
            int x=(sal*10)/100;
            System.out.println(sal+x);
            }
            else if(apr>=3.1&&apr<=4){
            int y=(sal*25)/100;
                System.out.println(sal+y);
            }
            else if(apr>=4.1&&apr<=5){
                int z=(sal*30)/100;
                System.out.println(sal+z);
            }
        }
    }
}