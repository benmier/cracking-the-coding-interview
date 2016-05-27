import java.util.*;

public class BinarySearchTree{

	public static void main(String [] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		BinarySearchTree(array);
	}

	public static void BinarySearchTree(int[] array){
		int root = array.length%2==0 ? array[array.length/2-1] : array[array.length/2];
		System.out.println(root);
	}
}