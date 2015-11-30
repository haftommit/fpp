package week1lesson2;
import java.util.Scanner;
/**
 * 
 * @author haftomtesfay
 *
Enter Your First Name Followed by ur Last Name
haftom
alemayehu
Your Username is:halema819

 */
public class Q4 {
	public static void main(String[] args) {
		
		int min = 100;
		int max = 999;
				
		Scanner firstName = new Scanner(System.in);
		Scanner lastName = new Scanner(System.in);
		
		System.out.println("Enter Your First Name Followed by ur Last Name");
		
		String fname = firstName.next();
		String lname = lastName.next();
		
		String userName = fname.substring(0, 1).concat(lname.substring(0, 5));
		
		int input = min + (int) (Math.random() * ( (max - min ) + 1));
		
		System.out.println("Your Username is:" +userName+input);
	}
}
