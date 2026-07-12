import java.util.function.Function;

public class SumDigitsInString {
    public static void main(String[] args) {

        String str = "hihello412bye";

        Function<String, String> convert = s -> {
            StringBuilder result = new StringBuilder();
            int i = 0;

            while (i < s.length()) {

                if (Character.isDigit(s.charAt(i))) {
                    int sum = 0;

                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        sum += s.charAt(i) - '0';
                        i++;
                    }

                    result.append(sum);
                } else {
                    result.append(s.charAt(i));
                    i++;
                }
            }

            return result.toString();
        };

        System.out.println(convert.apply(str));
    }
}
