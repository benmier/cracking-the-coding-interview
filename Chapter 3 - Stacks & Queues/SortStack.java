public class SortStack{
	static void sortStack(Stack unsorted){
		Stack sorted = new Stack();
		Stack buffer = new Stack();
		int min = Integer.MAX_VALUE;
		int temp;
		while(!unsorted.isEmpty()){
			while(!unsorted.isEmpty()){
				temp = unsorted.pop();
				if(temp<min)
					min = temp;
				else
					buffer.push(temp);
			}
			sorted.push(min);
			while(!buffer.isEmpty()){
				temp = buffer.pop();
				if(temp<min)
					min = temp;
				else
					unsorted.push(temp);
			}
			sorted.push(min);
		}
		while(!sorted.isEmpty()){
			unsorted.push(sorted.pop());
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