public class stringRotation{
	static boolean stringRotation(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		for(int i=0; i<s2.length(); i++){
			if(s2[i]==s1[0]){
				while(if(s2[i+1]==s1[1])
			}
		}
		return false;
	}



	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args){
		System.out.println(stringRotation("waterbottle","erbottlewat"));
	}
}