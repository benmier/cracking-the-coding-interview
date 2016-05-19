public class stringCompression{
	static String stringCompression(String str){
		StringBuilder cStr = new StringBuilder();
		int count = 0;
		for(int i=0; i<str.length(); i++){
			count++;
			if(i+1==str.length() || str.charAt(i+1)!=str.charAt(i)){
				cStr.append(str.charAt(i));
				cStr.append(count);
				count = 0;
			}
		}
		if(cStr.length()>str.length())
			return str;
		return cStr.toString();
	}

	public static void main(String[] args){
		System.out.println(stringCompression("aaabcccccdd"));
	}
}