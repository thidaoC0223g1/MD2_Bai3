import java.util.Scanner;

public class ColSum {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        System.out.println("nhap vao so dong cua mang");
        int row = input1.nextInt();
        System.out.println("nhap vao so cot cua mang");
        int col = input1.nextInt();
        int [][] ar1 = new int[row][col];
        for (int i= 0;i < row;i++){
            for (int j=0;j<col;j++){
                System.out.println("nhap vao phan tu thu "+ i+ " "+j);
                ar1[i][j]=input1.nextInt();
            }

        }
        System.out.println("mang vua nhap vao la");
        for (int i= 0;i < row;i++){
            for (int j=0;j<col;j++){
                System.out.print(ar1[i][j]+"\t");
            }
            System.out.println();
        }

        int sum=0, k;
        System.out.println("nhap vao cot can tinh tong");
        k= input1.nextInt();
        for (int i= 0;i < row;i++){
            sum+=ar1[i][k-1];
        }
        System.out.println("tong cac phan tu o cot " + k +" =");
        System.out.println(sum);
    }
}
