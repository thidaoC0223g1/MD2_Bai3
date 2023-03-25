import java.util.Scanner;

public class FindChar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao ky tu can tim");
        String str=input.nextLine();
        int count=0;
        String str1 = "c0223G1 Codegym ccCP", str2=str1.toLowerCase();

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == str.charAt(0)) {
                count++;
            }

        }
        System.out.println(count);
    }



}


