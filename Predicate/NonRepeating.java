public class Non_RepeatChar {
    public static void main(String[] args) {
        String str = "programming";

        Character ch = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst()
                .orElse(null);

        System.out.println(ch);
    }
}
