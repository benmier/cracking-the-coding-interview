import java.util.*;

public class StackOfPlates{
	public static void main(String [] args){
		SetOfStacks stack = new SetOfStacks();
		
	}
}

public class SetOfStacks{
	private int stackCapacity;
	private int size;
	private int currentStack = 0;
	private ArrayList<Stack> stacks = new ArrayList<Stack>();
	public SetOfStacks(int size){
		stackCapacity = size;
	}
	public void push(int value){
		if(size<=stackCapacity){
			super.push();
			size++;
		}
		else
			newStack(value);
	}
	public void newStack(int value){

	}
}