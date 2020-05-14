import java.util.*;
public class Palindrome
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String str=sc.nextLine();
        String str1=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str1.charAt(i)<'a' || str1.charAt(i)>'z')
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        StringBuilder word = new StringBuilder(str1);
        if(word.toString().equals(word.reverse().toString()))
        System.out.println(str+" is a Palindrome");
        else
        System.out.println(str+" is not a Palindrome");
    }
}