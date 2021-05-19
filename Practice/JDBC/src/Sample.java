import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.Iterator;
import java.util.Map;

class Comp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
public class Sample {
	public static void narenSet() {
	Set<Employee> s=new TreeSet<>(new Comp());
	s.add(new Employee(101,"Senthil Kumar M"));
	s.add(new Employee(101,"Senthil Kumar M"));
	s.add(new Employee(102,"Senthil Narayanan M R"));
	s.add(new Employee(103,"Vigneshwaran L"));
	Iterator it=s.iterator();
	while(it.hasNext()) {
		Object o=it.next();
		System.out.println(o);
	}
}
	public static void narenMap() {
		Map<Employee,Integer> m=new TreeMap<Employee,Integer>(new Comp());
		m.put(new Employee(100,"Vigneshwaran L"), 4);
		m.put(new Employee(101,"Senthil Kumar M"), 1);
		m.put(new Employee(101,"Senthil Kumar M"), 2);
		m.put(new Employee(102,"Senthil Narayanan M R"), 3);
		
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry) it.next();
			System.out.println(me.getKey()+" "+me.getValue());
					}
	}
	public static void main(String[] args) {
		narenSet();
		narenMap();
	}
	}