package Lfourteen;
@FunctionalInterface
 interface Servic{
	boolean isnill(String n,String p);
}
//class Lambda implements Service{

//			 (n,p)->{
//			if(n.equals("") || p.equals("")) 
//				return false;
//				else 
//				return true;		
//		};
//		System.out.println(s.isnill("Hii","Na"));

 public class Lambda14_3{
	 public void doing() {
		 Servic s=new Servic() {

			@Override
			public boolean isnill(String n, String p) {
				if(n.equals("Na") && p.equals("Na"))
				{
					System.out.println("Hii");
				 return true;
				}
				else {
					System.out.println("Byeee");
					return false;
				}
			}
		 };
		 boolean res=s.isnill("Na","Na");
		 System.out.println(res);
	 }
			 
	public static void main(String[] args) {
		Lambda l=new Lambda();
		l.doing();
	}
}
