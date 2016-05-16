import java.util.Hashtable;

class MakeHash{
	Hashtable<Char, String> hashtable = new Hashtable<Char, String>();
	MakeHash (String word){
		for(int i=0; i<word.length(); i++){
			hashtable.put(word.charAt(i), "1");
		}
		if(hashtable.length()!=word.length())
			return false;
		return true;
	}
}

public class isUnique{
	public static void main(String[] args){
		MakeHash test = new MakeHash("test");
		System.out.println(test);
	}
}