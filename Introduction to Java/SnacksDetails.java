import java.util.*;
class SnacksDetails
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);   
        System.out.println("Enter the no of pizzas bought:");
        int pizza=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffs=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int cool_drinks=sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+cool_drinks);
        int total_price=pizza*100+puffs*20+cool_drinks*10;
        System.out.println("Total price="+total_price);
        System.out.println("ENJOY THE SHOW!!!");
    }
}