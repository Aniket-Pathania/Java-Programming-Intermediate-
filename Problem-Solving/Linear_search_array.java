public class Linear_search_array {
    static boolean search(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return true;
            }

        }
        return false;

    }
    static void main(){
        int[] arr = {1,2,3,4};
        int target = 3;
        System.out.println(search(arr,target));
    }
}
