import java.util.Scanner;

public class StudentPoint {
    public static void main(String[] args) {
        int tong;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("nhap vao so sinh vien can quan ly");
            tong = input.nextInt();
            if(tong>30){
                System.out.println("yeu cau nhap lai");
            }
        }while(tong>30);
        int [] sinhvien = new int [tong];
        for( int i=0;i< tong;i++){
            System.out.println("nhap vao diem cua sinh vien " + (i+1));
            sinhvien[i]= input.nextInt();
        }
        int count =0;
        for(int j: sinhvien){
            if(j>=5 && j <=10 ){
                count++;
            }
        }
        System.out.println("so sinh vien thi do = " + count );
    }
}
