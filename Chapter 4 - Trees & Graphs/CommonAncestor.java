import java.util.*;

public class CommonAncestor{

	public static Integer commonAncestor(Node node){
		
	}


	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1,null);
		System.out.println(commonAncestor(tree.right.right.right,tree.right.right.left));
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