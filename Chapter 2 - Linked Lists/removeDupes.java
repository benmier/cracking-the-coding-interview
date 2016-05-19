public class removeDupes{
	static Node removeDupes(Node head){
		int[] arr = new int[128];
		Node curr = head;
		while(curr.next.next!=null){
			arr[curr.data]++;
			curr = curr.next;
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
			if(arr[i]>1)
				deleteNode(head,i);
		}
		return head;
	}

	public static void main(String[] args){
		int[] info = {1,2,3,4,6,6,7,8,9};
		Node head = createList(info);
		printList(head);
		head = removeDupes(head);
		printList(head);
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