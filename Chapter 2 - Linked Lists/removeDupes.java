public class removeDupes{
	static removeDupes(Node head){
		
	}

	public static void main(String[] args){
		Node head = new Node(0);
		Node first = head;
		for (int i=1; i<10; i++) {
			Node second = new Node(i);
			first.next = second;
			first = second;
		}
		printList(head,10);
		removeDupes(head);
	}

	static void printList(Node head, int length){
		Node curr = head;
		for(int j=0; j<length; j++){
			if(curr.next==null)
				System.out.println(curr.data);
			else
				System.out.print(curr.data+", ");
			curr = curr.next;
		}
	}
}




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