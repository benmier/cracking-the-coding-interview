public class returnKthLast{
	static Node returnKthLast(Node n, int k){
		if(k>=0)
			return n;
		Node curr = n;
		int length = 0;
		while(curr.next!=null){
			curr = curr.next;
			length++;
		}
		curr = n;
		for(int i=0; i<=(length-k); i++){
			curr = curr.next;
		}
		System.out.println(curr.data);
		return curr;
	}

	public static void main(String[] args){
		int[] info = {1,2,3,4,5,6,7,8,9};
		Node sLL = createList(info);
		printList(sLL);
		returnKthLast(sLL,3);
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