import java.util.*;

public class BinarySearchTree{

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		Node tree = makeTree(array, 0, array.length-1);
		System.out.println("");
		inOrderTraversal(tree);
	}

	public static Node makeTree(int[] arr, int start, int end){
		if(start>end)
			return null;
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		// System.out.println("Start is "+start);
		// System.out.println("Mid is "+mid);
		// System.out.println("End is "+end+"\n");
		n.left = makeTree(arr,start,mid-1);
		n.right = makeTree(arr,mid+1,end);
		return n;
	}

	public static void inOrderTraversal(Node node){
		if(node!=null){
			inOrderTraversal(node.left);
			System.out.println("Node: "+node.name);
			if(node.left.name!=0)
				System.out.println("Left: "+node.left.name);
			if(node.right.name!=0)
				System.out.println("Node: "+node.right.name);
			System.out.println("");
			inOrderTraversal(node.right);
		}
	}
}

class Node{
	int name;
	Node left;
	Node right;
	public Node(int name){
		this.name = name;
	}
}