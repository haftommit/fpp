package week1lesson3;
/**
 * 
 * @author haftomtesfay

Prametarazed Billing One 21.60
Prametarazed Billing Two 108.00
Prametarazed Billing Three 105.84

*/
public class Billing {

	private double total = 0.0;
	private final double tax = 0.08;
	
	public double computeBill(int price){
		
		return total = price * (1+tax);
	}

	public double computeBill(int price, int quantity){
		return price * (1+tax) * quantity;
	}

	public double computeBill(int price, int quantity, double coupon){
		return price * (1+tax) * quantity * (1-coupon*0.01);
	}
	
	public static void main(String[] args) {
		
		Billing billObj = new Billing();
		
		System.out.printf("Prametarazed Billing One %.2f\n",billObj.computeBill(20));
		System.out.printf("Prametarazed Billing Two %.2f\n",billObj.computeBill(20,5));
		System.out.printf("Prametarazed Billing Three %.2f\n",billObj.computeBill(20,5,2));

	}
}


