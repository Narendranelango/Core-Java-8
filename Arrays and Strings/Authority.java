import java.util.*;
public class Authority
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inmate's name:");
        String inmate=sc.nextLine();
        System.out.println("Inmate's father's name:");
        String father=sc.nextLine();
        father=" "+father;
        String str=inmate.concat(father).toLowerCase();
        int invalid=0;
        for(int i=0;i<str.length();i++)
        {
            if(!(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)==' '))
            {
                invalid=1;
                break;
            }
        }
        if(invalid==0)
        System.out.println(str.toUpperCase());
        else
        System.out.println("Invalid name");
    }
}