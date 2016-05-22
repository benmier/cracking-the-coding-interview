import java.util.HashMap;
public class palindrome{
	static boolean palindrome(Node n){
		if(n==null)
			return false;
		int[] charSet = new int[128];
		while(n!=null){
			charSet[n.data]++;
			n = n.next;
		}
		int count = 0;
		for(int i: charSet){
			if(count>1)
				return false;
			if(i%2!=0)
				count++;
		}
		return true;
	}

	static Node palindromeAlternate(Node n){
		Node reversed = reverseAndClone(n);
		return reversed;
	}

		static Node reverseAndClone(Node n){
			Node head = null;
			while(n!=null){
				Node n2 = new Node(n.data);
				n.next = head;
				head = n2;
				n = n.next;
			}
			return head;
		}

		static boolean isEqual(Node n1, Node n2){
			while(n1!=null && n2!=null){
				if(n1.data!=n2.data)
					return false;
				n1 = n1.next;
				n2 = n2.next;
			}
			return n1==null && n2==null;
		}

	public static void main(String[] args){
		int[] info = {0,1,2,4,3,2,1,0};
		Node sLL = createList(info);
		printList(sLL);
		System.out.println(palindromeAlternate(sLL));
		Node sLL2 = palindromeAlternate(sLL);
		printList(sLL2);
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