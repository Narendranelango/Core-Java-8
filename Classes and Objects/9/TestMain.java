import java.util.*;
public class TestMain
{
    public static BusTicket getTicketDetails()
    {
        BusTicket obj= new BusTicket();
        Scanner sc = new Scanner(System.in);
        //Person p= new Person();
        System.out.println("Enter the ticket no:");
        obj.setTicketNo(sc.nextInt());
        System.out.println("Enter the ticket price:");
        obj.setTicketPrice(sc.nextFloat());
        return obj;
    }
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BusTicket obj=new BusTicket();
        Person p = new Person();
        System.out.println("Enter the passenger name:");
        p.setName(sc.nextLine());
        System.out.println("Enter the gender(M or F / m or f):");
        p.setGender(sc.next().charAt(0));
        System.out.println("Enter the age:");
        p.setAge(sc.nextInt());
        obj=getTicketDetails();
        obj.setPerson(p);
        obj.calculateTotal();
        System.out.println("Ticket no:"+obj.getTicketNo());
        System.out.println("Passenger Name:"+p.getName());
        System.out.printf("Price of a ticket : %.1f\n",obj.getTicketPrice());
        System.out.printf("Total Amount : %.1f ",obj.getTotalAmount());
    }
}