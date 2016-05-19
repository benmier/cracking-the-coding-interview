public class removeDupes{
	static Node removeDupes(Node head){
		int[] arr = new int[128];
		Node curr = head;
		while(curr.next.next!=null){
			arr[curr.data]++;
			curr = curr.next;
		}
		// for(int i=0; i<arr.length; i++){
			// if(arr[i]>1)
				head.deleteNode(0);
		// }
		return head;
	}

	public static void main(String[] args){
		int[] info = {1,2,3,4,5,6,7,8,9};
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

	void deleteNode(int d){
		Node n = this;
		if(n.data==d){
			n.next = n;
			return;
		}
		while(n.next!=null){
			if(n.next.data==d){
				n = n.next;
				return;
			}
			n = n.next;
		}
		return;
	}
}