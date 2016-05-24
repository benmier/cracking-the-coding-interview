import java.util.EmptyStackException;

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
	private int stackMin = Integer.MAX_VALUE;

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
	}

	public int pop() throws EmptyStackException{
		if(top==null)
			throw new EmptyStackException();
		int item = top.data;
		top = top.next;
		return item;
	}

	public int peek() throws EmptyStackException{
		if(top==null)
			throw new EmptyStackException();
		return top.data;
	}

	public boolean isEmpty(){
		return top==null;
	}

	public int minValue() throws EmptyStackException{
		if(top==null)
			throw new EmptyStackException();
		return top.min;
	}
}