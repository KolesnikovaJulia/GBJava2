package lesson3;


import java.util.*;

public class Uniqueness {
        public static void main(String[] args) {
            final String[] daysOfTheWeek = "Храни меня, мой талисман Храни меня во дни гоненья,\n Во дни раскаянья, волненья:\n Ты в день печали был мне дан.".toLowerCase().split("[\\p{Space}\\p{Punct}]+");


            final List<String> wordList = Arrays.asList(daysOfTheWeek);
            final Set<String> uniqueWords = new HashSet<>(wordList);


            for (String word : uniqueWords) {
                int count = 0;
                for (String s : wordList) {
                    if (s.equals(word)) {
                        count++;
                    }
                }
                System.out.println("Слово " + word.toUpperCase(Locale.ROOT) + " встретилось " + count + " раз(а)");
            }

            final HashMap<String, Integer> map = new HashMap<>();

            for (String word : wordList) {
                final int value = map.getOrDefault(word, 0) + 1;
                map.put(word, value);
            }
        }
}
