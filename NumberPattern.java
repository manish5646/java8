public class NumberPattern {
    public static void main(String[] args) {

        int rows = 4;
        int num = 1;

        for (int i = 1; i <= rows; i++) {

            for (int s = 1; s <= (rows - i) * 4; s++) {
                System.out.print(" ");
            }

            int count = (i == rows) ? 5 : (int) Math.pow(2, i - 1);

            for (int j = 1; j <= count; j++) {
                System.out.printf("%-7d", num++);
            }

            System.out.println();
        }
    }
}
