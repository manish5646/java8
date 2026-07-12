import java.util.function.Function;

public class AlternateWordUpperCase {
    public static void main(String[] args) {

        String str = "java is a powerful programming language";

        Function<String, String> convert = s -> {
            String[] words = s.split(" ");

            for (int i = 0; i < words.length; i += 2) {
                words[i] = words[i].toUpperCase();
            }

            return String.join(" ", words);
        };

        System.out.println(convert.apply(str));
    }
}
