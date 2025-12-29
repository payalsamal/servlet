package com.example.servlet.java17.switchs;

/**
 * Switch statement executes code and does not return a value, while switch
 * expression returns a value and enforces exhaustiveness. They are similar in
 * syntax but not the same in behavior.
 * 
 * @author payals
 *
 */
public class Java17SwitchExpression {

	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY,

	}

	public static void main(String args[]) {
		Day day = Day.MONDAY;
		String message = switch (day) {
		case MONDAY -> "Created";
		case TUESDAY -> "Work ongoing";
		case WEDNESDAY -> "Finished";
		case THURSDAY -> "Stopped";
		};
		System.out.println(message);
	}

}
