public class Les1 {
    public boolean calc(int b){
String h=String.valueOf(b);
        if(h.length()==4){
            System.out.println("ID Correct");
            return true;}
        else {
            System.out.println("Incorrect ID!!!!");
            return false;
    }}
    public static void main(String[] args){
        Les1 l=new Les1();
        l.calc(42221);
    }
}
