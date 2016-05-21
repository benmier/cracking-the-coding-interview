public class partition{
	static Node partition(Node n, int x){
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		while(n!=null){
			Node next = n.next;
			n.next = null;
			if(n.data<x){
				if(beforeStart==null){
					beforeStart = n;
					beforeEnd = beforeStart;
				} 
				else{
					beforeEnd.next = n;
					beforeEnd = n;
				}
			}
			else{
				if(afterStart==null){
					afterStart = n;
					afterEnd = afterStart;
				}
				else{
					afterEnd.next = n;
					afterEnd = n;
				}
			}
			n = next;
		}
		if(beforeStart == null)
			return afterStart;
		beforeEnd.next = afterStart;
		return beforeStart;
	}

	static Node partitionAlternate(Node n, int x){
		Node head = n;
		Node tail = n;
		while(n!=null){
			Node next = n.next;
			if(n.data<x){
				n.next = head;
				head = n;
			}
			else{
				tail.next = n;
				tail = n;
			}
			n = next;
		}
		tail.next = null;
		return head;
	}


	public static void main(String[] args){
		int[] info = {3,5,8,5,10,2,1};
		Node sLL = createList(info);
		printList(sLL);
		Node sLL2 = partitionAlternate(sLL,5);
		printList(sLL2);
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