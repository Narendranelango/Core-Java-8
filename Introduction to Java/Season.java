import java.util.*;
class Season{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month:");
        int n=sc.nextInt();
        if(n>=1&&n<=12){
        if(n>=3&&n<=5)
        {
            System.out.println("Season:Spring");
        }
        else if(n>=6&&n<=8)
        {
            System.out.println("Season:Summer");
        }
        else if(n>=9&&n<=11)
        {
            System.out.println("Season:Autumn");
            }
            else if((n>=12)||(n>=1&&n<=2))//Nt given as above as the month number may exceed to 12 that makes invalid
            {
                System.out.println("Season:Winter");
            }
        }
            else{
                System.out.println("Invalid month");
            }
    }
}