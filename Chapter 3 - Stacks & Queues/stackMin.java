import java.util.EmptyStackException;

public class stackMin{

	public static void main(String [] args){
		Stack stack = new Stack();
		stack.push(5);
		stack.push(6);
		stack.push(3);
		stack.push(7);
		stack.minValue();
		stack.pop();
		stack.minValue();
		stack.pop();
		stack.minValue();
	}
}


class Stack{
	private static class StackNode{
		private StackNode next = null;
		private int data;
		private int min;

		public StackNode(int d){
			this.data = d;
		}
	}

	private StackNode top;
	private int stackMin = java.lang.Integer.MAX_VALUE;

	public void push(int d){
		StackNode newNode = new StackNode(d);
		newNode.next = top;
		top = newNode;
		if(d<stackMin){
			stackMin = d;
			top.min = d;
		}
		else
			top.min = stackMin;
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

	public int minValue() throws EmptyStackException{
		if(top==null)
			throw new EmptyStackException();
		System.out.println("Min: "+top.min);
		return top.min;
	}
}