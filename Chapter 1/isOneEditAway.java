public class isOneEditAway{
	static boolean isOneEditAway(String a, String b){
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(Math.abs(a.length()-b.length())>1)
			return false;
		if(a.length()<b.length()){
			isOneEditAway(b,a);
		}
		int[] charMap = new int[128];
		for(int i=0; i<a.length(); i++){
			charMap[a.charAt(i)]++;
		}
		for(int i=0; i<b.length(); i++){
			charMap[b.charAt(i)]--;
		}
		int count = 0;
		for(int c: charMap){
			count+=Math.abs(c);
		}
		return count==1;
	}

	public static void main(String[] args){
		System.out.println(isOneEditAway("pale","bale"));
	}
}