public class stringRotation{
	static boolean stringRotation(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		int s1Index = 0;
		for(int i=0; i<s2.length(); i++){
			if(s2.charAt(i)==s1.charAt(0)){
				int j = i+1;
				boolean isLegit = true;
				while(j<s2.length()){
					if(s2.charAt(j)!=s1.charAt(s1Index++))
						isLegit = false;
					j++;
				}
				if(isLegit){
					if(isSubstring(s1,s2.substring(0,i)))
						return true;
				}
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