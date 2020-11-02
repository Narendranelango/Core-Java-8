//import java.util.*;
//class ArrayListOps {
//   public ArrayList<Integer> makeArrayListInt(int n){
//	   ArrayList<Integer> list=new ArrayList<>();
//	   for(int i=0;i<n;i++){
//		   list.add(0);
//	   }
//	   return list;
//   }
//   public ArrayList<Integer> reverseList(ArrayList<Integer> list){
//	   Collections.reverse(list);
//	   return list;
//   }
//   public ArrayList<Integer> changeList(ArrayList<Integer> list,int m,int n){
//      ArrayList<Integer> temp=list;
//	  for(int i=0;i<temp.size();i++){
//		  if(temp.get(i)==m)
//		  {
//			  temp.remove(i);
//			  list.add(i,n);
//		  }
//	  }
//	   return temp;
//   }
//}
//public class Source{
//	public static void main(String[] args) {
//		ArrayListOps a=new ArrayListOps();
//		ArrayList<Integer> result=a.makeArrayListInt(4);
//		System.out.println("Create List"+result);
//		ArrayList<Integer> res=new ArrayList<Integer>(Arrays.asList(10,34,32,65,14,16));
//		ArrayList<Integer> results=a.reverseList(res);
//		System.out.println("Reverse the list"+results);
//		ArrayList<Integer> lista=new ArrayList<Integer>(Arrays.asList(12,12,12,14,15,45));
//		ArrayList<Integer> tr=a.changeList(lista,12,88);
//		System.out.println("Change the element in the list"+tr);
//	}
//}























import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Activity{
  //Implement Activity class here..
  String string1;
  String string2;
  String operator;
  public Activity(String string1, String string2, String operator)
  {
    this.string1=string1;
    this.string2=string2;
    this.operator=operator;
  }
  public String getString1(){
    return string1;
  }
  public String getString2(){
    return string2;
  }
  public String getOperator(){
    return operator;
  }
}



public class Source {
  //Implement the two function given in description in here...
    public String handleException(Activity a)
    {
      String result="";
      String str1=a.getString1();
      String str2=a.getString2();
      String op=a.getOperator();
      try
      {
      if(str1.equals(null)||str2.equals(null))
      {
        throw new NullPointerException("Null values found");
        //result="Null values found";
      }
      if((a.operator.compareTo("+")!=0)&&(a.operator.compareTo("-")!=0))
      {
        throw new Exception(op);
      }
      }
      catch(NullPointerException ne)
      {
        result="Null values found";
      }
      catch(Exception e)
      {
        result=op;
      }
      if(result.equals(""))
        result="No Exception Found";
      return result;
    }
    public String doOperation(Activity a)
    {
      String str1=a.getString1();
      String str2=a.getString2();
      String op=a.getOperator();
      String tot="";
      switch(op){
        case "+": tot=str1+str2; break;
        case "-": tot=str1.replaceAll(str2,""); break;
        default: tot=""; break;
      }
      return tot;

    }
  
	public static void main(String args[] ) throws Exception {
    //Write your own main to check the program...
    Activity a=new Activity(null,null,"");
    Source s=new Source();
    String str=s.doOperation(a);
    String exc=s.handleException(a);
    System.out.println(exc);
    System.out.println(str); 


	}
}