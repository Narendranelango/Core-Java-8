import java.util.*;
public class TestMain
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator obj=new VolumeCalculator();
        System.out.println("Enter the choice");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("2.Find Volume For Cuboid");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter the radius");
            double r=sc.nextDouble();
            System.out.println("Enter the height");
            double h=sc.nextDouble();
            System.out.printf("Volume of the Cylinder is %.2f",obj.calculateVolume(r,h));
        }
        else if(ch==2)
        {
            System.out.println("Enter the length");
            int l=sc.nextInt();
            System.out.println("Enter the breadth");
            int b=sc.nextInt();
            System.out.println("Enter the height");
            int h=sc.nextInt();
            System.out.printf("Volume of the Cuboid is %.2f", obj.calculateVolume(l,b,h));
        }
    }
}