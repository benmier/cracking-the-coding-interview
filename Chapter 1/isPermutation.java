public class isPermutation{
	static boolean isPermutation(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		for(int i=0; i<str1.length(); i++){
			for(int j=0; j<str2.length(); j++){
				// System.out.println("i: "+str1.charAt(i)+", j: "+str2.charAt(j));
				if(str1.charAt(i)==str2.charAt(j)){
					// System.out.println(str2.substring(0,j)+" + "+str2.substring(j+1));
					str2 = str2.substring(0,j)+str2.substring(j+1);
					break;
				}
			}
		}
		if(str2.length()==0)
			return true;
		return false;
	}

	public static void main(String[] args){
		System.out.println(isPermutation("test","estt"));
	}
}