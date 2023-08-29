package ex9;

public class Q9_9 {
	/*
	 * (1) delChar메서드를 작성하시오.
	 */
	public static String delchar(String str, String delCh) {
		for(int i; i<str.length(); i++) {
			if(str.charAt(i) == delCh) {
				return str.de
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}