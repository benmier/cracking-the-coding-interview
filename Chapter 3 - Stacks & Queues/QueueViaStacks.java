import java.util.*;

public class QueueViaStacks{
	public static void main(String [] args){
		Queue queue = new Queue();
		queue.push(4);
		queue.push(2);
		queue.push(9);
		queue.push(3);
		queue.push(7);
		queue.pop();
		queue.push(8);
		queue.push(0);
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
	}
}

class Queue{
	Stack s1 = new Stack();
	Stack s2 = new Stack();

	void add(int value){
		s1.push(value);
		System.out.println("Pushed "+s1.peek());
	}

	int peek(){
		swapStacks();
		System.out.println("Peek: "+s2.peek());
		return s2.peek();
	}

	int remove(){
		swapStacks();
		System.out.println("Popped "+s2.peek());
		return s2.pop();
	}

	void invertStacks() throws EmptyStackException{
		if(s2.isEmpty()){
			if(s1.isEmpty())
				throw new EmptyStackException();
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
	}
}