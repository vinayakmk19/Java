package strings;

class Strings {

	public static void printAllSubStrings(String str) {
		for (int len = 1; len <= str.length(); len++) {
			for (int start = 0; start <= str.length() - len; start++) {
				int end = start + len - 1;
//				System.out.println(start+""+end);
				System.out.println(str.substring(start, end + 1));
			}
		}
	}
}

public class AllSubStrings2 {

	public static void main(String[] args) {

		String str = "pqrs";
//		System.out.println(str.substring(0, 1));
		Strings.printAllSubStrings(str);

	}

}
