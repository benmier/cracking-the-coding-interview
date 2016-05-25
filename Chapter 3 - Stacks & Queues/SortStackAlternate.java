public class SortStackAlternate{
	static void sortStack(Stack unsorted){
		Stack buffer = new Stack();
		System.out.println("Popped "+unsorted.peek()+" from unsorted into buffer");
		buffer.push(unsorted.pop());
		while(!unsorted.isEmpty()){
			int value = unsorted.pop();
			int count = 0;
			while(!buffer.isEmpty() && value<buffer.peek()){
				System.out.println("Popped "+buffer.peek()+" from buffer into unsorted");
				unsorted.push(buffer.pop());
				count++;
			}
			System.out.println("New min! Pushed "+value+" into buffer");
			buffer.push(value);
			// for(int i=0; i<count; i++){
			// 	buffer.push(unsorted.pop());
			// }
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
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		sortStack(stack);
		printStack(stack);
	}
}