import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
class Dummy{
    int ages,exp;
    String name;
    public Dummy(int age,String name,int exp){
        this.ages=age;
        this.name=name;
        this.exp=exp;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "ages=" + ages +
                ", exp=" + exp +
                ", name='" + name + '\'' +
                '}';
    }
}
public class StreamApi {
    public static void filter(){
        List<String> listInt= Arrays.asList(new String[] {"naren","san","Nila"});
//        Stream<String> str=listInt.stream();
//        List<String> lis=listInt.stream().filter(s->s.endsWith("n")).collect(Collectors.toList());
        List<String> lis=listInt.stream().filter(s->s.endsWith("n")).collect(Collectors.toList());

        lis.stream().forEach(s->System.out.println(s));
//        lis.stream().filter(i->i>30).distinct().forEach(i->System.out.println(i));
        List<Dummy> d= Arrays.asList(new Dummy(11,"Narendran E",1),new Dummy(12,"Narendran E",30));
        System.out.println(d.stream().filter(p->p.getAges()>11).collect(Collectors.toList()));

        d.stream().map(s->s.getName().length()).forEach(System.out::println);
        List<Integer> in= Arrays.asList(1,2,3,4,5,6,17,8,10);
        System.out.println(in.stream().sorted().collect(Collectors.toList()));System.out.println("Example of skip ....");
    }
    public static void run(){
        Stream<Integer> s=Stream.of(1,2,3,4);
        s.forEach(System.out::println);
    }
    public static  void main(String[] args){

      StreamApi.filter();System.out.println("End of Fun1");
        StreamApi.run();
    }
}
