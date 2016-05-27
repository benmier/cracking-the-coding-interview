import java.util.*;

public class listOfDepths{

	public static void listOfDepths(Node node, int depth){
		if(node!=null){
			System.out.print(node.name+" ");
			listOfDepths(node.left);
			listOfDepths(node.right);
		}
	}

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		System.out.println("");
		listOfDepths(tree,0);
	}

	public static Node makeTree(int[] arr, int start, int end){
		if(start>end)
			return null;
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		System.out.print(mid+" ");
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