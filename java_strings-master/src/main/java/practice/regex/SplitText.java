package practice.regex;

public class SplitText {

    public static void main(String[] args) {

        String text = "English texts for beginners to practice reading and comprehension online and for free. Practicing your comprehension of written English will both improve your vocabulary and understanding of grammar and word order. The texts below are designed to help you develop while giving you an instant evaluation of your progress.";
        System.out.println(splitTextIntoWords(text));
    }

    public static String splitTextIntoWords(String text) {
        String[] words = text.replaceAll("[^a-zA-Z]", "\n").split("\\s+");
        return String.join("\n", words);
    }

}
