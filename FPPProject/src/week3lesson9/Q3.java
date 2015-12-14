package week3lesson9;

import java.util.Stack;
/**
 * Palindrome Check using pre -defined Stack class
 * @author haftomtesfay
 *
 */

	public class Q3 {

		static boolean isPalindrome(String str) {

			Stack<Character> mystack = new Stack<>();

			for (int i = 0; i < str.length(); i++) {

				mystack.push(str.charAt(i));

			}

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != mystack.pop())
					return false;
			}
			return true;

		}

		public static void main(String[] args) {

			
			if (isPalindrome("HannaH")) {
				System.out.println("It is palindrome");
			} else
				System.out.println("It is not palindrome");

		}
	}
	/**
	 *Output
	It is  palindrome
	*/