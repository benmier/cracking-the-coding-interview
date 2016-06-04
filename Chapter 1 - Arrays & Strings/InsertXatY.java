import java.util.*;

public class InsertXatY{

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		Node tree = makeTree(array, 0, array.length-1);
		int[] array2 = {6,7,8,9,10};
		Node tree2 = makeTree(array2, 0, array2.length-1);
		System.out.println(checkSubtree(tree,tree2));
	}
}
