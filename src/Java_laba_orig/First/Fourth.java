package Java_laba_orig.First;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть символ:");
        char targetChar = scan.nextLine().charAt(0);

        System.out.println("Введіть текст:");
        String text = scan.nextLine();

        String[] words = text.split("[ ,.:;?!]+");

        System.out.println("Знайдені слова та кількість їхніх повторень:");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.indexOf(targetChar) != -1) {

                boolean alreadyPrinted = false;
                for (int j = 0; j < i; j++) {
                    if (words[j].equalsIgnoreCase(word)) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    int count = 0;
                    for (int k = 0; k < words.length; k++) {
                        if (words[k].equalsIgnoreCase(word)) {
                            count++;
                        }
                    }
                    System.out.println(word + " — " + count + " рази");
                }
            }
        }
    }
}