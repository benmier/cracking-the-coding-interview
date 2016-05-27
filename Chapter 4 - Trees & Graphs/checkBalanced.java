import java.util.*;

public class checkBalanced{

	public static boolean checkBalanced(Node node, int leftHeight, int rightHeight){
		if(node!=null){
			System.out.println(node.name+" "+leftHeight+" "+rightHeight);
			leftHeight++;
			checkBalanced(node.left,leftHeight,rightHeight);
			rightHeight++;
			checkBalanced(node.right,leftHeight,rightHeight);
		}
		if(Math.abs(leftHeight-rightHeight)>1)
			return false;
		return true;
	}

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		System.out.println(checkBalanced(tree,0,0));
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