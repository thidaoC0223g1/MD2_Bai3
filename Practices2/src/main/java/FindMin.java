import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang ");
        int index = input.nextInt();
        int[] ar1 = new int[index];
        for (int i = 0; i < index; i++) {
            System.out.println("nhap vao phan tu thu " + i);
            ar1[i] = input.nextInt();
        }
        System.out.println(" mang vua nhap vao la ");
        System.out.println(Arrays.toString(ar1));
        int min = ar1[0];
        for (int i = 1; i < ar1.length; i++) {
            if (min > ar1[i]) {
                min = ar1[i];
            }
        }
        System.out.println("phan tu nho nhat trong mang la ");
        System.out.println(min);
    }
}
