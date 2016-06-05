import java.util.*;

public class BinarySearch{
	public static Integer binarySearch(int key, int[] array, int min, int max){
		int mid = (max-min)/2;
		if(array[mid]==key)
			return mid;
		else if(array[mid]>key)
			binarySearch(key, array, min, mid-1);
		else
			binarySearch(key, array, mid+1, max);
		return null;
	}


	public static void main(String [] args){
		int[] array = {-90,-19,0,2,12,29,33,190,320};
		System.out.println(binarySearch(12, array, 0, array.length-1));
	}
}
