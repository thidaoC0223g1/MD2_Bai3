import java.util.Scanner;

public class MaxIn {
    public static void main(String[] args) {
        int s;
        Scanner input =new Scanner(System.in);
        do {
            System.out.println("nhap vao so phan tu cua mang");
             s= input.nextInt();
        }while (s<0 || s>20);

        double[] ar1 = new double[s];
        for(int i=0;i<ar1.length;i++){
            System.out.println("nhap vao phan tu thu "+ (i+1));
            ar1[i]= input.nextDouble();
        }
        double max=ar1[0];
        for(int i=1;i<ar1.length;i++){
            if(max<ar1[i]){
                max=ar1[i];
            }
        }
        System.out.println("phan tu lon nhat cua mang la Max = "+ max);
    }
}
