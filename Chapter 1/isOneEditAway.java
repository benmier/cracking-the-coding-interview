public class isOneEditAway{
	static boolean isOneEditAway(String a, String b){
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.length()<b.length()){
			String c = b;
			b = a;
			a = c; 
		}
		int[] 
	}

	public static void main(String[] args){
		System.out.println(isOneEditAway("pale","ple"));
	}
}