public class stringCompression{
	static String stringCompression(String str){
		String cStr = "";
		int count = 1;
		for(int i=0; i<str.length(); i++){
			if(i+1==str.length() || str.charAt(i+1)!=str.charAt(i)){
				cStr += str.charAt(i) + count;
				count=1;
			}
		}
		if(cStr.length()>str.length())
			return str;
		return cStr;
	}


	public static void main(String[] args){
		System.out.println(stringCompression("aaabcccccaaa"));
	}
}