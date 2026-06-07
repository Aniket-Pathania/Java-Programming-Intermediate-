public class MaxSumContiguousSubArray {
    static int MaxSubArray(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0;i<n;i++){
            sum = sum+arr[i];
            maxi = Math.max(maxi,sum);
            if (sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args){

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int ans = MaxSubArray(arr);

        System.out.println("Maximum Subarray Sum = " + ans);
    }
}
