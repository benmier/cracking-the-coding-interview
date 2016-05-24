public class QueueViaStacks{
	public static void main(String [] args){
		Queue queue = new Queue();
		queue.add(4);
		queue.add(2);
		queue.add(9);
		queue.add(3);
		queue.add(7);
		queue.remove();
		queue.add(8);
		queue.add(0);
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
	}
}

class Queue{
	Stack s1 = new Stack();
	Stack s2 = new Stack();

	void add(int value){
		s1.push(value);
		System.out.println("Added "+s1.peek());
	}

	int peek(){
		invertStacks();
		System.out.println("Peek: "+s2.peek());
		return s2.peek();
	}

	int remove(){
		invertStacks();
		System.out.println("Removed "+s2.peek());
		return s2.pop();
	}

	void invertStacks(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
	}
}