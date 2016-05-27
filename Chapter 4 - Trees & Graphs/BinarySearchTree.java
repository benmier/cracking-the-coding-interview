import java.util.*;

public class BinarySearchTree{

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		Node tree = makeTree(array, 0, array.length-1);
		inOrderTraversal(tree);
	}

	public static Node makeTree(int[] arr, int start, int end){
		if(start<end)
			return null;
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		n.left = makeTree(arr,start,mid-1);
		n.right = makeTree(arr,mid+1,end);
		return n;
	}

	public static void inOrderTraversal(Node node){
		if(node!=null){
			inOrderTraversal(node.left);
			System.out.print(node.name+" ");
			inOrderTraversal(node.right);
		}
	}
}

class Node{
	int name;
	int[] left;
	int[] right;
	public Node(int name){
		this.name = name;
	}
}