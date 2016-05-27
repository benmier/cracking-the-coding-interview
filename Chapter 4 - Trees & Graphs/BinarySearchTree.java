import java.util.*;

public class BinarySearchTree{

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		makeTree(array, 0, array.length-1);
	}

	public static Node makeTree(int[] arr, int start, int end){
		if(start<end)
			return null;
		int mid = (start+end)/2;

		makeTree()
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