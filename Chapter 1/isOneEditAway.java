public class isOneEditAway{
	static boolean isOneEditAway(String a, String b){
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.length()<b.length()){
			String c = b;
			b = a;
			a = c; 
		}
		int[] charMap = new int[128];
		for(int i=0; i<a.length(); i++){
			charMap[a.charAt(i)]++;
		}
		for(int i=0; i<b.length(); i++){
			// if(charMap[b.charAt(i)]>0)
				charMap[b.charAt(i)]--;
		}
		int count = 0;
		for(int c: charMap){
			if(c!=0)
				count++;
			if(count>1)
				return false;
		}
		return count==1;
	}

	public static void main(String[] args){
		System.out.println(isOneEditAway("abcdefghijklmnopqrsttuvwxyz","abcdaefghijklmnopqrstuvwxyz"));
	}
}