public class SortStackAlternate{
	static void sortStack(Stack unsorted){
		Stack buffer = new Stack();
		buffer.push(unsorted.pop());
		while(!unsorted.isEmpty()){
			int value = unsorted.pop();
			int count = 0;
			while(!buffer.isEmpty() && value<buffer.peek()){
				unsorted.push(buffer.pop());
				count++;
			}
			buffer.push(value);
			for(int i=0; i<count; i++){
				buffer.push(unsorted.pop());
			}
		}
		while(!buffer.isEmpty()){
			unsorted.push(buffer.pop());
		}
	}

	static void printStack(Stack s){
		while(!s.isEmpty()){
			System.out.print(s.pop()+" ");
		}
		System.out.println("");
	}

	public static void main(String [] args){
		Stack stack = new Stack();
		stack.push(9);
		stack.push(1);
		stack.push(8);
		stack.push(2);
		stack.push(7);
		stack.push(3);
		stack.push(6);
		stack.push(4);
		stack.push(5);
		sortStack(stack);
		printStack(stack);
	}
}