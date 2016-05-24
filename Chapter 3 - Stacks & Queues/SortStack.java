public class SortStack{
	static void sortStack(Stack unsorted){
		Stack sorted = new Stack();
		Stack buffer = new Stack();
		int min;
		boolean finished = true;
		while(!finished){
			finished = true;
			shiftStacks(unsorted,buffer);
			shiftStacks(buffer,unsorted);
		}
		while(!sorted.isEmpty()){
			unsorted.push(sorted.pop());
		}
	}

	static void shiftStacks(Stack s1, Stack s2){
		min = Integer.MAX_VALUE;
		while(!s1.isEmpty()){
			int temp = s1.pop();
			if(temp<min){
				min = temp;
				finished = false;
			}
			else if(temp!=min)
				s2.push(temp);
		}
		sorted.push(min);
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