package week3lesson9;

/**
 * Priority Queue using LinkedList
 * @author haftomtesfay
 *
 */
public class Q1 {

	public static void main (String[] args){

		priorityQueueLinked pqueue =new priorityQueueLinked();

		pqueue.add(40);

		pqueue.add(30);

		pqueue.add(20);

		pqueue.add(10);

		pqueue.add(9);

		pqueue.add(1);

		pqueue.add(6);

		pqueue.add(11);

		pqueue.add(2);

		pqueue.add(41);

		pqueue.add(12);

		System.out.println(pqueue);

		System.out.println(pqueue.remove());

		System.out.println(pqueue.remove());

		System.out.println("after removing two item");

		System.out.println( pqueue);

		System.out.println("queue size " +  pqueue.Size());

		System.out.println("queue peek " +  pqueue.peek());

		pqueue.remove();

		pqueue.remove();

		pqueue.remove();

		pqueue.remove();

		pqueue.remove();

		pqueue.remove();

		System.out.println( pqueue);

		pqueue.remove();

		pqueue.remove();

		pqueue.remove();

		pqueue.remove();

		pqueue.remove();

		pqueue.remove();

		System.out.println( pqueue);

	}

}

class NodeQ implements Comparable{

	int data;

	NodeQ next;

	public NodeQ (int data) {

		this.data=data;

	}

	public void display(){

		System.out.print("=>[" + data + "]" );


	}

	public String toString (){

		display();

		return "";
	}

	@Override

	public int compareTo(Object obj){

		if (data > (Integer) obj )

			return 1;

		else if (data < (Integer) obj)

			return -1;

		else

			return 0;

	}

}

class priorityQueueLinked{

	private NodeQ front,rear;

	private int size;

	public priorityQueueLinked(){

		front=null;

		rear=null;

		size=0;

	} 

	public int  Size(){

		return size;
	}

	public boolean isEmpty(){

		return front==null;

	}
	public void add(int data){

		NodeQ newNode=new NodeQ(data);

		size++;

		if (isEmpty()){

			front=rear =newNode;

			front.next=null;

		}

		else if (front==rear ){

			if (rear.data > newNode.data){

				newNode.next=rear;

				front=newNode;

			}

			else{

				rear.next=newNode;

				front=rear;

				newNode.next=null;

			}    

		}

		else {



			NodeQ current=front;

			NodeQ prevoius=null;

			while (current!= null && newNode.data > current.data){

				prevoius=current;

				current=current.next;

			}

			if (prevoius==null){

				newNode.next=front;

				front=newNode;

			}

			else if (prevoius==front){

				newNode.next=prevoius.next;

				front.next=newNode;

			}

			else if (prevoius==rear){

				rear.next=newNode;

				rear=newNode;

				rear.next=null;

			}

			else{

				newNode.next=prevoius.next;

				prevoius.next=newNode;

			}

		}

	}

	public NodeQ remove(){

		if (isEmpty())

			return null;
		NodeQ temp=front;

		front =front.next;

		size--;

		return temp;

	}

	public NodeQ peek(){

		if (isEmpty())

			return null;

		return front;

	}

	public String toString() {

		if (isEmpty()){

			System.out.print("Empty Queue List");

			return "";

		}

		NodeQ current =front;

		System.out.print("Front");

		while (current!= null){

			current.display();

			current=current.next; 

		}

		System.out.print("==Rear");

		System.out.println();

		return "";

	}

}
/**
 * output
Front=>[1]=>[2]=>[6]=>[9]=>[10]=>[11]=>[12]=>[20]=>[30]=>[40]=>[41]==Rear

=>[1]
=>[2]
after removing two item
Front=>[6]=>[9]=>[10]=>[11]=>[12]=>[20]=>[30]=>[40]=>[41]==Rear

queue size 9
=>[6]queue peek 
Front=>[30]=>[40]=>[41]==Rear

Empty Queue List
 */


