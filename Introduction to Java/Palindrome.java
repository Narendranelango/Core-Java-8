import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int last_digit=0,reverse=0,temp;
        int n=sc.nextInt();
        temp=n;
        if(n>=0)//The no can also be 0{
        while(n>0)
        {
            last_digit=n%10;
            reverse=(reverse*10)+last_digit;
            n=n/10;
        }
        if(temp==reverse)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    
}