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

	static boolean isPermutationAlt(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		int[] strSet1 = new int[128];
		int[] strSet2 = new int[128];
		for(int i=0; i<str1.length(); i++){
			strSet1[str1.charAt(i)]++;
			strSet2[str2.charAt(i)]++;
		}
		if(strSet1!=strSet2)
			return false;
		return true;
	}

	public static void main(String[] args){
		System.out.println(isPermutationAlt("abc","cba"));
	}
}