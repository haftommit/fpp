package week1lesson2;
import java.util.*;
/**
 * 
 * @author haftomtesfay
 *
Enter a 4-digit number: 
1465
9847
 */
public class EC_Decrpyt {

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
		int digits[] = new int[4];
		digits[0] = (input/1000)		%10;
		digits[1] = ((input%1000 /100))		%10;
		digits[2] = ((input%100 /10)) 		%10;
		digits[3] = (input%10)			%10;
		for(int i=0;i<4;i++)
			digits[i] = (digits[i]>=7? digits[i]-7 : digits[i]+3);
		
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
