public class TwoSumInArray {
    static int[] TwoSum(int[] arr,int target){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        int[] ans={};
        return ans;
    }
    static void main(){
        int[] arr  = {2,7,11,15};
        int[] ans = TwoSum(arr,9);
        System.out.println("FIrst index is "+ans[0]);
        System.out.println("Second index is "+ans[1]);
    }
}
