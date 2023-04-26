package string1;

import java.time.LocalDate;

public class getMonthDifference {

	public static void main(String[] args) {

		// create two LocalDate objects
		LocalDate date1 = LocalDate.of(2022, 1, 1);
		LocalDate date2 = LocalDate.of(2023, 4, 27);

		// calculate the difference between the two dates in months
		int months = (date2.getYear() - date1.getYear()) * 12 + (date2.getMonthValue() - date1.getMonthValue());

		System.out.println("The difference between " + date1 + " and " + date2 + " is " + months + " months.");
	}

}
