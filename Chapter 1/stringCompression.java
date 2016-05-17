public class stringCompression{
	static String stringCompression(String str){
		boolean newChar = true;
		char[] cStr = new char[str.length()];
		for(int i=0; i<str.length(); i++){
			if(newChar)
				cStr[i]=str.charAt(i);
			else{
				
			}
		}
		String s = new String(cStr);
		return s;
	}


	public static void main(String[] args){
		System.out.println(stringCompression("aaabcccccaaa"));
	}
}