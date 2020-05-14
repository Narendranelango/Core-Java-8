import java.io.*;

public class CinemaTicket{
    public static void main(String[] args) throws Exception{
        
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        
        int num;
        char ref,coup,cir;
        double price=0.00;
       
        System.out.print("Enter the no of ticket:");
        num = Integer.parseInt(bu.readLine());
        if(num<5 || num>40)
        {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }
        System.out.print("Do you want refreshment:");
        ref= bu.readLine().charAt(0);
      
        System.out.print("Do you have coupon code:");
        coup= bu.readLine().charAt(0);
      
        System.out.print("Enter the circle:");
        cir= bu.readLine().charAt(0);
       
        if(cir=='k' || cir=='q' || cir=='K' || cir=='Q')
        {
            if(cir=='k' || cir=='K')
            {
                price = num * 75;
            }
            else
            {
                price = num * 150;
            }
        
       if(num>20)
        {
            price = price - (price * 0.10);
        }
       
        if(coup=='y' || coup=='Y')
        {
            price = price - (price * 0.02);
        }
        
        if(ref=='y' || ref=='Y')
        {
            price = price + (50*num);
        }
        else
        {
            price = price;
        }
        
        System.out.print("Ticket cost:");
        System.out.printf("%.2f",price);
        }
        else
        {
            System.out.println("Invalid Input");
            return;
        }
    }
}

















