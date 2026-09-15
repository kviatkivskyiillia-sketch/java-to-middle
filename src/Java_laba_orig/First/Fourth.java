package Java_laba_orig.First;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scan.nextLine();

        String[] words = text.split("[ ,.:;?!]+");

        System.out.println("Результат:");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            char firstChar = word.charAt(0);
            StringBuilder processedWord = new StringBuilder();
            processedWord.append(firstChar);

            for (int i = 1; i < word.length(); i++) {
                char current = word.charAt(i);
                if (current != firstChar) {
                    processedWord.append(current);
                }
            }

            result.append(processedWord).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}