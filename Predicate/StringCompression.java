import java.util.function.Function;

public class StringCompression {
    public static void main(String[] args) {

        Function<String, String> compress = s -> {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                int count = 1;

                while (i < s.length() - 1 &&
                        s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                    i++;
                }

                sb.append(s.charAt(i)).append(count);
            }
            return sb.toString();
        };

        System.out.println(compress.apply("aaabbccdaa"));
    }
}
