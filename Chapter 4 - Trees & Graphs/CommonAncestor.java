import java.util.*;

public class CommonAncestor{

	public static Node commonAncestor(Node node1, Node node2){
		int delta = depth(node1)-depth(node2);
		Node first = delta>0 ? node1 : node2;
		Node second = delta>0 ? node2 : node1;
		delta = Math.abs(delta);
		
		while(delta>0){
			first = first.parent;
			delta--;
		}

		while(first!=second && first!=null && second!=null){
			first = first.parent;
			second = second.parent;
		}

		if(first==null || second==null)
			return null;

		return first;
	}

	static int depth(Node node){
		int depth = 0;
		while(node!=null){
			node = node.parent;
			depth++;
		}
		return depth;
	}


	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1,null);
		commonAncestor(tree.right.right.right,tree.right.left.right);
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