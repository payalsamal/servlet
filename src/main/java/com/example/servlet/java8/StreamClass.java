package com.example.servlet.java8;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.servlet.java17.records.UserRecord;

public class StreamClass {

	public static void main(String[] args) {

		Stream<String> obj = List.of("Rahul", "Payal", "Riya", "Rahul").stream();

		Stream<Integer> intType = List.of(2, 9, 8, 7).stream();
		// filter
		obj.filter(x -> x.startsWith("R")).map(x -> x.toUpperCase()).distinct().forEach(x -> System.out.println(x));

		// IllegalStateException will throw because line no 15 foreach already consumed
		// the stream
		// obj.map(x->x.toUpperCase()).forEach( System.out::println);

		Stream<UserRecord> user = List
				.of(new UserRecord("Rakesh", 0), new UserRecord("Suresh", 0), new UserRecord("Rakesh", 0)).stream();

		Collectors.toMap(UserRecord::name, Function.identity(), (u1, u2) -> u1);
		Map<String, List<UserRecord>> distinctUser = user.collect(Collectors.groupingBy(UserRecord::name));
		
		
		Optional<Integer> value = intType.reduce((a,b)->a*b);
		System.out.println(value);
		

	}

}
