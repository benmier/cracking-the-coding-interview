import java.util.*;

public class successor{

	public static Integer successor(Node node){
		System.out.println(node.parent.parent.parent.name);
		if(node.right!=null){
			node = node.right;
			while(node.left!=null){
				node = node.left;
			}
			return node.name;
		} else{
			int value = node.name;
			
		}
		return node.name;
	}


	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1,null);
		System.out.println(successor(tree.left.right.right));
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