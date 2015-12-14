package week3lesson8;


import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

/**
 * 
 * @author haftomtesfay
 *
 */
public class Q2 {

	public static void main (String [] a){

		ArrayList<Marketing> myList=new ArrayList<Marketing>();


		myList.add(new Marketing("Haftom", "apple",1000));

		myList.add(new Marketing("ht", "hp",2000));

		myList.add(new Marketing("meay", "HP",3000));

		myList.add(new Marketing("mamo", "MacBook",3500));

		MarketingSortByNameAndSales sotByNameAndSales = new MarketingSortByNameAndSales();

		System.out.println(myList);

		///        Collections.sort(myList); natural ordering by salesamount 

		Collections.sort(myList,sotByNameAndSales);

		System.out.println("after sort : " + myList);

		System.out.println("List Size : " + myList.size());

		myList.remove(1);

		myList.set(2, new Marketing("sara", "Acer",1000008));

		System.out.println("after modification : " + myList);

	}
}


//natural ordering by salesamount

class Marketing implements Comparable{

	private String employeeName;

	private String productName;

	private int salesamount;



	public Marketing(){



	}

	public Marketing(String employeeName , String productName ,int salesamount ){

		this.employeeName=employeeName;

		this.productName=productName;

		this.salesamount=salesamount;

	}



	public int compareTo(Object ob1){

		Marketing temp=(Marketing)ob1;

		if (this.salesamount > temp.getSalesAmount())

			return 1;

		else if (this.salesamount < temp.getSalesAmount())

			return -1;

		else

			return 0;

		//return this.employeeName.compareToIgnoreCase(temp.getEmployeeName());

	}



	public String getEmployeeName() {

		return employeeName;

	}

	public String getProductName() {

		return productName;

	}

	public int getSalesAmount() {

		return salesamount;

	}

	public String toString(){

		return  employeeName  + " " + productName + " " +  salesamount;

	}

}


class MarketingSortByNameAndSales implements Comparator<Marketing>{

	public int compare(Marketing ob1,Marketing ob2){

		if (ob1.getEmployeeName().compareToIgnoreCase(ob2.getEmployeeName())!= 0)

			return (ob1.getEmployeeName().compareToIgnoreCase(ob2.getEmployeeName()));



		if ( ob1.getSalesAmount() > ob2.getSalesAmount()) 

			return 1;

		else

			return -1;

	}

}
/**
[layan LG 1000005, Zo Ht 1000003, Rasha HP 1000007, Ahmed MacBook Pro 1000009]
after sort : [Ahmed MacBook Pro 1000009, layan LG 1000005, Rasha HP 1000007, Zo Ht 1000003]
List Size : 4
after modification : [Ahmed MacBook Pro 1000009, Rasha HP 1000007, sara Acer 1000008]
 */
