import java.util.*;
import java.util.regex.*;
public class UserMain
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID");
        String id=sc.nextLine();
        String pattern="[G][B][L][/][0-9]{3}/[0-9]{4}";
        if(Pattern.matches(pattern,id))
        System.out.println("Login success");
        else
        System.out.println("Incorrect ID");
    }
}