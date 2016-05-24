public class StackOfPlates{
	public static void main(String [] args){
		SetOfStacks stack = new SetOfStacks();
		
	}
}

public class SetOfStacks extends Stack{
	private int stackCapacity;
	private int size;
	private int currentStack = 0;
	private Stack[] stack = new Stack[10];
	public SetOfStacks(int size){
		stackCapacity = size;
	}
	public void push(int value){
		if(size!=stackCapacity){
			super.push(value);
			size++;
		}
		else
			newStack(value);
	}
	public void newStack(int value){

	}
}