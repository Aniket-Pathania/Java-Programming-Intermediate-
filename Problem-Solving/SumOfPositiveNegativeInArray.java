public class SumOfPositiveNegativeInArray {
    static int[] getNegPosSum(int[] arr){
        int po = 0;
        int ne = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                po+=arr[i];
            }
            else {
                ne+=arr[i];
            }
        }
        int[] ans = {po,ne};
        return ans;

    }
    static void main(){
        int[] arr ={-1,-2,23,1};
        int[] ans = getNegPosSum(arr);

        System.out.println("The positive sum is = "+ans[0]+"The negative sum is = "+ans[1]);
    }
}
