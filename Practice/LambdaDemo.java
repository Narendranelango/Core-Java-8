import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Student {
	private int rollno;
	private String name;

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return rollno + " " + name;
	}
}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

@FunctionalInterface // ctrl+space
interface Printable {
	void print();// public and abstract
}

@FunctionalInterface
interface Addable {
	int add(int a, int b);
}

//class PrintableImpl implements Printable{
//	@Override
//	public void print() {
//		System.out.println("Inside PrintableImpl............");
//	}
//}
public class LambdaDemo {
	public void doWithoutLambda() {
		System.out.println("Inside do without lambda");
		Printable p1 = new Printable() {

			@Override
			public void print() {
				System.out.println("Without lambda print st");

			}

		};

	}

	public void dowithlambda() {
		Printable p1 = new Printable() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Inside Print method............");
			}

		};// creating object which is implementing interface. We don't know the name of
			// the class and it is called as anonymous class.
		p1.print();
		Printable p2 = () -> {
			System.out.println("Using Lambda");
		};
		p2.print();
		Printable p3 = () -> System.out.println("Haa Haa");
		p3.print();
		Addable a1 = new Addable() {
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		int res = a1.add(3, 5);
		System.out.println(res);

		Addable a2 = (int a, int b) -> {
			return a + b;
		};
		System.out.println(a2.add(3, 9));

		Addable a3 = (a, b) -> a + b;
		System.out.println(a3.add(2, 4));
	}

	public void doCreateThreads() {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Lol");

			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();
		System.out.println("_____________________________________");
		Thread t2 = new Thread(() -> System.out.println("New thread started using Lambda.."));
		t2.start();
	}

	public void doBehaviourPassing() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("Without Predicate");
		System.out.println(sumall(list));

		int b = sumAllEven(list);
		System.out.println(b);
		System.out.println("With predicate");
		System.out.println(sum(list, new Predicate<Integer>() {

			@Override
			public boolean test(Integer a) {
				if (a % 2 == 0)
					return true;
				else
					return false;
			}

		}));
		System.out.println("Total of all even: " + sum(list, a -> {
			if (a % 2 == 0)
				return true;
			else
				return false;
		}));
		System.out.println("Total of all even: " + sum(list, a -> a % 2 == 0));
		System.out.println("Total of all odd: " + sum(list, a -> a % 2 != 0));
		System.out.println("Total of all greater than 4: " + sum(list, a -> a > 4));
	}

	public int sumall(List<Integer> list) {
		int total = 0;
		for (int number : list) {
			total += number;
		}
		return total;
	}

	private int sumAllEven(List<Integer> list) {
		int total = 0;
		for (int numbers : list) {
			if (numbers % 2 == 0)
				total += numbers;
		}

		return total;

	}

	private int sum(List<Integer> list, Predicate<Integer> p) {
		int total = 0;
		for (int number : list) {
			if (p.test(number)) {
				total += number;
			}
		}
		return total;
	}

	public void doBinaryOperator() {
		int result1 = performBinaryOp(20, 10, (i, j) -> i + j);
		System.out.println(" Result 1" + result1);
	}

	private int performBinaryOp(int m, int n, BinaryOperator<Integer> bin) {
		return bin.apply(m, n);
	}

	public void doLambdaWithForEachLoop() {
		List<String> list = new ArrayList();
		list.add("Naren");
		list.add("Name");
		list.add("Elon");
		list.add("Eric");
		list.add("Steve");
		System.out.println("Without Lambda");
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println("Hii " + str);
			}
		});
		System.out.println("With Lambda");
		list.forEach((String str) -> System.out.println("Hello " + str));
		System.out.println("____________________________________");
		System.out.println("With method reference....");
		list.forEach(System.out::println);
	}

	public void doUseLambdaInCollection() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(10, "Eric"));
		list.add(new Student(11, "ELON"));
		list.add(new Student(10, "Musk"));
		list.add(new Student(10, "Maxwell"));
		StudentComparator sc1 = new StudentComparator();
		Collections.sort(list, sc1);
		System.out.println("Sorted list with norlam object of student comparator " + list);
		Comparator sc2 = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());

			}

		};
		Collections.sort(list, sc2);
		System.out.println("Sorted list with normal obj of StudentComparator: " + list);
		Comparator<Student> sc3 = (Student s1, Student s2) -> (s1.getName().compareTo(s2.getName()));
		System.out.println("Sorted list with Lambda " + list);
		Comparator<Student> sc4 = (s1, s2) -> {
			int res = s1.getName().compareTo(s2.getName());
			return -res;
		};
		Collections.sort(list, sc4);
		System.out.println(list);
	}

	public static void main(String[] args) {
		LambdaDemo d = new LambdaDemo();
//		d.dowithlambda();
//		d.doWithoutLambda();
//		d.doCreateThreads();
//		d.doBehaviourPassing();
//		d.doBinaryOperator();
//		d.doLambdaWithForEachLoop();
		d.doUseLambdaInCollection();
	}
}
