public class Main {
    public static void main(String[] args) {
        double n = Math.random();

        int dice;

        if (n < 1.0/8.0) dice = 1;
        else if (n < 2.0/8.0) dice = 2;
        else if (n < 3.0/8.0) dice = 3;
        else if (n < 4.0/8.0) dice = 4;
        else if (n < 5.0/8.0) dice = 5;
        else dice = 6;

        System.out.println(dice);
    }
}