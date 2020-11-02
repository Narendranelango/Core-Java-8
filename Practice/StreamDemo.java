import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
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
public class StreamDemo {
public void doBasicStream()
{
	Stream<Integer> stream1=Stream.of(10,20,30);
	
	Integer[] values=new Integer[] {10,20,30};
	Stream<Integer> stream2=Arrays.stream(values);
	
	Stream<String> stream3=Stream.of("I","G","A","T","E","\n");

	
//	stream3.forEach(( location)->System.out.print(location));
//	
//	stream2.forEach((ab)->System.out.println(ab));
	stream2.forEach(System.out::println);
	stream3.forEach(System.out::print);
	List<String> loc=Arrays.asList(new String[]{"Pune","Mumbai","Chennai"});
	System.out.println(loc.get(1));
	loc.stream().forEach(System.out::println);
}
public void doMapping()
{
	List<String> list=Arrays.asList(new String[] {"Pune","Mumbai","Chennai"});
list.stream().map((str)->str.length()).forEach(( location)->System.out.print(location));
System.out.println();
list.stream().map(String::length).forEach(System.out::println);
}
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
	List<Integer> intList=Arrays.asList(5,7,13,9,-1);
	Optional<Integer> result=intList.stream().filter(a->a>0).reduce((a,b)->a>b?a:b);
	if(result.isPresent())
	{
		int i=result.get();
		System.out.println(i);
	}
}//doReducing
public void doStudyStream()
{
	List<Integer> list=new ArrayList<>();
	list.add(5);
	list.add(2);
	list.add(9);
	list.add(7);
	System.out.println("For Each with lambda");
	list.stream().forEach((x)->System.out.println(x+" "));
	
	//ForEach with Method reference
	System.out.println("\n ForEach using Method Reference : ");
	list.stream().forEach(System.out::println);
	System.out.println("\n ForEach using Parallel Processing : ");
	list.stream().parallel().forEachOrdered(System.out::println);//Ordered is given before parallel
	System.out.println("________________________________________");
	System.out.println(list.stream().mapToInt((s)->(int)s*2).average());
	System.out.println(list.stream().mapToInt((i)->(int)i*3).max());
	System.out.println(list.stream().mapToInt((d)->(int)d*d).sum());
	System.out.println("____________________________________________");
	List<String> alpha=Arrays.asList("a","b","c","d");
	//before java 8
	List<String> alphaUpper = new ArrayList<>();
	for(String s: alpha) {
		alphaUpper.add(s.toUpperCase());
	}
System.out.println(alphaUpper);
//after java8
List<String> collect=alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
System.out.println(collect);
System.out.println("___________________________________________________________");
List<person> persons=Arrays.asList(new person("Amot","Male",38),new person("Prachi","Female",30));
System.out.println(persons.stream().filter(p->p.getGender().equals("Male")).mapToInt(p->p.getAge()).average());

}
	public static void main(String[] args) {
		StreamDemo sd=new StreamDemo();
//		sd.doBasicStream();
//		sd.doMapping();
//		sd.doFiltering();
//		sd.doReducing();
		sd.doStudyStream();
	}

}
