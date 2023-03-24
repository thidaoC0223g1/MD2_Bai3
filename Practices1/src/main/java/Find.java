import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String[] ar1 = {"tien", "hung", "long", "giang", "nam"};
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao ten can tim");
        String name = input.nextLine();

        boolean check=false;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i].equals(name)) {
                System.out.println("nguoi can tim o vi tri " + (i + 1));
                check=true;
                break;
            }
        }
        if(!check){
            System.out.println("khong co trong danh sach");
        }
    }
}




