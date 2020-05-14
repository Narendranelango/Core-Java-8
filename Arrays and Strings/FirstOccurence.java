import java.util.*;
public class FirstOccurence
{
    public static void main (String[] args) {
        /* code */
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Enter the character to be searched:");
        char ch1=sc.next().charAt(0);
        System.out.println("Enter the character to replace:");
        char ch2=sc.next().charAt(0);
        int found=0,i;
        String word="";
        //int len=str.length();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch1 && found==0)
            {
                found=1;
                word=word+ch2;
                //str=str.substring(0,i);//+ch2+str.substring(i+1);
                //System.out.println(str);
                //break;
            }
            else
            word=word+str.charAt(i);
        }
        if(found==0)
        System.out.println("character not found");
        else
        System.out.println(word);
}}