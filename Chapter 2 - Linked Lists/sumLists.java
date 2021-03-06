public class sumLists{
	static Node sumLists(Node n1, Node n2){
		Node sumTotal = new Node(-1);
		Node sum = sumTotal;
		while(n1!=null && n2!=null){
			if(n1.data+n2.data<10){
				if(sum.data==-1)
					sum.data = (n1.data+n2.data);
				else
					sum.data += (n1.data+n2.data);
				if(n1.next!=null && n2.next!=null)
					sum.next = new Node(-1);
			}
			else{
				if(sum.data==-1)
					sum.data = ((n1.data+n2.data)%10);
				else
					sum.data += (n1.data+n2.data)%10;
				if(sum.next==null)
					sum.next = new Node((n1.data+n2.data)/10);
				else
					sum.next.data += ((n1.data+n2.data)/10);
			}
			sum = sum.next;
			n1 = n1.next;
			n2 = n2.next;
		}
		return sumTotal;
	}

	static Node sumListsRecursive(Node l1, Node l2, int carry){
		if(l1==null && l2==null && carry==0)
			return null;
		Node result = new Node(0);
		int value = carry;
		if(l1!=null)
			value += l1.data;
		if(l2!=null)
			value += l2.data;
		result.data = value%10;

		if(l1!=null || l2!=null){
			Node more = sumListsRecursive(l1 == null ? null : l1.next,
											l2 == null ? null : l2.next,
												value >= 10 ? 1 : 0);
			result.next = more;
		}
		return result;
	}


	public static void main(String[] args){
		int[] info = {7,1,8};
		int[] info2 = {5,9,2};
		Node sLL = createList(info);
		Node sLL2 = createList(info2);
		printList(sLL);
		printList(sLL2);
		Node sLL3 = sumListsRecursive(sLL, sLL2, 0);
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