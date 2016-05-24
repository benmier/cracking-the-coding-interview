import java.util.Stack;

public class stackMin{
	// static int stackMin(){

	// }

	public static void main(String [] args){
		Stack stack = new Stack();
		for(int i=0; i<10; i++){
			stack.push(i);
		}
		System.out.println(stack.toString());
	}
}