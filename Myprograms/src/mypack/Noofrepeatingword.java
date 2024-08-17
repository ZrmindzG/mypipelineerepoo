package mypack;

public class Noofrepeatingword {

	public static void main(String[] args) {
		String str = "Test Test dev Test Test dev Test doc Test dev dev dev Test Test dev dev Test";

		String[] words = str.split(" ");

		String reverword = "";

		String reverw = "";
		
		int count=0;

		for (String w : words) {
			for (int i = w.length() - 1; i >= 0; i--) {
				reverw = reverw + w.charAt(i);
				}
			reverword = reverword + reverw;
		}
		//System.out.printf("this is reverse words in a string:" + reverword);
		System.out.printf("this is reverse words in a string:" + count);

	}
}
