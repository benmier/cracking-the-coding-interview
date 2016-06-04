import java.util.*;

public class CheckSubtree{

	public static StringBuilder getOrderString(Node node, StringBuilder string){
		if(node==null)
			string.append("X ");
		else{
			string.append(node.name+" ");
			getOrderString(node.left, string);
			getOrderString(node.right, string);
		}
		return string;
	}

	public static boolean checkSubtree(Node node1, Node node2){
		StringBuilder string1 = new StringBuilder();
		StringBuilder string2 = new StringBuilder();
		string1 = getOrderString(node1,string1);
		string2 = getOrderString(node1,string1);
		return string1.indexOf(string2.toString())!=-1;
	}


	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		int[] array2 = {6,7,8,9,10};
		Node tree2 = makeTree(array2, 0, array2.length-1);
		System.out.println(checkSubtree(tree,tree2));
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