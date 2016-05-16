public class isUnique{
	static boolean isUniqueChars(String str){
		int strToInt[] = new int[128];
		for(int i=0; i<str.length(); i++){
			if(strToInt[str.charAt(i)]==1)
				return false;
			strToInt[str.charAt(i)]=1;
		}
		return true;
	} 

	public static void main(String[] args){
		System.out.println(isUniqueChars("abcdefghijklmnopqrstuvwxyz"));
	}
}