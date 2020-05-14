import java.util.*;
class AsciValue{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char e,f,g,h;
        int a,b,c,d;
        System.out.println("Enter the digits");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            e=(char)a;
            f=(char)b;
            g=(char)c;
            h=(char)d;
            System.out.println(a+"-"+e);
            System.out.println(b+"-"+f);
            System.out.println(c+"-"+g);
            System.out.println(d+"-"+h);
    }
}