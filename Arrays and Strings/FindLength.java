import java.util.*;
public class FindLength
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        int len=str.length();
        int invalid=0;
        for(int i=0;i<len;i++)
        {
            if(!(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)==' '))
            {
                invalid=1;
                break;
            }
        }
        if(invalid==0)
        System.out.println("No of characters is:"+len);
        else
        System.out.println("Invalid String");
    }
}