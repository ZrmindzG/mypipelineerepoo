package mypack;

public class Reverestring {

	public static void main(String[] args) {
		String a = "student";

		String a1 = " ";

		for (int i = a.length() - 1; i >= 0; i--) {

			a1 = a1 + a.charAt(i);
		}

		System.out.println(a1);
	}
}
