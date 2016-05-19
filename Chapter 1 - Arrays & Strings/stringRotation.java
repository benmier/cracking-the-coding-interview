public class stringRotation{
	static boolean stringRotation(String s1, String s2){
		if(s1.length()!=s2.length() || s1.length()==0)
			return false;
		for(int i=0; i<s2.length(); i++){
			int s1Index = 0;
			if(s2.charAt(i)==s1.charAt(s1Index)){
				int s2Index = i+1;
				while(s2Index<s2.length()){
					s1Index++;
					if(s2.charAt(s2Index)!=s1.charAt(s1Index)){
						break;
					}
					s2Index++;
				}
				if(s2Index==s2.length()){
					if(isSubstring(s1,s2.substring(0,i)))
						return true;
				}
			}
		}
		return false;
	}

	static boolean stringRotationAlternate(String s1, String s2){
		if(s1.length()!=s2.length() || s1.length()==0)
			return false;
		else{
			if(isSubstring(s1+s1,s2))
				return true;
			return false;
		}
	}

	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args){
		System.out.println(stringRotationAlternate("waterbottle","bottlewater"));
	}
}