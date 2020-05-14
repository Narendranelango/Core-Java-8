import java.util.*;
class Power{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        System.out.println("Enter the digit");
        int digit=sc.nextInt();
        if(number<0||digit<0)
        {
            System.out.println("Invalid Input");
        }
        else{
            long result=1;
            for(;digit!=0;--digit){//if dig is 2 and num is 3
            result*=number;//1st-result=1*3  2nd- result=3*3 3rd-breaks as digit becomes 0 after decrementing 
            }
        System.out.println(result);
        }
    }
}