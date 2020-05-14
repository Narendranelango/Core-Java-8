import java.util.*;
class CelsiusConversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float celsius=sc.nextFloat();
        Float Farenheit=9*celsius/5;
        Float total=Farenheit+32;
        System.out.println(String.format("%.1f",total));
    }
    
}