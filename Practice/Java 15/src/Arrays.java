public class Arrays {
    int sum(int[] intArray)
    {
        int result = 0;
        for (int index : intArray)
            result += index;
        return result;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int[] arr1=new int[10] ;
        int[][] twodim=new int[20][20];
        String[] Words = new String[2];
        Words[0]=new  String("Bombay");
        Words[1]=new  String("Pune");
Arrays a=new Arrays();
int anush=a.sum(new int[]{1, 23});
System.out.println(anush);
    }
}