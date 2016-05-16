public class isUnique{
	static boolean isUniqueChars(String str){
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i);
			System.out.println(val);
		}
		return true;
	} 

	public static void main(String[] args){
		System.out.println(isUniqueChars("test"));
	}
}