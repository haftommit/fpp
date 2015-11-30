package week1lesson2;

import java.util.Scanner;
/**
 * @author haftomtesfay
 * To Check whether a number (n) is Palindrome reverse it first:
 /*
Enter any number to check Palindrome
12321
Your number is Palindrome! 
*/
public class Q3 {

	public static void main(String[] args) {
		
		System.out.println("Enter any number to check Palindrome");
		Scanner yourInput = new Scanner(System.in);
		int number = yourInput.nextInt();
		
		int palindrom = number;
		int reverse = 0;
		
		while (palindrom != 0) {
	            int remainder = palindrom % 10;
	            reverse = reverse * 10 + remainder;
	            palindrom = palindrom / 10;
			}
		if(number == reverse)
			System.out.println("Your number is Palindrome! ");
		
		else 
			System.out.println("Your number is Not Palindrome! ");
	}
}

