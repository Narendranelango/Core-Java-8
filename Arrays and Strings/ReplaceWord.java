import java.util.*;
public class ReplaceWord
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Enter the word to be searched:");
        String search=sc.nextLine();
        System.out.println("Enter the word to be replaced:");
        String replace=sc.nextLine();
        int pos=str.indexOf(search);
        if(pos==-1)
        System.out.println("The word "+search+" not found");
        else
        System.out.println(str.replaceAll(search,replace));
    }
}