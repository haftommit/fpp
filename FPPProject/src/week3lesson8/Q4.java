package week3lesson8;

class Q4{

	public static void main (String[] a){

		DirectoryOpr dir =new DirectoryOpr();

		dir.insertFirst("ahmed", 12345);

		dir.insertFirst("Layan", 2345);

		dir.insertLast("koo", 8765);

		dir.insertFirst("rasha", 3456);

		dir.insertFirst("soso", 4567);

		dir.insertFirst("koko", 5678);

		dir.displayList();

		dir.insertLast("soo", 9876);

		dir.insertLast("woo", 7654);

		dir.displayList();

		System.out.println("find Directory .. " + dir.find("woo"));

		System.out.println("Directory woop not found .. " + dir.find("woop"));

		System.out.println(dir);

		dir.deleteFirst();

		dir.deleteFirst();

		dir.deleteFirst();

		dir.deleteFirst();

		dir.deleteFirst();

		dir.deleteFirst();

		dir.displayList();

	}

}

class Directory {

	String name;

	long pno; // Phone number

	Directory next;


	public Directory(String name, long pno) { // Initialize values

		this.name=name;

		this.pno=pno;

	}


	// -------------------------------------------------------------

	public void displayDirectory() // display values of single element

	{

		System.out.print("==>[" + name + " " + pno + "]");

	}



	public String toString (){

		return name + "  " + pno;

	}

}


class DirectoryOpr {

	private Directory first;

	private Directory last; 


	// -------------------------------------------------------------

	public DirectoryOpr() // constructor

	{

		first=null;

		last=null;

	}


	// -------------------------------------------------------------

	public boolean isEmpty() // true if no Directory in your list

	{

		return (first==null);

	}

	public void insertFirst(String name, long pno) { // insert at front of list

		Directory newNode=new Directory(name, pno);



		if (isEmpty())

			last=newNode;

		else

			newNode.next=first;



		first=newNode;


	}

	public void insertLast(String name, long pno) // insert at end of list

	{

		Directory newNode=new Directory(name, pno);

		if (isEmpty())

			first=newNode;

		else

			last.next=newNode;

		last=newNode;
	}
	public Directory deleteFirst()  { // delete first Directory

		if (isEmpty())

			return null;

		Directory temp=first;

		if (first.name==null)

			last=null;

		else

			first=first.next;



		return temp;


	}

	public int size() {

		Directory current=first;

		int counter=0;

		while (current!=null){

			counter++;

			current=current.next;

		}

		return counter;

	}

	public void displayList() {

		Directory current =first;

		while (current != null ) {

			current.displayDirectory();

			current=current.next;

		}

		System.out.print("==>[" + "NULL" + "]");

		System.out.println();


	}

	public Directory find(String key)  {    // find link with given key

		if (isEmpty())

			return null;

		Directory current =first;

		while (current.name != key){

			if (current.next== null)

				return null;

			current=current.next;

		}

		return current;

	}

	public String  toString(){

		displayList();

		return "";

	}

}
/*
  ==>[koko 5678]==>[soso 4567]==>[rasha 3456]==>[Layan 2345]==>[ahmed 12345]==>[koo 8765]==>[NULL]
  ==>[koko 5678]==>[soso 4567]==>[rasha 3456]==>[Layan 2345]==>[ahmed 12345]==>[koo 8765]==>[soo 9876]==>[woo 7654]==>[NULL]
  find Directory .. woo  7654
  Directory woop not found .. null
  ==>[koko 5678]==>[soso 4567]==>[rasha 3456]==>[Layan 2345]==>[ahmed 12345]==>[koo 8765]==>[soo 9876]==>[woo 7654]==>[NULL]

  ==>[soo 9876]==>[woo 7654]==>[NULL]
 */ 