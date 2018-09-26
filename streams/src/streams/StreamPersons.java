package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Person{
	int age;
	String name;
	public Person( String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}	
}
public class StreamPersons {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Adolfo",18));
		persons.add(new Person("Adolfo1",18));
		
		filter( persons.stream() );
		groupby( persons.stream() );
	}
	private static void groupby(Stream<Person> stream) {
		Map<Integer, List<Person>> collect = stream.collect(Collectors.groupingBy(p -> p.age));
		collect
	    .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
		
	}
	private static void filter(Stream<Person> stream) {
		stream.filter(n -> n.name.equals("Adolfo")).forEach(System.out::println);		
	}
}
