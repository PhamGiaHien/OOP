public class Main {
    public static void main(String[] args) {
        System.out.println("log n\tn\tn log n\tn^2\tn^3");
        for (long n = 2; n <= 2048; n*=2){
            System.out.print((int)Math.log(n) + "\t");
            System.out.print(n + "\t");
            System.out.print((int)(n * Math.log(n)) + "\t");
            System.out.print(n * n + "\t");
            System.out.print(n * n * n + "\t");
            System.out.println();
        }
    }
}