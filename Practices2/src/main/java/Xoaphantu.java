import java.util.Scanner;
import java.util.Arrays;
public class Xoaphantu {
    public static void main(String[] args) {
        int [] ar1={5,6,7,8,9,7,11,13};
        System.out.println(Arrays.toString(ar1));
        int c, i,k;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao vi tri can xoa");
        c= input.nextInt();
        for(k=i=0;i<ar1.length;i++){
            if(ar1[i]!=ar1[c]){
                ar1[k]=ar1[i];
                k++;
            }
        }
        System.out.println("mang sau khi xoa");
        for(int j=0;j<k;j++){
            System.out.print(ar1[j] + "\t");
        }

    }
}
