public class deleteMiddleNode{
	static void deleteMiddleNode(Node n){
		while(n!=null){
			if(n.next.data==n.data){
				break;
			}
			n.data = n.next.data;
			n = n.next;
		}
	}

	public static void main(String[] args){
		int[] info = {1,2,3,4,5,6,7,8,9};
		Node sLL = createList(info);
		printList(sLL);
		deleteMiddleNode(sLL.next.next.next.next.next);
		printList(sLL);
	}

	static Node createList(int[] info){
		Node head = new Node(0);
		Node first = head;
		for (int i: info) {
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

	static Node deleteNode(Node head, int d){
		Node n = head;
		if(n.data==d)
			return head.next;
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