public class ArrBasic2 {
    static int[] multiplyby10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];
        for (int i=0;i<size;i++){
            int element = arr[i];
            int newElement = element*10;
            newArray[i] = newElement;
        }
        return newArray;


    }
    static void main(){
        int[] arr = {1,20,3,43};
        int[] ans = multiplyby10(arr);
        for (int i:ans){
            System.out.println(i);
        }
    }
}