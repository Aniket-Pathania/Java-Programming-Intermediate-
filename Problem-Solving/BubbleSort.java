public class BubbleSort {
    static void BubbleSort(int[] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void main(){
        int[] arr = {3,2,10,0};
        BubbleSort(arr);
        System.out.println("Sorted Elements are");
        for(int d:arr){
            System.out.print(d +  "  ");
        }
    }
}
