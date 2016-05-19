public class isPalendromePermutation{
	static boolean isPalendromePermutation(String str){
		str = str.toLowerCase();
		str = str.replaceAll("\\s+","");
		int[] charSet = new int[128];
		int count = 0;
		for(int i=0; i<str.length(); i++){
			if(charSet[str.charAt(i)]>0)
				charSet[str.charAt(i)]--;
			else
				charSet[str.charAt(i)]++;
		}
		for(int c: charSet){
			if(c>1)
				return false;
			if(c==1)
				count++;
		}
		return count<=1;
	}

	public static void main(String[] args){
		System.out.println(isPalendromePermutation("aabbs"));
	}
}