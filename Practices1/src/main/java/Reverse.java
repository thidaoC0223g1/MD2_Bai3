import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao chieu dai cua mang");
        int size = input.nextInt();
        if (size < 2) {
            System.out.println("khong co mang de dao nguoc");
        } else {
            int[] ar1 = new int[size];

            for (int i = 0; i < ar1.length; i++) {
                System.out.println("nhap vao phan tu thu " + i);
                ar1[i] = input.nextInt();
            }
            System.out.println("mang nhap vao ");
            System.out.println(Arrays.toString(ar1));
            System.out.println("mang sau khi dao nguoc ");
            check(ar1);
        }
    }
    public static void check(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int c = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = c;
        }
        System.out.println(Arrays.toString(arr));
    }
}

