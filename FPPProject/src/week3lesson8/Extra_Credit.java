package week3lesson8;
/**
 * 
 * @author haftomtesfay
 *
 */
public class Extra_Credit {

	public static void main (String[] a){

		CircularLink circ =new CircularLink();

		circ.displayList();

		circ.insertFirst(10);

		circ.insertFirst(60);

		circ.displayList();

		circ.insertFirst(30);

		circ.displayList();

		circ.insertFirst(50);

		circ.insertFirst(40);

		circ.displayList();

		System.out.println("List size " + circ.Size());

		System.out.println("find Directory .. " + circ.find(30));

		System.out.println("Directory woop not found .. " + circ.find(130));

		System.out.println(circ);

		circ.deleteAtPos(50);

		System.out.println("After delete pos 50 " );

		circ.displayList();

		circ.deleteFirst();

		System.out.println("After delete first ... " ); 

		circ.displayList();

		System.out.println("List size " + circ.Size());

	}

}
class Node{

	int iData;

	Node next;

	public Node(int iData){

		this.iData=iData;

	}

	public void display(){

		System.out.print("==>[" + iData + "]") ;

	}

	@Override

	public String toString(){

		return "==>[" + iData + "]";

	}

}

class CircularLink{

	private Node root;

	private int counter;



	public CircularLink(){

		root=null;

		counter=0;

	}


	public boolean isEmpty(){

		return (root==null);

	}

	public int Size(){

		return counter;

	}



	public void insertFirst(int iData){

		counter++;

		Node newData=new Node(iData);

		if (isEmpty()) {

			newData.next=newData;

		}

		else{

			Node current =root;

			while (current.next != root){

				current=current.next;

			}

			current.next=newData;

			newData.next=root;

		}

		root=newData;

	}

	public void displayList(){

		if (isEmpty())

			System.out.println("Empty List");

		else{

			Node current =root;

			while (current.next!= root){

				current.display();

				current=current.next;

			}

			System.out.print("==>[" + current.iData + "]-----Last--->first---->[" + current.next.iData + "]" );

			System.out.println();

		}
	}

	public Node deleteAtPos(int iData){

		if (isEmpty())

			return null;

		Node temp=null;



		if (iData == root.iData)

			temp=deleteFirst();

		else{

			Node current =root;

			Node prevoius=root;

			while (current.next!= root){

				if (current.iData==iData)

					break;

				prevoius=current;

				current=current.next;

			}

			counter--;

			prevoius.next=current.next;

		}

		return temp;

	}

	public Node deleteFirst(){

		if (isEmpty())

			return null;


		if (counter==1){

			root=null;

			counter=0;

			return null;

		}

		Node temp=root;

		Node current =root;



		while (current.next!= root){

			current=current.next;

		}

		current.next=root.next;

		root=root.next;

		counter--;

		return temp;

	}

	public Node find(int iData){

		if (isEmpty())

			return null;


		Node current =root;

		while (current.next!= root){

			if (current.iData==iData)

				return current;

			current=current.next;

		}

		return null;

	}

	public String toString(){

		displayList();

		return "";

	}
}
/**
Empty List
==>[60]==>[10]-----Last--->first---->[60]
==>[30]==>[60]==>[10]-----Last--->first---->[30]
==>[40]==>[50]==>[30]==>[60]==>[10]-----Last--->first---->[40]
List size 5
find Directory .. ==>[30]
Directory woop not found .. null
==>[40]==>[50]==>[30]==>[60]==>[10]-----Last--->first---->[40]

After delete pos 50 
==>[40]==>[30]==>[60]==>[10]-----Last--->first---->[40]
After delete first ... 
==>[30]==>[60]==>[10]-----Last--->first---->[30]
List size 3
 */

