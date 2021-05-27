
public class Palindrome {
    public static boolean isPalindrome(String word) {
        int stringLength=word.length();
        for(int i=0; i<stringLength; i++){
        	if(Character.toLowerCase(word.charAt(i))!=Character.toLowerCase(word.charAt(stringLength-i-1))){
        		return false;
        	}
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}