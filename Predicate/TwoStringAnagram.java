import java.util.Arrays;
import java.util.function.Predicate;

public class TwoStringAnagram {
    public static void main(String[] args) {

        String s2 = "silent";

        Predicate<String> isAnagram = s1 ->
                Arrays.equals(
                        s1.toLowerCase().chars().sorted().toArray(),
                        s2.toLowerCase().chars().sorted().toArray()
                );

        System.out.println(isAnagram.test("listen"));
    }
}
