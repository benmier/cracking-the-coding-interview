public class stackMin{
	// static int stackMin(){

	// }

	public static void main(String [] args){
		Stack stack = new Stack();
		for(int i=0; i<10; i++){
			stack.push(i);
		}
		System.out.println(stack.peek());
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
	}

	public int pop(){
		int item = top.data;
		top = top.next;
		return item;
	}

	public int peek(){
		return top.data;
	}

	public boolean isEmpty(){
		return top==null;
	}
}