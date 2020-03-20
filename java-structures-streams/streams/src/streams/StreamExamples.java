package streams;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamExamples {
	
	public static void main(String[] args) {		
		// 
		int[] values  = {1,2,4,4};
		max(IntStream.of(values));
		map(IntStream.of(values));
		filter(IntStream.of(values));
		count(IntStream.of(values));
		average(IntStream.of(values));
		// 
		List<Integer> list = IntStream.of(values).boxed().collect(Collectors.toList());
		map(list.stream());
		max(list.stream());
		filter(list.stream());
		count( list.stream());
		average( list.stream());
	}
	

	private static void map(IntStream of) {
		of.mapToObj(Integer::toString);
	}
	private static OptionalInt max(IntStream of) {
		return of.max();
	}

	private static int[] filter(IntStream of) {
		IntStream filter = of.filter(n -> n> 3);
		return filter.toArray();
	}

	private static Long count(IntStream of) {
		 long count = of.count();
		return count;
	}

	private static OptionalDouble average(IntStream stream) {
		return stream.average();
	}
	
	//
	private static void map(Stream<Integer> stream) {
		stream.map(n -> n+2 ).forEach(System.out::println);
	}
	
	private static int max(Stream<Integer> stream) {
		Optional<Integer> max = stream.max( Integer::compare);
		return max.get().intValue();
	}
	
	private static Integer[] filter(Stream<Integer> stream) {
		return stream.filter(n -> n > 4).toArray(Integer[]::new);
	}

	private static Long count(Stream<Integer> of) {
		return of.collect(Collectors.counting());
	}

	private static double average(Stream<Integer> stream) {
		Double collect = stream.collect(Collectors.averagingDouble(n->n));
		return collect;
	}
	
}
