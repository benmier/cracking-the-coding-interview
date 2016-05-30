import java.util.*;

public class BuildOrder{

	public static boolean successor(){
		char ab = 'a', cd = 'b';
		if('a'<'b')
			return true;
		return false;
	}


	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1,null);
		System.out.println(successor());
	}

	public static Node makeTree(int[] arr, int start, int end, Node parent){
		if(start>end)
			return null;
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		n.parent = parent;
		n.left = makeTree(arr,start,mid-1,n);
		n.right = makeTree(arr,mid+1,end,n);
		return n;
	}
}

class Node{
	int name;
	Node left = null;
	Node right = null;
	Node parent = null;
	public Node(int name){
		this.name = name;
	}
}