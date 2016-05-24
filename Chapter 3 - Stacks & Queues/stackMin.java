import java.util.EmptyStackException;

public class stackMin{

	public static void main(String [] args){
		Stack stack = new Stack();
		stack.push(5);
		stack.push(6);
		stack.push(3);
		stack.push(7);
		stack.minValue();
		stack.pop();
		stack.minValue();
		stack.pop();
		stack.minValue();
	}
}