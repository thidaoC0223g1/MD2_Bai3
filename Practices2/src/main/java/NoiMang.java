import java.util.Arrays;
import java.util.Scanner;

public class NoiMang {
    public static void main(String[] args) {
        int[] ar1 = new int[4];
        int[] ar2 = new int[3];
        int [] ar3 = new int[7];
        Scanner input= new Scanner(System.in);
        System.out.println("nhap vao phan tu mang 1");
        for(int i=0; i<ar1.length;i++){
            System.out.println("nhap vao phan tu thu "+ i);
            ar1[i]=input.nextInt();
        }
        System.out.println("nhap vao phan tu mang 2");
        for(int i=0;i<ar2.length;i++){
            System.out.println("nhap vao phan tu thu "+ i);
            ar2[i]=input.nextInt();
        }
        System.out.println("mang 1 ");
        System.out.println(Arrays.toString(ar1));
        System.out.println("mang 2");
        System.out.println(Arrays.toString(ar2));
        System.arraycopy(ar1, 0, ar3, 0, ar1.length);
        System.arraycopy(ar2, 0, ar3, ar1.length, ar2.length);

        System.out.println(Arrays.toString(ar3));
    }
}
