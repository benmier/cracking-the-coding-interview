public class SortStack{
	static Stack sortStack(Stack unsorted){
		Stack sorted = new Stack();
		Stack buffer = new Stack();
		int min = Integer.MAX_VALUE;
		boolean finished = true;
		while(!finished){
			finished = true;
			while(!unsorted.isEmpty()){
				int temp = unsorted.pop();
				if(temp<min){
					min = temp;
					finished = false;
				}
				if(temp!=min)
					buffer.push(temp);
			}
			sorted.push(min);

			while(!buffer.isEmpty()){
				int temp = buffer.pop();
				if(temp<min){
					min = temp;
					finished = false;
				}
				if(temp!=min)
					unsorted.push(temp);
			}
			sorted.push(min);
		}
		while(!sorted.isEmpty()){
			unsorted.push(sorted.pop());
		}
		return unsorted;
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
		Stack unsorted = sortStack(stack);
		printStack(unsorted);
	}
}