import java.util.*;

public class CheckSubtree{

	public static void checkSubtree(Node node){
		if(node!=null || node.name!=-1){
			System.out.print(node.name+" ");
			if(node.left==null){
				node.left = new Node(-1);
				System.out.print(node.left.name+" ");
			}
			else
				checkSubtree(node.left);
			if(node.right==null){
				node.right = new Node(-1);
				System.out.print(node.right.name+" ");
			}
			else
				checkSubtree(node.right);
		}
	}


	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		checkSubtree(tree);
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

class Node{
	Integer name;
	Node left = null;
	Node right = null;
	Node parent = null;
	public Node(Integer name){
		this.name = name;
	}
}