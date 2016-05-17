public class stringCompression{
	static String stringCompression(String str){
		char[] cStr = new char[str.length()];
		boolean newChar = true;
		int count = 0;
		for(int i=0; i<str.length(); i++){
			if(newChar)
				cStr[i]=str.charAt(i);
			if(str.charAt(i+1)==str.charAt(i)){
				newChar = false;
				count++;
			}
			else{
				cStr[i]+=(char)count;
				count = 0;
				newChar = true;
			}
		}
		String s = new String(cStr);
		return s;
	}


	public static void main(String[] args){
		System.out.println(stringCompression("aaabcccccaaa"));
	}
}