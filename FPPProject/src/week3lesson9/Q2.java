package week3lesson9;
/**
 * Queue Implementation using Array
 * @author haftomtesfay
 *
 */
import java.util.Arrays;

public class Q2 {


	public static void main(String[] args) {

		queueA myQueue=new queueA(4);

		myQueue.add(12);

		myQueue.add(13);

		myQueue.add(14);

		myQueue.add(6);

		myQueue.add(9);

		myQueue.add(8);

		myQueue.add(4);

		myQueue.add(3);

		myQueue.add(22);

		System.out.println(myQueue);

		System.out.println("Size " + myQueue.Size());

		System.out.println("Capcity " + myQueue.Capacity());

		System.out.println("removing ..." + myQueue.remove());

		System.out.println("removing ..." + myQueue.remove());

		System.out.println("Size after removing " + myQueue.Size());

		System.out.println(myQueue);

		myQueue.remove();

		myQueue.remove();

		myQueue.remove();

		myQueue.remove();

		System.out.println(myQueue);

		myQueue.remove();

		myQueue.remove();

		System.out.println(myQueue);

		myQueue.remove();

		myQueue.remove();

		myQueue.remove();

		myQueue.remove();

		myQueue.remove();

		myQueue.remove();

		System.out.println(myQueue);

		System.out.println("Size " + myQueue.Size());

		System.out.println("Capacity " + myQueue.Capacity());

		myQueue.add(40);

		myQueue.add(33);

		myQueue.add(220);

		System.out.println(myQueue);

		myQueue.add(12);

		myQueue.add(13);

		myQueue.add(14);

		myQueue.add(6);

		myQueue.add(9);

		myQueue.add(8);

		myQueue.add(4);

		myQueue.add(3);

		myQueue.add(22);

		System.out.println(myQueue);

		System.out.println("Size " + myQueue.Size());

		System.out.println("Capacity " + myQueue.Capacity());

	}


}
class queueA{

	private Object[] data;

	private int rear;

	private int front;

	private int size;

	private int nElment;

	public queueA(int init){

		this.rear=-1;

		this.front=0;

		this.size=init;

		this.data=new Object[size];

		this.nElment=0;

	}

	public void add(Object item){

		if (rear==size-1)

			reSize();

		data[++rear]=item;

		nElment++;

	}

	public boolean isEmpty(){

		return nElment==0;

	}

	public int Size(){

		return nElment;

	}

	public int Capacity (){

		return size;

	}

	public Object remove(){

		if (isEmpty())

			return null;

		Object temp=data[front++];

		nElment--;

		return temp;

	}

	public String toString(){

		if (isEmpty())

			return "Empty Queue";

		String str=""; 

		for (int i=front;i<rear+1;i++ ){

			str += "=>[" + data[i] + "]";

		}
		return str;

	}

	public Object peek(){

		if (isEmpty())

			return null;



		return (data[front]);

	}

	private void reSize(){

		this.size=size*2;

		Object [] temp=new Object [size];

		System.arraycopy(data, 0, temp, 0, size/2);

		data=temp;
	}
}
/**
 * output
=>[12]=>[13]=>[14]=>[6]=>[9]=>[8]=>[4]=>[3]=>[22]
Size 9
Capcity 16
removing ...12
removing ...13
Size after removing 7
=>[14]=>[6]=>[9]=>[8]=>[4]=>[3]=>[22]
=>[4]=>[3]=>[22]
=>[22]
Empty Queue
Size 0
Capacity 16
=>[40]=>[33]=>[220]
=>[40]=>[33]=>[220]=>[12]=>[13]=>[14]=>[6]=>[9]=>[8]=>[4]=>[3]=>[22]
Size 12
Capacity 32
 */