import java.util.*;
class Character{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first letter:");
        char a=sc.next().charAt(0);
        System.out.println("Enter the second letter:");
        char b=sc.next().charAt(0);
        System.out.println("Enter the third letter");
        char c=sc.next().charAt(0);
        System.out.println("Enter the fourth letter");
        char d=sc.next().charAt(0);
        System.out.println("Enter the fifth letter");
        char e=sc.next().charAt(0);
        System.out.println("Enter the sixth letter");
        char f=sc.next().charAt(0);
        System.out.println("Enter the seventh letter:");
        char g=sc.next().charAt(0);
        if(a=='R'&&b=='A'&&c=='I'&&d=='N'&&e=='B'&&f=='O'&&g=='W')
        {
            System.out.println("RAINBOW");
        }
        else{
            System.out.println("The spelling is wrong");
        }
    }
}