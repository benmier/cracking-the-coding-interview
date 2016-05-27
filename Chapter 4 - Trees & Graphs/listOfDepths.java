import java.util.*;

public class listOfDepths{

	public static void listOfDepths(Node node, ArrayList<LinkedList<Node>> lists, int depth){
		LinkedList<Node> list = null;
		if(list.size()==level){
			list = new LinkedList<Node>();
			lists.add(list);
		}
		if(node!=null){
			System.out.println(node.name+" "+depth); 
			listOfDepths(node.left,depth+1);
			listOfDepths(node.right,depth+1);
		}
	}

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		listOfDepths(tree,0);
		System.out.println("");
	}

	public static Node makeTree(int[] arr, int start, int end){
		if(start>end)
			return null;
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		// System.out.print(mid+" ");
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