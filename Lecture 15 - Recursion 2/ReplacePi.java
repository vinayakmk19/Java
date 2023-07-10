package recursion2;

public class ReplacePi {

	public static String replacePi(String str) {
		if (str.length() == 0) {
			return str;
		}

		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			String smallOutput = replacePi(str.substring(2));
			return "3.14" + smallOutput;
		} else {
			String smallOutput = replacePi(str.substring(1));
			return str.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		System.out.println(replacePi("abpicpipi"));

	}

}
