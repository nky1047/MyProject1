package string2;

import java.time.LocalDate;

public class Month_Diff_from_LocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create two LocalDate objects
		LocalDate date1 = LocalDate.of(2022, 1, 1);
		// just comments
		LocalDate date2 = LocalDate.of(2023, 4, 27);

		// calculate the difference between the two dates in months
		int months = (date2.getYear() - date1.getYear()) * 12 + (date2.getMonthValue() - date1.getMonthValue());

		System.out.println("The difference between " + date1 + " and " + date2 + " is " + months + " months.");
	}

}
