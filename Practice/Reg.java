import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
	public static void printMatcher(Matcher matcher) {
		while(matcher.find()) {
			
		}
	}
public static void main(String[] args)
{
	Pattern VALID_EMAIL_REGEX=Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
	Matcher mat=VALID_EMAIL_REGEX.matcher("NARENDRaN275@GMAIL.COM");
	System.out.println(mat.find());
}
}
