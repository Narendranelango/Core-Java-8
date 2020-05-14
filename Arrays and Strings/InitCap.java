import java.util.*;
public class InitCap
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        String str1=str+" ";
        String word="";
        char ch;
        int allcap=1,k=0;
        for(int i=0;i<str1.length()-1;i++)
        {
            if(i==0)
            {
                if(str1.charAt(0)>='a' && str1.charAt(0)<='z')
                {
                    allcap=0;
                    break;
                }
            }
            else
            {
                if(str1.charAt(i)==' ')
                {
                    i++;
                    if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
                    {
                        allcap=0;
                        break;
                    }
                }
            }
        }
        if(allcap==0)
        {
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=' ')
            word = word + str1.charAt(i);
            else
            {
                if(word.charAt(0)>='a' && word.charAt(0)<='z')
                {
                    ch=word.charAt(0);
                    ch-=32;
                    if(i==str1.length()-1)
                    System.out.print(ch+word.substring(1));
                    else
                    System.out.print(ch+word.substring(1)+" ");
                }
                else
                {
                    if(i==str1.length()-1)
                        System.out.print(word);
                    else
                        System.out.print(word+" ");
                }
                word="";
                k++;
            }
        }
        }
        else
        System.out.println("First character of each word is already in uppercase");
    }
}