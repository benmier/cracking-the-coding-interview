public class stringCompression{
	static String stringCompression(String str){
		char[] cStr = new char[str.length()];
		boolean newChar = true;
		int count = 1;
		for(int i=0; i<str.length(); i++){
			if(newChar)
				cStr[i]=str.charAt(i);
			if(i==str.length()-1){
				cStr[i]+=(char)count;
				break;
			}
			if(str.charAt(i+1)==str.charAt(i)){
				newChar = false;
				count++;
			}
			else{
				cStr[i]+=(char)count;
				count = 1;
				newChar = true;
			}
		}
		String s = new String(cStr);
		if(s.length()>str.length())
			return str;
		return s;
	}


	public static void main(String[] args){
		System.out.println(stringCompression("aaabcccccaaa"));
	}
}