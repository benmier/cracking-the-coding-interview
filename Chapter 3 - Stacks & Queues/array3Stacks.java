import java.util.*;

public class array3Stacks{
	private int numberOfStacks = 3;
	private int stackCapacity;
	private int[] values;
	private int[] sizes;

	public FixedMultiStack(int stackSize){
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

	public int pop()


	public static void main(String[] args){
		int[] info = {0,1,2,4,2,1,0};
		Node sLL = createList(info);
		printList(sLL);
		System.out.println(loopDetection(sLL));
	}
} 