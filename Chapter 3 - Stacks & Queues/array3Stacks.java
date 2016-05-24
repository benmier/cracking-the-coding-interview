import java.util.*;

public class array3Stacks{
	 

	public static void main(String[] args){
		int[] info = {0,1,2,4,2,1,0};
		Node sLL = createList(info);
		printList(sLL);
		System.out.println(loopDetection(sLL));
	}
} 