import java.util.*;
class Triangle{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for side1");
        int a=sc.nextInt();
        System.out.println("Enter the value for side2");
        int b=sc.nextInt();
        System.out.println("Enter the value for side3");
        int c=sc.nextInt();
        int d=a+b;
        int e=b+c;
        int f=c+a;
        if(a==0||b==0||c==0){
            System.out.println("Invalid Input");
        }
        else if(d>c&&e>a&&f>b)
        {
            System.out.println("Sides form a Triangle");
        }
        else{
            System.out.println("Sides does not form a Triangle");
        }
    }
}