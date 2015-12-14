package week3lesson8;
/**
 * 
 * @author haftomtesfay
 *
 */
public class Q1 {

	public static void main (String [] a){

		PersonArrayOpe opr= new PersonArrayOpe(3);

		opr.insert("Haftom", "tesfay", 27);

		opr.insert("raja", "besha", 35);

		opr.insert("yeah", "beyo", 10);

		System.out.println("Size after insert " + opr.size());

		opr.insert("hellen", "lelo", 10);

		System.out.println("Size after Resize " + opr.size());

		opr.displayAll();

		Person findNo=opr.find("hellen");

		if ( findNo == null )

			System.out.println("Not found ");

		else

			System.out.println("Not found ");

		opr.delete("haftom");

		System.out.println("Delete Amin ... ");

		opr.displayAll();



	}



}


class Person

{

	private String lastName;

	private String firstName;

	private int age;

	public Person(String last, String first, int a)

	{

		this.lastName=last;

		this.firstName=first;

		this.age=a;



	}

	public void displayPerson() 

	{

		if (lastName ==null || lastName.equals(""))

			return ;

		System.out.println("First Name :" + firstName + " Last Name :" + lastName + " Age :" + age);

	}

	public String getLastName() 

	{

		return lastName;

	}

}


class PersonArrayOpe

{

	private Person[] a; 

	private int nElems; 

	private int size;


	public PersonArrayOpe(int max) 

	{

		size=max;

		a= new Person[size];

		nElems=0;

	}



	public Person find(String searchName) 

	{ 

		for (Person pr : a){

			if ( pr==null )

				return null;



			if (pr.getLastName().equals(searchName))

				return pr;

		}

		return null;

	} 


	public void insert(String last, String first, int age)

	{

		if (nElems==size)

			resize();

		Person newDate=new Person(last, first, age);

		a[nElems++]=newDate;

	}

	public boolean delete(String searchName) 

	{ 

		if (nElems==0)

			return false;



		int index=-1;

		for (int i=0;i<a.length;i++){

			if (a[i].getLastName().equals(searchName)){

				index=i;

				break;

			}

		}

		if (index==-1)

			return false;

		Person[] temp=new Person[a.length];

		System.arraycopy(a, 0, temp, 0, index);

		System.arraycopy(a, index+1, temp, index, a.length-(index+1));

		a=temp;

		nElems--;

		return true;

	}

	public void displayAll() 

	{

		for (int i=0;i<nElems;i++)

			a[i].displayPerson();


	}

	public int size() 

	{

		return size;

	}

	private void resize(){

		size=this.size*2;

		Person [] temp=new Person[size];

		System.arraycopy(a, 0, temp, 0, size/2);

		a=temp;

	} 

}
/**
Size after insert 3
Size after Resize 6
First Name :ahmed Last Name :Amin Age :37
First Name :Rasha Last Name :Younis Age :35
First Name :Layan Last Name :Ali Age :1
First Name :Lolo Last Name :Ali Age :10
Not found 
Delete Amin ... 
First Name :Rasha Last Name :Younis Age :35
First Name :Layan Last Name :Ali Age :1
First Name :Lolo Last Name :Ali Age :10
 */