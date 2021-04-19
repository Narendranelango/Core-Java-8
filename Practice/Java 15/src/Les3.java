import java.util.*;
public class Les3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=30;
        int b=4;
        System.out.println("Enter your choice!!!!");
        int i=sc.nextInt();
        switch(i){
            case 1:
                System.out.println(a+b);
            case 2:
                System.out.println(a-b);
            default:
                System.out.println("No operation was selected");
        }
    }
}
