public class ShiftByOneArray {
    static void shiftByOne(int[] arr){
        int n = arr.length;

        int temp = arr[n-1];
        for (int i = n-1;i>0;i--){
            arr[i] = arr[i-1];

        }
        arr[0] = temp;
        for (int d :arr){
            System.out.println(d);
        }
    }
    static void main(){
        int[] arr = {1,2,3,4,5,90,110};
        shiftByOne(arr);
    }
}
