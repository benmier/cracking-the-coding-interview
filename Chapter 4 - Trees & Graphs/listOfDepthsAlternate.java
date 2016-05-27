import java.util.*;

public class listOfDepthsAlternate{

	public static ArrayList<LinkedList<Node>> listOfDepths(Node root){
		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		LinkedList<Node> current = new LinkedList<Node>();
		if(root!=null)
			current.add(root);
			// System.out.println(root.name);
		while(current.size()>0){
			result.add(current); //Add previous level
			// System.out.println(result.get(result.size()-1));
			LinkedList<Node> parents = current; //Go to next level
			current = new LinkedList<Node>();
			for(Node parent: parents){ //Visit the children
				if(parent.left!=null){
					// System.out.println(parent.left.name);
					current.add(parent.left);
				}
				if(parent.right!=null){
					// System.out.println(parent.right.name);
					current.add(parent.right);
				}
			}
		}
		return result;
	}

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		ArrayList<LinkedList<Node>> lists = listOfDepths(tree);
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