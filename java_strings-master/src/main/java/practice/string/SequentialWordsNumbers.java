package practice.string;

public class SequentialWordsNumbers {

    public static void main(String[] args) {
        String text = "Это просто текст, для примера работы программы";

        System.out.println(sequentialWordsNumbers(text));
    }

    public static String sequentialWordsNumbers(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        int num = 0;
        StringBuilder word = new StringBuilder();
        String newText = text.trim() + ' ';
        if (text.isEmpty()) {
        }
        else {
            for (int i = 0; i < newText.length(); i++) {
                if (newText.length() <= 2 && !Character.isLetter(newText.charAt(i))) {
                    word = new StringBuilder();
                }
                if (newText.charAt(i) != ' ' && newText.length() > 2) {
                    word.append(newText.charAt(i));
                } else {
                    num++;
                    stringBuilder.append(" (" + num + ") " + word);
                    word = new StringBuilder();
                }
            }
        }
        return stringBuilder.toString().trim();
    }
}
