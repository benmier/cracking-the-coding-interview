public class URLify{
	static String urlify(String str){
		str = str.trim();
		int count = 0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' ')
				count+=2;
			count+=1;
		}
		char[] strArray = new char[count];
		for(int i=str.length()-1, j=count-1; i>=0; i--, j--){
			if(str.charAt(i)==' '){
				strArray[j]='0';
				strArray[j-1]='2';
				strArray[j-2]='%';
				j-=2;
			}
			else
				strArray[j] = str.charAt(i);
		}
		String str2 = new String(strArray);
		return str2;
	}

	public static void main(String[] args){
		System.out.println(urlify("Mr John Smith    "));
	}
}