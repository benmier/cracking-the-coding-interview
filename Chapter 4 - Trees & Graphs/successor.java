import java.util.*;

public class successor{

	public static Integer successor(Node node){
		if(node!=null){
			successor(node.left);
			System.out.println(node.name); 
			successor(node.right);
		}
		return null;
	}


	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		System.out.println(successor(tree.left.right.right));
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