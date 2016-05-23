public class Result{
	public Node tail;
	public int size;
	public Result(Node tail, int size){
		this.tail = tail;
		this.size = size;
	}
}

Result getTailAndSize(Node list){
	if(list==null)
		return null;
	int size = 1;
	Node curr = list;
	while(curr.next!=null){
		size++;
		curr = curr.next;
	}
	return new Result(curr, size);
}

Node getKthNode(Node head, int k){
	Node curr = head;
	while(k>0 && curr!=null){
		curr = curr.next;
		k--;
	}
	return curr;
}

public class isIntersection{
	static Node isIntersection(Node n1, Node n2){
		if(list1 == null || list2 == null)
			return null;

		//Get lengths
		Result result1 = getTailAndSize(list1);
		Result result2 = getTailAndSize(list2);

		//If last nodes of the 2 lists aren't equal, no intersection
		if(result1.tail != result2.tail)
			return null;

		//Set pointers to begining of each list
		Node shorter = result1.size < result2.size ? list1 : list2;
		Node longer = result1.size < result2.size ? list2 : list1;
		
		//Advance longer pointer by difference in list lengths
		longer = getKthNode(longer, Math.abs(result1.size - result2.size));

		//Iterate through both lists until intersection
		while(shorter != longer){
			shorter = shorter.next;
			longer = longer.next;
		}

		//Return collision node
		return longer;
	}


	

	public static void main(String[] args){
		int[] info = {0,1,2,4,2,1,0};
		Node sLL = createList(info);
		printList(sLL);
		isIntersection(sLL);
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