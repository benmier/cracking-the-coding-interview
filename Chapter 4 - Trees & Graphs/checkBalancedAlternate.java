import java.util.*;

public class checkBalancedAlternate{

	public static int checkHeight(Node root){
		if(root==null)
			return -1;

		int leftHeight = checkHeight(root.left);
		if(leftHeight==Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		int rightHeight = checkHeight(root.right);
		System.out.println(root.name+" "+leftHeight+" "+rightHeight);
		if(rightHeight==Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		if(Math.abs(leftHeight-rightHeight)>1)
			return Integer.MIN_VALUE;
		else
			return Math.max(leftHeight,rightHeight)+1;
	}

	static boolean isBalanced(Node root){
		return checkHeight(root)!=Integer.MIN_VALUE;
	}

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		System.out.println(isBalanced(tree));
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