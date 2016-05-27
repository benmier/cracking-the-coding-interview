import java.util.*;

public class BinarySearchTree{

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		BinarySearchTree(array);
	}

	public static void BinarySearchTree(int[] array){
		LinkedList<Node> tree = new LinkedList<Node>();
		Node root = new Node(5);
		// int root = array.length%2==0 ? array[array.length/2-1] : array[array.length/2];
		System.out.println(root.data);
		// for(int i=0; i<array.length; i++){
		// 	Node n = 
		// }
	}
}

class Node{
	int data;
	Node next = null;
	void Node(int data){
		this.data = data;
	}
}