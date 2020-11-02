import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Employee {
	private int salary;
	private String name;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary + ">");
		return sb.toString();

	}
}

class EmployeeInfo {
	public enum SortMethod {
		BYNAME, BYSALARY
	};

	public List<Employee> sort(List<Employee> emps, final SortMethod method) {
		List<Employee> sorted = null;

		// System.out.println((method.BYNAME.equals(SortMethod.BYNAME)));

		if (method.equals(SortMethod.BYNAME)) {
			// System.out.println("Hello");
			sorted = emps.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
					.collect(Collectors.toList());
		}

		else if (method.equals(SortMethod.BYSALARY)) {
			sorted = emps.stream().sorted((e1, e2) -> {
				if (e1.getSalary() < e2.getSalary())
					return -1;
				else if (e1.getSalary() == e2.getSalary())
					return 0;
				else
					return 1;
			}).collect(Collectors.toList());
		}
		return sorted;

	}

	public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character) {
		List<Employee> stream = null;
		stream = entities.stream().filter(s -> (String.valueOf(s.getName().charAt(0))).equalsIgnoreCase(character))
				.collect(Collectors.toList());
		if (stream.size() > 0)
			return true;
		return false;
	}
}

public class Sapi {
	public static void main(String args[]) {
		EmployeeInfo ei = new EmployeeInfo();
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Mickey", 100000));
		emps.add(new Employee("Timmy", 50000));
		emps.add(new Employee("Annny", 40000));
		List<Employee> out = ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		List<Employee> output = ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(out + "\n" + output);
		boolean ischaracterPresent = ei.isCharacterPresentInAllNames(emps, "t");
		if (ischaracterPresent)
			System.out.println(true);
		else
			System.out.println(false);
	}
}