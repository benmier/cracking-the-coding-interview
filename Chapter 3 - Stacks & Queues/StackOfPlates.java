import java.util.*;

public class StackOfPlates{
	public static void main(String [] args){
		SetOfStacks stacks = new SetOfStacks(3);
		stacks.push(1);
		stacks.push(7);
		stacks.push(2);
		stacks.push(3);
		stacks.push(1);
		stacks.push(7);
		stacks.pop();
		stacks.pop();
		stacks.pop();
		stacks.pop();
		stacks.pop();
		stacks.pop();
	}
}

class SetOfStacks{
	private int stackCapacity;
	private int size;
	private int currentStack = 0;
	private ArrayList<Stack> stacks = new ArrayList<Stack>();
	
	public SetOfStacks(int size){
		stackCapacity = size;
		Stack first = new Stack();
		stacks.add(first);
	}

	public void push(int value){
		if(size<stackCapacity){
			stacks.get(currentStack).push(value);
			size++;
			System.out.println("Pushed "+value+" to stack "+currentStack+" with size now "+size);
		}
		else{
			Stack newStack = new Stack();
			newStack.push(value);
			stacks.add(newStack);
			size = 1;
			currentStack++;
			System.out.println("Pushed "+value+" to stack "+currentStack+" with size now "+size);
		}
	}

	public int pop() throws EmptyStackException{
		if(currentStack==0 && size==0)
			throw new EmptyStackException();
		else if(size==0){
			currentStack--;
			size = stackCapacity - 1;
			stacks.remove(stacks.size() - 1);
		}
		else
			size--;
		int popped = stacks.get(currentStack).pop();
		System.out.println("Popped "+popped+" from stack "+currentStack+" with size now "+size);
		return popped;

	} 
}