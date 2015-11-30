package week1lesson2;

import java.util.Scanner;
/**
 * @author haftomtesfay
 
 Enter any positive number (Integer) 
8
********
********
********
********
********
********
********
********
 */

public class Q6 {

	public static void main(String[] args) {
		
		System.out.println("Enter any positive number (Integer) ");
		
		Scanner input = new Scanner(System.in);
		
		int yourInput = input.nextInt();
		
		for(int i = 0; i <yourInput; i++){
			for(int j = 1; j < yourInput; j++){
				System.out.print("*");
			}
			System.out.println("*");
		}
			

	}

}