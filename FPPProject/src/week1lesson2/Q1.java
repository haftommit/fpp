package week1lesson2;

import java.util.Scanner;
/**
 * 
 Enter an amount of money, Eg., 11.56:
11.56
11 dollars
2 quarters
0 dimes
1 nickles
1 pennies
 * @author haftomtesfay
 *
 */
public class Q1 {

	public static void main(String[] args) {
		
		System.out.println("Enter an amount of money, Eg., 11.56:\n");
		
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		
		int cents = (int) (amount*100);
		int dollars = cents /100;
		int quarters = (cents %100) /25;
		cents -= quarters * 25;
		int dimes = cents%25 / 10;
		cents -= dimes*10;
		int nickles = cents%10 /5;
		cents -= nickles * 5;
		int pennies = cents%10;
		
		System.out.print(dollars	+	" dollars\n");
		System.out.print(quarters	+	" quarters\n");
		System.out.print(dimes		+	" dimes\n");
		System.out.print(nickles	+	" nickles\n");
		System.out.print(pennies	+	" pennies");
		    
	}
}
