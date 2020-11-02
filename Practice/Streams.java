import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class person{
	private String name;
	private String gender;
	private int age;
	public person(String name,String gender,int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
public class Streams {
	public void doFiltering()
	{
		
		List<String> locations=Arrays.asList(new String[]{"Pune","Chennai","Bangalore"});
		Stream<String> stream=locations.stream();
		List<String> result=stream.filter(str->str.length()>5).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("_____________________________________________");
		List<Integer> listInt=Arrays.asList(new Integer[] {11,44,66,33,44});
		List<Integer> res=listInt.stream().filter(i->i>10).collect(Collectors.toList());
		res.stream().filter(i->i>30).distinct().forEach(i->System.out.println(i));
		System.out.println("_____________________________________________");
		res.stream().filter(i->i>30).distinct().limit(2).forEach(i->System.out.println(i));
		System.out.println("_____________________________________________");
	}//doFiltering
	public void doReducing() {
		System.out.println("In Reducing.....................................");
		List<Integer> intList=Arrays.asList(5,7,13,9,-1);
		Optional<Integer> result=intList.stream().filter(a->a>0).reduce((a,b)->a>b?a:b);
		if(result.isPresent())
		{
			int i=result.get();
			System.out.println(i);
		}
		List<person> persons=Arrays.asList(new person("Amot","Male",38),new person("Prachi","Female",30));
		System.out.println(persons.stream().filter(p->p.getGender().equals("Male")).mapToInt(p->p.getAge()).average());
	}//doReducing
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Streams s=new Streams();
        s.doFiltering();
        s.doReducing();
	}

}
