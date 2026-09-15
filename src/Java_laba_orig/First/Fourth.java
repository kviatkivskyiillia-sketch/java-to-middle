package Java_laba_orig.First;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть символ:");
        char targetChar = in.nextLine().charAt(0);

        System.out.println("Введіть текст:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;?!]+");

        //  Map для підрахунку кількості повторень кожного слова
        Map<String, Integer> wordCounts = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.indexOf(targetChar) != -1) {

                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Знайдені слова та кількість їхніх повторень:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " — " + entry.getValue() + " рази");
        }

        in.close();
    }
}