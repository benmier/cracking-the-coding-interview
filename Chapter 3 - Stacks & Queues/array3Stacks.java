import java.util.*;

public class array3Stacks{
	private int numberOfStacks = 3;
	private int stackCapacity;
	private int[] values;
	private int[] sizes;

	public array3Stacks(int stackSize){
		stackCapacity = stackSize;
		values = new int[stackSize*numberOfStacks];
		sizes = new int[numberOfStacks];
	}

	public void push(int stackNum, int value) throws FullStackException{
		if(isFull(stackNum))
			throw new FullStackException();
		sizes[stackNum]++;
		values[indexOfTop(stackNum)] = value;
	}

	public int pop(int stackNum){
		if(isEmpty(stackNum))
			throw new EmptyStackException();
		int topIndex = indexOfTop(stackNum); 
		int value = values[topIndex]; //Get top
		values[topIndex] = 0; //Clear
		sizes[stackNum]--; //Shrink
		return value;
	}

	public int peek(int stackNum){
		if(isEmpty(stackNum))
			throw new EmptyStackException();
		return values[indexOfTop(stackNum)];
	}

	public boolean isEmpty(int stackNum){
		return sizes[stackNum] == 0;
	}

	public boolean isFull(int stackNum){
		return sizes[stackNum] == stackCapacity;
	}

	private int indexOfTop(int stackNum){
		int offset = stackNum * stackCapacity;
		int size = sizes[stackNum];
		return offset + size - 1;
	}

	public void printStacks(array3Stacks stacks) {
		System.out.println(Arrays.deepToString(values));
	}
	
	public static void main(String [] args) throws Exception  {
		array3Stacks stacks = new array3Stacks(4);
		printStacks(stacks);
		stacks.push(0, 10);
		printStacks(stacks);
		stacks.push(1, 20);
		printStacks(stacks);
		stacks.push(2, 30);
		printStacks(stacks);
		
		stacks.push(1, 21);
		printStacks(stacks);
		stacks.push(0, 11);
		printStacks(stacks);
		stacks.push(0, 12);
		printStacks(stacks);
		
		stacks.pop(0);
		printStacks(stacks);
		
		stacks.push(2, 31);
		printStacks(stacks);
		
		stacks.push(0, 13);
		printStacks(stacks);
		stacks.push(1, 22);
		printStacks(stacks);
		
		stacks.push(2, 31);
		printStacks(stacks);
		stacks.push(2, 32);
		printStacks(stacks);
	}
} 