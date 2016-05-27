import java.util.*;

public class BinarySearchTree{

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		makeTree(array);
	}

	public static void makeTree(int[] array){
		Node tree = new Node(array.length%2==0 ? array[array.length/2-1] : array[array.length/2]);

		for(int i=0; i<array.length; i++){
			Node n = new Node(array[i]);
			if(n.name<tree.name)
				tree.children[0] = n;
			else if(n.name>tree.name)
				tree.children[1] = n;
			tree = n;
		}
	}
}

class Node{
	int name;
	Node[] children;
	public Node(int name){
		this.name = name;
	}
}