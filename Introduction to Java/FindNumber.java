import java.util.*;
class FindNumber{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num<=0)
        {
            System.out.println("Invalid Input");
        }
        else{
        for(int i=1;;i++){
        if(num%i==0)
        {
            num/=i;
            count=count+1;
        }
        else{
            break;
        }
    }
        if(num==1)
        System.out.println(count);
        else
            System.out.println("Sorry. The given number is not a perfect factorial");
        }
        }
}