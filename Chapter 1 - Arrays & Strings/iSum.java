import java.util.*;

public class iSum{
	public static Integer iSum(int val){
		if(val<1)
			return null;
		else if(val==1)
			return 1;
		return val + iSum(val-1);
	}


	public static void main(String [] args){
		System.out.println(iSum(1000));
	}
}
