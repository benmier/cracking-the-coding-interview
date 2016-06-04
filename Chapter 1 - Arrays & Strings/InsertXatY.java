import java.util.*;

public class InsertXatY{
	public static void insertXatY(ArrayList arr, int num, int index){
		arr.add(0);
		for(int i=arr.size()-1; i>index; i--){
			arr.set(i,arr.get(i-1));
		}
		arr.set(index,num);
	}


	public static void main(String [] args){
		int[] add = {1,2,3,4};
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add(3);
		arr.add(5);
		arr.add(7);
		System.out.println(arr);
		insertXatY(arr,10,2);
		System.out.println(arr);
	}
}
