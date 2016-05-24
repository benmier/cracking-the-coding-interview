import java.util.*;

public class StackOfPlates{
	public static void main(String [] args){
		SetOfStacks stack = new SetOfStacks(3);
		
	}
}

class SetOfStacks{
	private int stackCapacity;
	private int size;
	private int currentStack = 0;
	private ArrayList<Stack> stacks = new ArrayList<Stack>();
	private Stack first = new Stack();
	stacks.add(first);
	public SetOfStacks(int size){
		stackCapacity = size;
	}
	public void push(int value){
		if(size<=stackCapacity){
			stacks[0].push(value);
			size++;
		}
		else
			newStack(value);
	}
	public void newStack(int value){

	}
}