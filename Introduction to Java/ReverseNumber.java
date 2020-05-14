import java.util.*;
class ReverseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int last_digit=0,reverse=0;
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        if(n>=0)
        {
        while(n>0)
        {
            last_digit=n%10;
            reverse=(reverse*10)+last_digit;
            n=n/10;
        }
        System.out.println("Output is:"+reverse);
        }
        else{
            System.out.println("Number should be positive");
        }
    }
}