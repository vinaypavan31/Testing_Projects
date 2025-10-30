package strings;

import java.util.Scanner;

public class RemoveDuplicateCharsInString {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String res = "";

		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			if (input.charAt(i) != ' ') {
				for (int j = 0; j < input.length(); j++) {
					if (input.charAt(i) == input.charAt(j) && i != j) {
						count++;
					}
				}
				if (count == 0) {
					res = res + (input.charAt(i));
				}
			}
		}
		System.out.println(res);

	}

}
