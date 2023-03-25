import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);

        System.out.println("nhap vao so dong va cot cua mang");
        int row2 = input2.nextInt();
        int[][] ar2 = new int[row2][row2];
        for (int k = 0; k < row2; k++) {
            for ( int l = 0; l < row2; l++) {
                System.out.println("nhap vao phan tu thu " + k + " " + l);
                ar2[k][l] = input2.nextInt();
            }

        }
        System.out.println("mang vua nhap vao la");
        for (int k = 0; k < row2; k++) {
            for ( int l = 0; l < row2; l++) {
                System.out.print(ar2[k][l] + "\t");
            }
            System.out.println();
        }
        int sum=0;
        System.out.println("tong duong cheo 1 cua ma tran la ");
        for (int k = 0; k < row2; k++) {
            for ( int l = 0; l < row2; l++) {
               if(k==l){
                   sum+=ar2[k][l];
               }
            }

        }System.out.println(sum);

        int sum2=0;
        System.out.println("tong duong cheo 2 cua ma tran la ");
        for (int k = row2-1; k >=0; k--) {
            for ( int l = 0; l < row2; l++) {
                if(row2-k-1==l){
                    sum2+=ar2[k][l];
                }
            }

        }System.out.println(sum2);


    }
}
