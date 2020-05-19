import java.util.Scanner;
import java.util.regex.*;
public class UserMain
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PAN number");
        String pan= sc.nextLine();
        String pattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        if(Pattern.matches(pattern,pan))
        System.out.println("Valid PAN number");
        else
        System.out.println("Invalid PAN number");
    }
}