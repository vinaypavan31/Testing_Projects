package strings;

import java.util.Scanner;

public class FirstNonRepeatedCharInString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charArr = input.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            int count = 0;

            for (int j = 0; j < charArr.length; j++) {
                if (i != j && charArr[i] == charArr[j]) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("First non-repeated character: " + charArr[i]);
                return; // stop after finding the first one
            }
        }

        System.out.println("No non-repeated character found.");
    }
}
