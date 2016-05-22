import java.util.HashMap;
public class palindrome{
	static boolean palindrome(Node n){
		HashMap charSet = new HashMap();
		while(n!=null){
			if(charSet.containsKey(n.data))
				charSet.put(n.data,0);
			else
				charSet.put(n.data,1);
			n = n.next;
		}
		return true;
	}

	public static void main(String[] args){
		char[] info = {'r','a','c','e','c','a','r'};
		Node sLL = createList(info);
		printList(sLL);
		System.out.println(palindrome(sLL));
	}

	static Node createList(char[] info){
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