import java.util.*;

public class RemoveNegatives{
	public static void removeNegatives(ArrayList arr){
		for(int i=0; i<arr.size(); i++){
			int count = 0;
			// System.out.println(arr.get(i));
			if((int)arr.get(i)<0){
				count++;
				System.out.println(count);
			}
			else if(count>0){
				arr.set(i-count,(int)arr.get(i));
			}
		}
		System.out.println(arr);
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
	}
}
