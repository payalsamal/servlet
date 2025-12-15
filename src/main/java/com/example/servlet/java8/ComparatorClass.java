package com.example.servlet.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.example.servlet.java17.records.UserRecord;

public class ComparatorClass {

	public static void main(String args[]) {

		Comparator<UserRecord> userComparator = (ob1, ob2) -> {
			return Integer.compare(ob1.age(), ob2.age());

		};
		Stream<UserRecord> user = List
				.of(new UserRecord("Rakesh", 0), new UserRecord("Suresh", 10), new UserRecord("Rakesh", 0)).stream();
		user.sorted(userComparator);

		Stream<UserRecord> user2 = List
				.of(new UserRecord("Rakesh", 0), new UserRecord("Suresh", 10), new UserRecord("Rakesh", 0)).stream();
		user2.map(x -> x.age()).sorted();
	}

}
