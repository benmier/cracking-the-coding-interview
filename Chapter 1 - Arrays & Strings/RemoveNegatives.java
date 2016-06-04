import java.util.*;

public class RemoveNegatives{
	public static void removeNegatives(ArrayList arr, int num, int index){
		for(int i=0; i<arr.size(); i++){
			int count = 0;
			if(arr.get(i)<0){
				count++;
			}
			else if(count>0){
				arr.set(i,arr.get(i-count));
			}
		}
	}


	public static void main(String [] args){
		int[] add = {1,2,3,4};
		ArrayList arr = new ArrayList();
		arr.add(0);
		arr.add(-1);
		arr.add(2);
		arr.add(-3);
		arr.add(4);
		arr.add(-5);
		arr.add(6);
		System.out.println(arr);
		removeNegatives(arr);
		System.out.println(arr);
	}
}
