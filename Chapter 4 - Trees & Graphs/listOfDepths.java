import java.util.*;

public class listOfDepths{

	public static void listOfDepths(Node node, ArrayList<LinkedList<Node>> lists, int depth){
		LinkedList<Node> list = null;
		if(lists.size()==depth){
			list = new LinkedList<Node>();
			lists.add(list);
		}
		else
			list = lists.get(depth);
		if(node!=null){
			list.add(node);
			System.out.println(node.name+" "+depth); 
			listOfDepths(node.left,lists,depth+1);
			listOfDepths(node.right,lists,depth+1);
		}
	}

	static ArrayList<LinkedList<Node>> createLevelLinkedList(Node root){
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		listOfDepths(root,lists,0);
		return lists;
	}

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		ArrayList<LinkedList<Node>> lists = createLevelLinkedList(tree);
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