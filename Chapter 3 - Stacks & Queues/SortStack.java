public class SortStack{
	static Stack sortStack(Stack unsorted){
		Stack sorted = new Stack();
		Stack buffer = new Stack();
		int min = Integer.MAX_VALUE;
		boolean changed = true;
		while(changed){
			changed = false;
			while(!unsorted.isEmpty()){
				int temp = unsorted.pop();
				if(temp<=min){
					min = temp;
					changed = true;
				}
				buffer.push(temp);
			}
			if(changed){
				sorted.push(min);
				min++;
			}
			System.out.println("New min is "+min);

			while(!buffer.isEmpty()){
				int temp = buffer.pop();
				if(temp<=min){
					min = temp;
					changed = true;
				}
				unsorted.push(temp);
			}
			if(changed){
				sorted.push(min);
				min++;
			}
			System.out.println("New min is "+min);
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