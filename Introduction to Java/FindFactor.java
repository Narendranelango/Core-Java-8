import java.util.*;
import java.util.stream.Collectors;
class FindFactor{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List <Integer> s=new ArrayList <Integer>();
        if(num<0||num>0)
        {
          num=Math.abs(num);
          for(int i=1;i<=num;i++)
          {
              if(num%i==0)
              {
                  s.add(i);
              }
          }
          
          System.out.println(s.stream().map(i-> i.toString()).collect(Collectors.joining(",")));
        }
        else{
            System.out.println("No Factors.");
        }
    }
}
