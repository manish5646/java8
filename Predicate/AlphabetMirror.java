import java.util.function.Predicate;

public class AlphabetMirror {
    public static void main(String[] args) {

        Predicate<Character> p = c -> Character.isUpperCase(c);

        String str = "ABC";

        str.chars()
           .mapToObj(c -> (char) c)
           .filter(p)
           .map(c -> String.valueOf((char) ('Z' - (c - 'A'))))
           .forEach(System.out::print);
    }
}
