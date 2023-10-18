package practice;

public class pangram {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		if(isPangram(s)){
			System.out.println("pangram");
		}
		else {
			System.out.println("Not a pangram");
		}
	}
	public static boolean isPangram(String s) {
		if(s.length()<26){
			return false;
		}
		else {
			for(char ch='a';ch<='z';ch++){
				if(s.indexOf(ch)<0){
					return false;
				}
			}
		}
		return true;
	}
}