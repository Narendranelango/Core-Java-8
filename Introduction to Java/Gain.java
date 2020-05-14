import java.util.*;
class Gain{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Price of old scooter");
        double os=n.nextInt();
        System.out.println("The amount spent for repair");
        double re=n.nextInt();
        System.out.println("Sold Price");
        double sp=n.nextInt();
        double cp=os+re;
        if(os<=0||sp<=0||re<0)
        {
            System.out.println("Incorrect Inputs");
        }
        else if(cp>sp){
            System.out.println("Unable to calculate Gain Percentage");
        }
        else{
            double gain=sp-cp;
            double gp=(gain*100)/cp;
            System.out.println("Gain percentage is "+String.format("%.2f",gp));
        }
    }
}