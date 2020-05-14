import java.util.*;
class NumberRepetition{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int t,rem;
        System.out.println("Enter the number  ");
        int num=sc.nextInt();
        System.out.println("Enter the key digit   ");
        int digit=sc.nextInt();
        t=num;;
        while(t!=0)
        {
            rem=t%10;
            if(digit==rem)
            {
                count+=1;
            }
            t/=10;
        }
        System.out.println(digit+" appears "+count+" times in "+num);
}
}