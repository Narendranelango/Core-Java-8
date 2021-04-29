import java.util.regex.*;
public class RegEx {
    public static void main(String[] args) {
        String input = "NARENDRAN";
        //Checks for string that start with upper case alphabet and end with digit.
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(input);
        if (!m.find()) {
            System.err.println("Enter  code which  start with upper case alphabet and end with a digit");
        }
        else{
            System.out.println("Done!!!!");
        }
    }
}
