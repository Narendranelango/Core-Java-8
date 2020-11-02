class Person {
	public int id;
	public String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id+" : "+name;
	}
}
public class ArrayDemo {
	private static void printArray(int... arr) {
		for (int a : arr)
			System.out.println(a);
	}
private static void printArray(Person[] per)
{
	for(Person aa: per) {
		System.out.println(aa);
	}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] per = new Person[3];// Person[] per=new Person[]{new Person(10,"Naren");};
		per[0] = new Person(10, "Naren");
		per[1] = new Person(20, "Nareen");
		per[2] = new Person(30, "Nareeen");
		printArray(per);
		int[] arr1 = new int[] { 10, 20, 30, 40 };
		int[] arr2 = new int[] { 1, 2, 3, 4 };
		printArray(arr1);
		System.out.println();
		printArray(arr2);
		printArray(23, 15);	
	}
}