import java.util.Scanner;
import java.util.Arrays;
public class ThemPhanTu {
    public static void main(String[] args) {
        int [] ar1 ={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(ar1));
        int [] ar2= new int[ar1.length+1];
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao vi tri muon them");
        int k= input.nextInt();
        System.out.println("nhap vao gia tri muon them");
        int j= input.nextInt();
        if (k >= 0) System.arraycopy(ar1, 0, ar2, 0, k);
        ar2[k]=j;
        System.arraycopy(ar1, k , ar2, k + 1, ar1.length-k);
        System.out.println(Arrays.toString(ar2));
    }
}
