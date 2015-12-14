package week3lesson12;

import java.util.Scanner;
/**
 * 
 * @author haftomtesfay
 *
 */
public class Q2 {

	public static void main(String[] args) {
		System.out.println("Input a integer:");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			n = Integer.parseInt(sc.next());
		} catch (NumberFormatException e) {
			System.out.println("Input Not a number");
		}

		assert(n<100 && n>0):"Input>100 or Input<0";
	}


}
/**
Input a integer:
sdfsd
Input Not a number
 */