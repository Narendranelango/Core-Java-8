public class Employee {
	int empno;
	String name;
	public Employee(int empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + "]";
	}

}
