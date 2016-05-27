import java.util.*;

public class BinarySearchTree{

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		BinarySearchTree(array);
	}

	public static void makeTree(int[] array){
		BinarySearchTree tree = new BinarySearchTree();
		Node root = new Node(array.length%2==0 ? array[array.length/2-1] : array[array.length/2]);

		for(int i=0; i<array.length; i++){
			Node n = new Node(array[i]);

		}
	}
}

class BinarySearchTree{

}

class Node{
	int data;
	Node next = null;
	public Node(int data){
		this.data = data;
	}
}