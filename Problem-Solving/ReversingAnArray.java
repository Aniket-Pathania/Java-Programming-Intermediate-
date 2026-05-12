public class ReversingAnArray {
    static void reverseArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for (int d:arr){
            System.out.println(d);
        }
    }
    static void main(){
        int arr[] = {1,10,2,3,4,5};
        reverseArray(arr);

    }
}
