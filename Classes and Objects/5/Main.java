import java.util.*;
public class Main
{
    public static Movie getMovieDetails()
    {
        Scanner sc = new Scanner(System.in);
        Movie m1=new Movie();
        System.out.println("Enter the movie name:");
        m1.setMovieName(sc.nextLine());
        System.out.println("Enter the movie category:");
        m1.setMovieCategory(sc.nextLine());
        return m1;
    }
    public static String getCircle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the circle:");
        String circle=sc.nextLine();
        return circle;
    }
    public static void main (String[] args) {
        Movie m2=new Movie();
        m2=getMovieDetails();
        String circle=getCircle();
        int val=m2.calculateTicketCost(circle);
        System.out.println("Movie name = "+m2.getMovieName());
        if(val==0)
        {
            System.out.println("Movie category = "+m2.getMovieCategory());
            System.out.println("The ticket cost is = "+m2.getTicketCost());
        }
        else if (val==-1)
        {
            System.out.println("Movie category = "+m2.getMovieCategory());
            System.out.println("Sorry there is no "+m2.getMovieCategory()+" type of category in theater.");
        }
        else if(val==-2)
        {
            System.out.println("Movie category = "+m2.getMovieCategory());
            System.out.println("Sorry!!! Circle is Invalid.");
        }
        else
        System.out.println("Sorry!!! Both circle and category are Invalid.");
    }
}