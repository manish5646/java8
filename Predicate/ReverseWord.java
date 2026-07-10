import java.util.function.Predicate;

public class ReverseWord {
    public static void main(String[] args) {

        String str = "java is easy";
        Predicate<Character> isSpace = ch -> ch == ' ';

        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (isSpace.test(ch)) {
                result.append(word.reverse()).append(" ");
                word.setLength(0);
            } else {
                word.append(ch);
            }
        }

        result.append(word.reverse());

        System.out.println(result);
    }
}
