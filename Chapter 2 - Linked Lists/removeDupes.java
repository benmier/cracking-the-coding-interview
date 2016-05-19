class Node{
	Node next = null;
	int data;

	public Node(int d){
		data = d;
	}

	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}
}

public class removeDupes{


	public static void main(String[] args){
		Node first = new Node(0);
		Node head = first;
		Node second = first;
		for (int i = 1; i < 8; i++) {
			second = new Node(i);
			first.next = second;
			first = second;
		}
		System.out.println(head.printForward());
	}
}