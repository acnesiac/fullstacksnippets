package streams;
import java.util.*;
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

	@Override
	public String toString() {
		return age + name;
	}
}
public class StreamPersons {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("A",18));
		persons.add(new Person("C",18));
		persons.add(new Person("G",19));
		persons.add(new Person("A",19));
		persons.add(new Person("A",19));
		persons.add(new Person("B",20));
		
		//filter( persons.stream() );
		//groupby( persons.stream() );

		Map<Integer, List<Person>> collect = persons.stream().collect(Collectors.groupingBy(p -> p.age));
		//System.out.println(collect);

		//persons.stream().filter(p -> p.age >= 19).forEach(System.out::println);

		Queue<Person> q = new LinkedList<Person>();
		q.add(new Person("A",1));

		q.addAll(persons);

		Set<Person> setpersons = new HashSet<Person>();
		setpersons.addAll(persons);

		//q.stream().forEach(System.out::println);

		q.removeIf(p -> p.age < 19);
		q.forEach(System.out::println);

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
