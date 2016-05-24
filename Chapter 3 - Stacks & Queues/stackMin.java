import java.util.EmptyStackException;

public class stackMin{

	public static void main(String [] args){
		Stack stack = new Stack();
		stack.pop();
		stack.push(1);
		stack.push(2);
		stack.peek();
	}
}


class Stack{
	private static class StackNode{
		private StackNode next = null;
		private int data;

		public StackNode(int d){
			this.data = d;
		}
	}

	private StackNode top;

	public void push(int d){
		StackNode newNode = new StackNode(d);
		newNode.next = top;
		top = newNode;
		System.out.println("Push: "+top.data);
	}

	public int pop() throws EmptyStackException{
		if(top==null)
			throw new EmptyStackException();
		int item = top.data;
		top = top.next;
		System.out.println("Pop: "+item);
		return item;
	}

	public int peek() throws EmptyStackException{
		if(top==null)
			throw new EmptyStackException();
		System.out.println("Peek: "+top.data);
		return top.data;
	}

	public boolean isEmpty(){
		return top==null;
	}

	// public int minValue(){
	// 	int min;

	// 	return min;
	// }
}