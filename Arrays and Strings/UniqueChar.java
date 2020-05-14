import java.util.*;
public class UniqueChar
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str=sc.nextLine().toLowerCase();
        str=str.replaceAll(" ","");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)<'a' || str.charAt(i)>'z')
            {
                System.out.println("Invalid sentence");
                System.exit(0);
            }
        }
        //System.out.println(str.length());
        char[] ch=str.toCharArray();
        //System.out.println(ch.length);
        char[] unique=new char[ch.length];
        int k=-1,notUnique=0,pos;
        for(int i=0;i<ch.length;i++)
        {
            pos=i;
            for(int j=0;j<ch.length;j++)
            {
                if(j==pos)
                continue;
                else
                {
                    if(ch[i]==ch[j])
                    {
                        notUnique=1;
                        break;
                    }
                }
            }
            if(notUnique==0)
            {
                unique[++k]=ch[i];
            }
            else
            notUnique=0;
        }
        if(k==-1)
        System.out.println("No unique characters");
        else
        {
            System.out.println("Unique characters:");
            for(int i=0;i<=k;i++)
            System.out.println(unique[i]);
        }
    }
}