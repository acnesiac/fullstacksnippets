package streams;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples3 {

	public static void main(String[] args) {
		//
        int[] A = new int[]{1, 2, 3, 4, 5};
		map(IntStream.of(A));
		max(IntStream.of(A));
		filter(IntStream.of(A));
		average(IntStream.of(A));
		count(IntStream.of(A));

		//
		List<Integer> collect = IntStream.of(A).boxed().collect(Collectors.toList());
		map(collect.stream());
		max(collect.stream());
		filter(collect.stream());
		average(collect.stream());
		count(collect.stream());
	}

	//
	private static void map(IntStream of) {
		of.map(n -> n + 2).forEach(System.out::print);
	}

	private static int[] filter(IntStream of) {
		IntStream filter = of.filter(n -> n > 3);
		return filter.toArray();
	}	

	private static OptionalInt max(IntStream of) {
		return of.max();
	}

	private static Long count(IntStream of) {
		return of.count();
	}

	private static OptionalDouble average(IntStream stream) {
		return stream.average();
	}	
	
	//
	private static int max(Stream<Integer> stream) {
		Optional<Integer> max = stream.max(Integer::compare);
		return max.get();
	}
	
	private static void map(Stream<Integer> stream) {
		stream.map(n -> n ++ ).forEach(System.out::println);
	}

	private static Integer[] filter(Stream<Integer> stream) {
		return stream.filter(n -> n > 4).toArray(Integer[]::new);
	}

	private static Long count(Stream<Integer> of) {
		return of.collect(Collectors.counting());
	}
	
	private static double average(Stream<Integer> stream) {
		Double collect = stream.collect(Collectors.averagingDouble(n -> n));
		return collect;
	}
}
