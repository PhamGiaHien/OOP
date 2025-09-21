public class FivePerLine {
    public static void main(String[] args) {
        int start = 1000;
        int end = 2000;

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}