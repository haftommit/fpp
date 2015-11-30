package week1lesson2;
import java.util.*;
/**
 * 
 * @author haftomtesfay
 *
Your weight using lbs:
85
Enter Your Choice(1-6) to know your weight in any of the planets! 
6
Your Weight @Planet Neptus is:104.55

 */
public class Q7 {

	public static void main(String[] args) {
		
		Scanner yourInput = new Scanner(System.in);
		
		System.out.println("Your weight using lbs:");
		int input = yourInput.nextInt();
		System.out.println("Enter Your Choice(1-6) to know your weight in any of the planets! ");
			
			int choice = yourInput.nextInt();
			
			double weight = 0.0;
			switch(choice)
			{
				case 1:
					weight = input * 0.78;
					System.out.println("Your Weight @Planet Venus is:%.02f"+weight);
					break;
				case 2:
					weight = input * 2.65;
					System.out.println("Your Weight @Planet Jupiter is:" +weight);
					break;
				case 3:
					weight = input*0.39;
					System.out.println("Your Weight @Planet Mars is:" +weight);
					break;
				case 4:
					weight = input*1.17;
					System.out.println("Your Weight @Planet Saturn is:" +weight);
					break;
				case 5:
					weight = input*1.05;
					System.out.println("Your Weight @Planet Uranus is:" +weight);
					break;
				case 6:
					weight = input*1.23;
					System.out.println("Your Weight @Planet Neptus is:" +weight);
					break;
				default:
					System.out.println("Your Inpute is Wrong! Please Try Again:");
					break;
			}
	}
}