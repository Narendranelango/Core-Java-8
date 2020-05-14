import java.util.*;
public class OccurrenceOfChar
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=sc.nextLine();
        for(int i=0;i<word.length();i++)
        {
            if(!((word.charAt(i)>='A' && word.charAt(i)<='Z') || (word.charAt(i)>='a' && word.charAt(i)<='z')))
            {
                System.out.println("Not a valid string");
                System.exit(0);
            }
        }
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')))
        {
            System.out.println("Given character is not an alphabet");
            System.exit(0);
        }
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            count++;
        }
        if(count==0)
        System.out.println("The given character '"+ch+"' not present in the given word.");
        else
        System.out.println("No of '"+ch+"' present in the given word is "+count+".");
    }
}