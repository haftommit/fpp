package week3lesson10;
import java.util.Iterator;

import java.util.TreeMap;

import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree

public class Q1 {

	/** The tree root. */

	private BinaryNode root;


	public Q1() {

		root = null;

	}
	private void preOrder(BinaryNode t){

		if (t != null){

			t.display();

			preOrder(t.left);

			preOrder(t.right);

		}

	}

	private void postOrder(BinaryNode t){

		if (t != null){

			preOrder(t.left);

			preOrder(t.right);

			t.display();

		}



	}
	public BinaryNode getRoot(){

		return root;

	}

	public int size(){

		return getSize(root);

	}

	private int getSize(BinaryNode t){

		if (t== null)

			return 0;

		else

			return 1 + getSize(t.left) + getSize(t.right);

	}

	public int leafNodes(BinaryNode t){

		if(t == null)        

			return 0; 



		if(t.left ==null && t.right==null)       

			return 1;             

		else  

			return leafNodes(t.left) + leafNodes(t.right); 

	}

	public boolean isLeaf(){

		if (root.left== null && root.right==null)

			return true;

		else

			return false;

	}

	public boolean contains(int key) {

		BinaryNode current=root;

		while (current.element != key){

			if (key  < current.element )

				current=current.left;

			else

				current=current.right;



			if (current==null)

				return false;

		}

		return true;

	}

	public void printTree() {

		if( root == null )

			System.out.println( "Empty tree" );

		else

			printTree(root);

	}

	// Inorder Traversal to print the nodes in Ascending order

	private void printTree( BinaryNode t ){

		if( t != null ){

			printTree( t.left );

			System.out.print(t.element+",");

			printTree( t.right );

		} 

	}

	//Assume the data in the Node is an Integer.    


	public void insert(Integer x) {

		if (root == null) {

			root = new BinaryNode(x);

			return;

		}

		else { 

			BinaryNode n = root;

			boolean inserted = false;


			while(!inserted)//true

			{

				if(x.compareTo(n.element)<0) {

					//space found on the left

					if(n.left == null){

						n.left = new BinaryNode(x,null,null);

						inserted = true;

					}

					//keep looking for a place to insert (a null)

					else {

						n = n.left;

					}

				}                

				else if(x.compareTo(n.element)>0){ 

					//space found on the right                    

					if(n.right==null){

						n.right = new BinaryNode(x,null,null);

						inserted = true;

					}

					//keep looking for a place to insert (a null)

					else {

						n = n.right;

					}



				}

				// if a node already exists

				else {

					inserted = true;

				}


			}


		}

	}

	private class BinaryNode {


		private Integer element;// The data in the node

		private BinaryNode left;      // Left child

		private BinaryNode right;     // Right child      

		// Constructors 

		BinaryNode( Integer theElement ){

			this( theElement, null, null );

		}    

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){

			this.element = element;

			this.left = left;

			this.right = right;

		}

		public void display(){

			System.out.print( element + " ");

		}

	}
	public static void main(String[] args) {


		Q1 mybst = new Q1();

		int [] a = {10, 5, 15, 45, 12, 22, 19, 16, 3, 100, 2, 25};

		for (int j = 0; j < a.length; j++ ) {

			mybst.insert(a[j]);

		}

		mybst.insert(12);

		mybst.printTree();

		System.out.println("postOrder ... ");

		mybst.postOrder(mybst.root);

		System.out.println("preOrder ... ");

		mybst.preOrder(mybst.root);

		System.out.println("contains 100  ... " + mybst.contains(100));





		TreeSet<Integer> ts = new TreeSet<Integer>();



		for (int j = 0; j < a.length; j++ ) {

			ts.add(a[j]);

			System.out.println("\nAfter inserting " + j + "th item " + a[j]);

			Iterator<Integer> it = ts.iterator();        

			Integer nextItem = null;

			while(it.hasNext()) {

				nextItem = it.next();

				System.out.print(nextItem + " ");

			} 

			System.out.println();

		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(8, "Hello");

		map.put(10, "World!");

		map.put(11, "Welcome");

		map.remove(8);

		String str = map.get(11)+", "+ map.get(10);

		System.out.println(str);

	}

}
/**
2,3,5,10,12,15,16,19,22,25,45,100,postOrder ... 
5 3 2 15 12 45 22 19 16 25 100 10 preOrder ... 
10 5 3 2 15 12 45 22 19 16 25 100 contains 100  ... true

After inserting 0th item 10
10 

After inserting 1th item 5
5 10 

After inserting 2th item 15
5 10 15 

After inserting 3th item 45
5 10 15 45 

After inserting 4th item 12
5 10 12 15 45 

After inserting 5th item 22
5 10 12 15 22 45 

After inserting 6th item 19
5 10 12 15 19 22 45 

After inserting 7th item 16
5 10 12 15 16 19 22 45 

After inserting 8th item 3
3 5 10 12 15 16 19 22 45 

After inserting 9th item 100
3 5 10 12 15 16 19 22 45 100 

After inserting 10th item 2
2 3 5 10 12 15 16 19 22 45 100 

After inserting 11th item 25
2 3 5 10 12 15 16 19 22 25 45 100 
Welcome, World!
 */