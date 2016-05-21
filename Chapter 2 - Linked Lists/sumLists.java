public class sumLists{
	static Node sumLists(Node n1, Node n2){
		Node sum = null;
		sum.next = null;
		while(n1!=null || n2!=null){
			if(n1.data+n2.data<10){
				if(sum==null)
					sum = new Node(n1.data+n2.data);
				else if(sum.next==null)
					sum.next = new Node(n1.data+n2.data);
				else
					sum.next.data += (n1.data+n2.data);
			}
			else{
				if(sum==null){
					sum = new Node((n1.data+n2.data)%10);
				}
				else if(sum.next==null)
					sum.next = new Node((n1.data+n2.data)/10);
				else
					sum.next.data += (n1.data+n2.data)/10;
			}
			sum = sum.next;
			n1 = n1.next;
			n2 = n2.next;
		}
		return sum;
	}


	public static void main(String[] args){
		int[] info = {1,2,3};
		int[] info2 = {4,5,6};
		Node sLL = createList(info);
		Node sLL2 = createList(info2);
		printList(sLL);
		printList(sLL2);
		Node sLL3 = sumLists(sLL, sLL2);
		printList(sLL3);
	}

	static Node createList(int[] info){
		Node head = new Node(info[0]);
		Node first = head;
		for (int i=1; i<info.length; i++) {
			Node second = new Node(info[i]);
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