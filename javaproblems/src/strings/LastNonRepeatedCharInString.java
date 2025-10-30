package strings;

import java.util.Scanner;

public class LastNonRepeatedCharInString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charArr = input.toCharArray();
        char lastNonRepeated = '\0'; // null character
        for (int i = 0; i < charArr.length; i++) {
            int count = 0;

            for (int j = 0; j < charArr.length; j++) {
                if (i != j && charArr[i] == charArr[j]) {
                    count++;
                }
            }

            if (count == 0) {
                lastNonRepeated = charArr[i]; // update last non-repeated
            }
        }

        if (lastNonRepeated != '\0') {
            System.out.println("Last non-repeated character: " + lastNonRepeated);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
