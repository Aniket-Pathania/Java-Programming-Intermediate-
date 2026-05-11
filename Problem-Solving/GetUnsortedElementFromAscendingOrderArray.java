public class GetUnsortedElementFromAscendingOrderArray {
    static int getUnsortedElement(int[] arr){
        for (int i =0;i<arr.length;i++){
            if (arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    static void main(){
        int[] arr = {1,2,3,4,2,5};
        int ans = getUnsortedElement(arr);
        System.out.println(ans);
    }
}
