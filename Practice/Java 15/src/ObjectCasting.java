public class ObjectCasting {
    int a=2;
    void odd()
    {
        System.out.println(a+2);
    }
}
class Ocasting extends ObjectCasting{
    String an="StoneCold";
    void add() {
        System.out.println(an);
    }
    public static void main(String[] args){
        ObjectCasting p=new Ocasting();//Implicit
        ObjectCasting n=new ObjectCasting();
        Ocasting oc2=new Ocasting();
        ObjectCasting ocw=(ObjectCasting)oc2;//Explicit Upcasting
        Ocasting c=(Ocasting)p;//Explicit Downcasting
        c.add();
        c.odd();
        p.odd();
    }
}
//https://www.javatpoint.com/upcasting-and-downcasting-in-java