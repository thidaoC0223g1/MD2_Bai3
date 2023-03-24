public class MinIn {
    public static void main(String[] args) {
        int [] ar1 = {10,5,8,2,21,34,77};
        System.out.println(" so nho nhat trong mang = "+ checkMin(ar1));
    }
    public static int checkMin(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }return min;
    }
}
