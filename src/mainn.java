import java.util.ArrayList;

public class mainn {
    public static void main(String[] args) {
        String text = "Цей текст містить слова різної довжини, включаючи: короткі, довгі, середні, парні і непарніі. Ці слоова маютть парнуу кількістьь букв";
        
        String result = removeOddLengthWords(text);
        
        System.out.println("Оригінальний текст: " + text);
        System.out.println("Текст після видалення слів непарної довжини: " + result);
    }

    public static String removeOddLengthWords(String text) {
        String[] words = text.split("\\s+|(?=\\p{Punct})|(?<=\\p{Punct})");
        ArrayList<String> filteredWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() % 2 == 0 || word.matches("\\p{Punct}")) {
                filteredWords.add(word);
            }
        }

        return String.join(" ", filteredWords).replaceAll("\\s+(?=\\p{Punct})", "");
    }
}
