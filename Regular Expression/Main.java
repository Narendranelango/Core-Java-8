import java.util.*;
import java.util.regex.*;
public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Generate your Security Code");
        String code=sc.nextLine();
        //String pattern1="[a-zA-Z[0-9]&&[@]]+";
        String pattern="^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#*]).*$";
        if(Pattern.matches(pattern,code))
        System.out.println("Security Code Generated Successfully");
        else
        System.out.println("Invalid Security Code, Try Again!");
    }
}