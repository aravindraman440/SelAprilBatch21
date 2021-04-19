package week1.day2.classroom;

public class Palindrome {
public static void main(String[] args) {
	String text="malayalam";
	String rev="";
	
		char[] charArray = text.toCharArray();
		for (int i =charArray.length -1;i>=0 ; i--) {
			rev=rev+charArray[i]+"";
		}
		if(rev.equals(text)) {
			System.out.println("the string is palindrome");
		}else {
			System.out.println("not palindrome");
	
		}
		}
}

