public class isPermutation{
	static boolean isPermutation(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		for(int i=0; i<str1.length(); i++){
			for(int j=0; j<str2.length(); j++){
				if(str1.charAt(i)==str2.charAt(j)){
					str2 = str2.substring(0,j)+str2.substring(j+1);
					break;
				}
			}
		}
		if(str2.length()==0)
			return true;
		return false;
	}

	static boolean isPermutation2(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		int[] strSet = new int[128];
		for(int i=0; i<str1.length(); i++){
			strSet[str1.charAt(i)]++;
		}
		for(int i=0; i<str2.length(); i++){
			strSet[str2.charAt(i)]--;
			if(strSet[str2.charAt(i)]<0)
				return false;
		}
		return true;
	}

	public static void main(String[] args){
		System.out.println(isPermutation2("abc","cab"));
	}
}