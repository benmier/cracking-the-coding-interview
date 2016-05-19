public class removeDupes{
	static removeDupes(Node head){
		
	}

	public static void main(String[] args){
		Node head = createList(10);
		printList(head);
		head = removeDupes(head);
		printList(head);
	}

	static Node createList(int length){
		Node head = new Node(0);
		Node first = head;
		for (int i=1; i<length; i++) {
			Node second = new Node(i);
			first.next = second;
			first = second;
		}
		return head;
	}

	static void printList(Node head){
		Node curr = head;
		while(curr.next!=null){
			System.out.print(curr.data+", ");
			curr = curr.next;
		}
		System.out.println(curr.data);
		return;
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

	Node deleteNode(Node head, int d){
		Node n = head;
		if(n.data==d){
			return head.next;
		}
		while(n.next!=null){
			if(n.next.data==d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
}