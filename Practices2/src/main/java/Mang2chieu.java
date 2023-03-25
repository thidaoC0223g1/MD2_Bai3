import java.util.Scanner;

public class Mang2chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so dong cua mang");
        int dong = input.nextInt();
        System.out.println("nhap vao so cot cua mang");
        int cot = input.nextInt();
        int[][] ar1 = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("nhap phan tu thu " + i + " " + j);
                ar1[i][j] = input.nextInt();
            }
        }

        System.out.println("mang vua nhap la");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(ar1[i][j] + "\t");
            }
            System.out.println();
        }

        int max = ar1[0][0];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < ar1[i][j]) {
                    max = ar1[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat cua mang la ");
        System.out.println(max);
    }
}
