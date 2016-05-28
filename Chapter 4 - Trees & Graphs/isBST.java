import java.util.*;

public class isBST{

	public static boolean isBST(Node node, int curr){
		if(node!=null){
			isBST(node.left,curr);
			if(curr<node.name)
				return false;
			System.out.print(node.name+" ");
			isBST(node.right,curr);
		}
		return true;
	}


	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1,0};
		Node tree = makeTree(array, 0, array.length-1);
		System.out.println(isBST(tree,Integer.MAX_VALUE));
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