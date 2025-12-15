package com.example.servlet.java8;

import java.util.Optional;

import com.example.servlet.java17.records.UserRecord;

public class OptionalClass {

	public static void main(String[] args) {
		// if we use of(value) the value should not be null
		Optional<UserRecord> record = Optional.of(new UserRecord("Rakesh", 19));
		Optional<UserRecord> record2 = Optional.ofNullable(null);
		System.out.println(record2.isEmpty());
		System.out.println(record2.isPresent());
		System.out.println(record.isPresent());
		System.out.println(record.isEmpty());

		Optional<String> name = record.filter(u -> u.age() > 18).flatMap(u -> Optional.ofNullable(u.name()))
				.map(String::toUpperCase);

		;
		Optional<Integer> name2 = record.filter(u -> u.age() > 18)
				.map(UserRecord::age);

		;
		//.get() throws NoSuchElementFoundException if element not found
		System.out.println(name.get());
	}

}
