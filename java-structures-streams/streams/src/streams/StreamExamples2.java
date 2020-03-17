package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples2 {
	public static void main(String[] args) {
		map(IntStream.of(1,2,3,4,5,6));
		max(IntStream.of(1,2,3,4,5,6));
		max(IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList()).stream());
		filter(IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList()).stream());
	}
	
	private static void map(IntStream of) {
		IntStream map = of.map(n -> n + 2);
		map.forEach(System.out::print);
	}

	private static int max(Stream<Integer> stream) {
		Optional<Integer> max = stream.max( Integer::compare);
		return max.get().intValue();
	}

	private static OptionalInt max(IntStream of) {
		return of.max();
	}

	private static Integer[] filter(Stream<Integer> stream) {
		Stream<Integer> filter = stream.filter(n -> n<3);
		return (Integer[]) filter.toArray();
	}

	private static double average(Stream<Integer> stream) {
		return 0;
	}

	private static Long count(Stream<Integer> of) {
		return null;
	}

	private static Long count(IntStream of) {
		return of.count();
	}

	private static OptionalDouble average(IntStream stream) {
		return stream.average();
	}	
}
