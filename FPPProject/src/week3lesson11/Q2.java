package week3lesson11;
import java.io.*;
import java.util.Scanner;

class PersonItem
{                                
	private String mail_id;  //Person E_Mail-id-Key
	private String name;  // Name of the person

	public PersonItem(String mail_id, String name)          // constructor
	{    this.mail_id = mail_id;
	this.name =name;
	}

	public String getMail_id(){
		return mail_id; 
	}
	public String getName(){
		return name; 
	}
}


class HashTable
{
	private PersonItem[] hashArray;    // array holds hash table
	private int arraySize;
	private PersonItem nonItem;        // for deleted items

	public HashTable(int size)       // constructor
	{
		arraySize = size;
		hashArray = new PersonItem[arraySize];
		nonItem = null;   // deleted item key is -1
	}

	public void displayTable()
	{
		System.out.println("Table: ");
		for(int j=0; j<arraySize; j++)
		{
			if(hashArray[j] != null)
				System.out.println("Index : " + j + " " + hashArray[j].getMail_id() + " " + hashArray[j].getName());
			else
				System.out.println("Index : " + j + " " + "**");
		}
		System.out.println("");
	}

	public int hashFunc(String key)
	{
		int intKey=Math.abs(key.hashCode()) ;
		return intKey % arraySize;       
	}

	public void insert(String key, String v) {
		int hashVal = hashFunc(key);  
		while(hashArray[hashVal] != null &&
				hashArray[hashVal].getMail_id() != key) 

		{
			++hashVal;                
			hashVal %= arraySize;     
		}
		PersonItem obj = new PersonItem(key,v);
		hashArray[hashVal] = obj;    
	} 
	public PersonItem delete(String key)  // delete a DataItem
	{
		int hashVal = hashFunc(key);  // hash the key

		while(hashArray[hashVal] != null)  // until empty cell,
		{                               // found the key?
			if(hashArray[hashVal].getMail_id() == key)
			{
				PersonItem temp = hashArray[hashVal]; // save item
				hashArray[hashVal] = nonItem;       // delete item
				return temp;                        // return item
			}
			++hashVal;                 
			hashVal %= arraySize;      
		}
		return null;                 
	} 

	public boolean find(String key)     
	{
		int hashVal = hashFunc(key);   

		while(hashArray[hashVal] != null)   
		{                               
			if(hashArray[hashVal].getMail_id() == key)
				return true;  
			++hashVal;                 
			hashVal %= arraySize;      
		}
		return false;                  // can't find item
	}

}  
class Q2
{
	public static void main(String[] args) throws IOException
	{
		String aKey;
		String value;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of hash table: ");
		int size = in.nextInt();

		HashTable theHashTable = new HashTable(size);

		theHashTable.insert("haftommit@gmail.com","haftom");
		theHashTable.insert("haftom@gmail.com","tesfay");
		theHashTable.insert("haftommittesfay@gmail.com","yeah");
		theHashTable.insert("Tom@gmail.com","me");

		while(true)                   // interact with user
		{
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, or find: ");
			char choice = in.next().charAt(0); //Read a Char from the console
			switch(choice)
			{
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key and value to insert: ");
				aKey = in.next();
				value = in.next();
				theHashTable.insert(aKey,value);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = in.next();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = in.next();
				System.out.println("Key Found status" + theHashTable.find(aKey));
				break;
			default:
				System.out.print("Invalid entry\n");
			}  
		}  
	}  
} 
/**
Enter size of hash table: 51
Enter first letter of show, insert, delete, or find: i
Enter key and value to insert: haftommit@gmail.com
haftommit
Enter first letter of show, insert, delete, or find: s
Table: 
Index : 0 **
Index : 1 **
Index : 2 **
Index : 3 Tom@gmail.com me
Index : 4 **
Index : 5 **
Index : 6 **
Index : 7 **
Index : 8 **
Index : 9 **
Index : 10 **
Index : 11 **
Index : 12 **
Index : 13 **
Index : 14 **
Index : 15 **
Index : 16 **
Index : 17 haftom@gmail.com tesfay
Index : 18 **
Index : 19 **
Index : 20 **
Index : 21 **
Index : 22 **
Index : 23 haftommit@gmail.com haftom
Index : 24 haftommit@gmail.com haftommit
Index : 25 **
Index : 26 **
Index : 27 **
Index : 28 **
Index : 29 **
Index : 30 **
Index : 31 **
Index : 32 **
Index : 33 **
Index : 34 **
Index : 35 **
Index : 36 **
Index : 37 **
Index : 38 **
Index : 39 **
Index : 40 **
Index : 41 **
Index : 42 **
Index : 43 **
Index : 44 **
Index : 45 **
Index : 46 **
Index : 47 **
Index : 48 **
Index : 49 **
Index : 50 haftommittesfay@gmail.com yeah

Enter first letter of show, insert, delete, or find: 
 */

