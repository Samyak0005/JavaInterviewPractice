package interviewprogram;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class OccurancesOfWords {

    public static void main(String[] args) {

        String name = "java World how is java programming is";

        Map<String, Integer> words = new HashMap<>();

        for (String word: name.split(" ")){
            if (words.containsKey(word)){
                System.out.println("Duplication word  "+ word +" " + words.put(word, words.get(word) + 1) + " Times");
            }else {

                words.put(word, 1);
            }
        }
        System.out.println(words);
    }
}
