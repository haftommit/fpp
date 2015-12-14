package week3lesson11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * 
 * @author haftomtesfay
 *
 */

public class Q1 {
	String c_name;
	String[] faculty;

	public Q1 (String c_name  , String[] faculty) {
		this.c_name=c_name;
		this.faculty=faculty;
	}

	public String getC_name() {
		return c_name;
	}

	public String[] getFaculty() {
		return faculty;
	}

	public String toString (){
		return c_name + " " + Arrays.toString(getFaculty()) ;
	}

	public static void main (String [] a){
		HashMap<String, Q1> courseTB =new HashMap<>();
		courseTB.put("CS390", new Q1("FPP",new String [] {"Renuka" , "Joe Lermon" , "Paul"}));
		courseTB.put("CS400", new Q1("MPP",new String [] {"Smith" , "Tom" , "Zoo"}));
		courseTB.put("CS500", new Q1("AWP",new String [] {"WOO" , "Koo" , "Noo"}));
		courseTB.put("CS550", new Q1("ASD",new String [] {"MOO" , "Foo" , "Joo"}));

		System.out.println("Search for course CS500 .." + courseTB.get("CS500"));
		System.out.println("Search for course CS390 .." + courseTB.get("CS390"));
		System.out.println("Search for course CS399 .." + courseTB.get("CS399"));
		Set<String> mySet=courseTB.keySet();

		System.out.println("table keys...");
		mySet.forEach(name -> System.out.println( name));

		System.out.println("table values ...");
		mySet.forEach( name  -> System.out.println( courseTB.get(name)));

		System.out.println("all table values ...");
		mySet.forEach( name  -> System.out.println(name + " " + courseTB.get(name)));
		System.out.println("table size..." + courseTB.size());

	}

}
/**
Search for course CS500 ..AWP [WOO, Koo, Noo]
Search for course CS390 ..FPP [Renuka, Joe Lermon, Paul]
Search for course CS399 ..null
table keys...
CS400
CS500
CS550
CS390
table values ...
MPP [Smith, Tom, Zoo]
AWP [WOO, Koo, Noo]
ASD [MOO, Foo, Joo]
FPP [Renuka, Joe Lermon, Paul]
all table values ...
CS400 MPP [Smith, Tom, Zoo]
CS500 AWP [WOO, Koo, Noo]
CS550 ASD [MOO, Foo, Joo]
CS390 FPP [Renuka, Joe Lermon, Paul]
table size...4
 */

