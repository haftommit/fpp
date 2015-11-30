package week1lesson2;
import java.util.*;
/**
 * @author haftomtesfay
 *
Enter a 4-digit number: 
9847
1465
 */
public class EC_Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4-digit number: ");
		int input = sc.nextInt();
		while(input > 9999 && input <1000)
		{
			System.out.println("Wrong Input,Please Enter a 4-digit number :");
			input = sc.nextInt();
		}
		//adding 7 to each digit and getting the remainder
		int digits[] = new int[4];
		digits[0] = (input/1000 + 7)%10;
		digits[1] = ((input%1000 /100) + 7)%10;
		digits[2] = ((input%100 /10) +7) %10;
		digits[3] = (input%10 + 7)%10;
		//swapping case
		int temp = digits[0];
		digits[0] = digits[2];
		digits[2] = temp;
		temp = digits[1];
		digits[1] = digits[3];
		digits[3] = temp;
		
		for(int x:digits)
			System.out.print(x);
	}

}
