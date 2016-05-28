import java.util.*;

public class successor{

	public static int successor(Node node){
		if(node.left!=null)
			return node.left.name;
		if(node.right!=null)
			return node.right.name;
		return 0;
	}


	public static void main(String [] args){
		int[] array = {0,1,2,3,4,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		System.out.println(successor(tree.left));
	}

	public static Node makeTree(int[] arr, int start, int end){
		if(start>end)
			return null;
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		n.left = makeTree(arr,start,mid-1);
		n.right = makeTree(arr,mid+1,end);
		return n;
	}
}