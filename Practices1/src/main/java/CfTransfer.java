import java.util.Scanner;

public class CfTransfer {
    public static void main(String[] args) {
        double c, f;
        int ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu temperature transfer");
        do {
            System.out.println("1: Celsius to Fahrenheit");
            System.out.println("2: Fahrenheit to Celsius");
            System.out.println("0: not transfer");
            ch = input.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("nhap vao nhiet do");
                    c = input.nextDouble();
                    System.out.println(c + "do C = " + cToF(c) + " do F");
                    break;
                case 2:
                    System.out.println("nhap vao nhiet do");
                    f = input.nextDouble();
                    System.out.printf("%4.2f%s%2.2f%s",f , "do F = " , fToC(f) , "do C");
                    System.out.println();
                    break;
            }
        } while (ch != 0);
    }

    public static double cToF(double cel) {
        double fah = cel * 1.8 + 32;
        return fah;
    }

    public static double fToC(double fah) {
        double cel = (fah - 32) / 1.8;
        return cel;
    }
}
