package week3lesson8;
/**
 * 
 * @author haftomtesfay
 *
 */
public class Q3 {

	Node header;


	Q3() {

		header = null;

	}


	public void addFront(String item) {

		if (header == null)

			header = new Node(null, item, null);

		else {

			Node n = new Node(null, item, header);

			header.previous = n;

			header = n;

		}

	}


	// Implement the code


	public void addLast(String item) {

		if (header==null){

			header=new Node(null, item, null);

		}

		else{

			Node current=header;

			Node pre=header;

			while (current!=null){

				pre=current;

				current=current.next;

			}

			Node newNode=new Node(pre, item, null);

			pre.next=newNode;

		}



	}


	public Object getFirst(){

		if (!isEmpty())

			return header.value;

		else

			return null;

	}

	public Object getLast(){

		if (!isEmpty()){

			Node current =header;

			Node last=header;

			while (current!= null){

				last=current;

				current=current.next;

			}

			return last.value;

		}

		else

			return null;



	}

	public void removeFirst(){

		if (isEmpty())

			return ;

		if (header.next==null)

			header=null;

		else {

			header=header.next;

			header.previous=null;

		}



	}



	public void removeLast(){

		if (isEmpty())

			return ;



		Node current =header;

		Node pre=header;

		while (current!= null){

			pre=current;

			current=current.next;

		}

		if (pre.previous==null ) {

			header=null;

		}

		else {

			pre.next=null;

			pre.previous.next=null;

			pre.previous=null;

		}



	}

	// implement the code


	public void postAddNode(Node n, String value){

		Node newNode;

		if (n==null){

			header=new Node(n, value,null);

		}

		else if (n.next == null){

			addLast(value);

		}

		else {

			newNode=new Node(n, value, n.next);

			n.next.previous=newNode;

			n.next=newNode;

		}

	}

	// implement the code


	public int Size(){

		Node current=header;

		int counter=0;

		while (current!=null){

			counter++;

			current=current.next;

		}

		return counter;

	}


	// implement code

	public boolean isEmpty()

	{

		return header==null;

	}  



	public void preAddNode(Node n, String value){

		Node newNode;

		if (n == null){

			//List is empty

			newNode = new Node(null, value, null);

		}

		else if (n.previous == null) {

			//n is the first node

			addFront(value);

		}

		else {

			newNode = new Node(n.previous, value, n);

			n.previous.next = newNode;

			n.previous = newNode;

		}    



	}



	public Node findLast() {

		if (header == null)

			return null;

		else {

			Node temp = header;

			while (temp.next != null)

				temp = temp.next;

			return temp;

		}

	}


	public Node findItem(String str) {

		if (header == null)

			return null;

		else {

			Node temp = header;

			while (temp != null)

				if (str.equals(temp.value))

					return temp;

				else

					temp = temp.next;

			return null;

		}

	}


	public void deleteNode(Node n) {

		if (header != null && n != null) {

			if (n.next == null && n.previous == null) {

				// only one node

				header = null;

				n = null;

				System.out.println("I am here 1");


			} else if (n.previous == null) {

				// remove first node

				n.next.previous = null;

				header = n.next;

				n = null;

				System.out.println("I am here 2");

			} else if (n.next == null) {

				// remove last node

				n.previous.next = null;

				n = null;

				System.out.println("I am here 3");

			} else {

				// general case

				n.next.previous = n.previous;

				n.previous.next = n.next;

				n = null;

				System.out.println("I am here 4");

			}


		}


	}



	public void deleteList(){

		Node tempOne = header;

		Node tempTwo = header;

		while (tempOne != null) {

			tempOne = tempOne.next;

			tempTwo = null;

			tempTwo = tempOne;

		}

		header = null;

	}


	public String toString() {

		String str =""; 

		Node temp = header;

		while (temp != null) {

			str = str + "-->[" + temp.value.toString() + "]";

			temp = temp.next;

		}

		str = str + "-->[" + "NULL" + "]";

		return str;

	}


	public void printReverse() {

		String str =""; 

		Node temp = findLast();

		while (temp != null) {

			str = str + "==>[" + temp.value.toString() + "]";

			temp = temp.previous;

		}

		str = str + "==>[" + "NULL" + "]";

		System.out.println(str);

	}



	public class Node {

		String value;

		Node next;

		Node previous;


		Node(Node previous, String value, Node next) {

			this.previous = previous;

			this.value = value;

			this.next = next;

		}


		public String toString() {

			return value;

		}

	}


	public static void main(String[] args) {

		Q3 mySL = new Q3();

		System.out.println(mySL);

		mySL.printReverse();

		mySL.addFront("Carrot Cake");

		System.out.println(mySL);

		mySL.printReverse();

		mySL.addFront("Blueberry Muffin");

		System.out.println(mySL);

		mySL.printReverse();

		mySL.addFront("Apple Pie");

		System.out.println(mySL);

		mySL.printReverse();

		mySL.addLast("Orange Juice");

		System.out.println(mySL);

		mySL.printReverse();

		mySL.addLast("Peach Sauce");

		System.out.println(mySL);

		mySL.printReverse();

		mySL.deleteNode(mySL.findItem("Apple Pie"));

		System.out.println(mySL);

		mySL.printReverse();

		mySL.deleteNode(mySL.findItem("Peach Sauce"));

		System.out.println(mySL);

		mySL.printReverse();

		mySL.deleteNode(mySL.findItem("Carrot Cake"));

		System.out.println(mySL);

		mySL.printReverse();

		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");

		System.out.println(mySL);

		mySL.printReverse();

		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie" );

		System.out.println(mySL);

		mySL.printReverse();

		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight" );

		System.out.println(mySL);

		mySL.printReverse();

		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie" );

		System.out.println(mySL);

		mySL.printReverse();

		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce" );

		System.out.println(mySL);

		mySL.printReverse();

		mySL.deleteList();

		System.out.println(mySL);

		mySL.printReverse();




	}


}
/**
-->[NULL]
==>[NULL]
-->[Carrot Cake]-->[NULL]
==>[Carrot Cake]==>[NULL]
-->[Blueberry Muffin]-->[Carrot Cake]-->[NULL]
==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[NULL]
==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
==>[Peach Sauce]==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
I am here 2
-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
==>[Peach Sauce]==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
I am here 3
-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
I am here 4
-->[Blueberry Muffin]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Blueberry Muffin]==>[NULL]
-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Danish Delight]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Mango Smoothie]==>[Danish Delight]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
==>[Peach Sauce]==>[Orange Juice]==>[Mango Smoothie]==>[Danish Delight]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[NULL]
==>[NULL]
 */

