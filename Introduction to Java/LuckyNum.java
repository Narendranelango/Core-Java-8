import java.util.*;
class LuckyNum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the car no");
        int n=sc.nextInt();
        int num=Integer.toString(n).length();
        if(num!=4)
        {
            System.out.println(n+" is not a valid car number");
        }
        else if(num==4){
        int sum=String.valueOf(n).chars().map(Character::getNumericValue).sum();
        if(sum%3==0||sum%5==0||sum%7==0)
        {
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Sorry its not my lucky number");
        }
        }
    }
}