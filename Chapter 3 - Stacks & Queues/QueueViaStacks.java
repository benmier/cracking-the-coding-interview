import java.util.*;

public class QueueViaStacks{
	public static void main(String [] args){
		Queue queue = new Queue();
		queue.push(0);
		queue.push(1);
		queue.peek();
		queue.peek();
	}
}

class Queue{
	Stack s1 = new Stack();
	Stack s2 = new Stack();

	void push(int value){
		s1.push(value);
		System.out.println("Pushed "+s1.peek());
	}

	int peek(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		System.out.println("Peek: "+s2.peek());
		return s2.peek();
	}

	// void pop()
}