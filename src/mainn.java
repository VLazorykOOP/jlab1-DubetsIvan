import java.util.ArrayList;

public class mainn {
    public static void main(String[] args) {
        String text = "Цей текст мiстить слова рiзної довжини, включаючи: короткi, довгi, середнi, парнi i непарнii. Цi слоова маютть парнуу кiлькiстьь букв";
        
        String result = removeOddLengthWords(text);
        
        System.out.println("Оригiнальний текст: " + text);
        System.out.println("Текст пiсля видалення слiв непарної довжини: " + result);
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
