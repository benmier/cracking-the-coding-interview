public class stackMin{
	static int stackMin(){

	}

	public static void main(String [] args){
		Stack stack = new Stack();
		for(int i=0; i<10; i++){
			stack.push(i);
		}
		System.out.println(stack.toString());
		System.out.println(stackMin());
	}
}

public class Stack2{
	public Stack(){
		Node stack = new Node(0); 
	}
	public void push(int val){
		this.appendToTail(val);
	}
	public void pop(){
		this.
	}
}


class Stack{
	private static class StackNode{
		private StackNode next = null;
		private int data;

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