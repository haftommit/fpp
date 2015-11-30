package week1lesson2;

import java.util.Scanner;
/**
 * @author haftomtesfay
 *
Enter a year to determine whether it is a leap year or not?
1988
The Year You Entered is Yes a Leap Year
 */
public class Q2 {

	public static void main(String[] args) {
		
		System.out.println("Enter a year to determine whether it is a leap year or not?");
		
		Scanner yourInput = new Scanner(System.in);
		
		int year = yourInput.nextInt();
		
		String check = ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) ? "Yes" : "Not";
		
		System.out.println("The Year You Entered is " +check+ " a Leap Year");
	}
}
