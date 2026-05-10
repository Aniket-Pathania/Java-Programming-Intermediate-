public class CountNoOf0and1 {
    static int[] noOf0and1(int[] arr){
        int countz = 0;
        int counto = 0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]==0){
                countz++;
            }
            else {
                counto ++;

            }
        }
        int[] ans = {countz,counto};
        return ans;
    }
    static void main(){
        int[] arr = {0,0,1,1,1,1,0,1};
        int[] ans = noOf0and1(arr);
        System.out.println("The no of 0's are = " +ans[0]);
        System.out.println("The no of 1's are = " +ans[1]);
    }
}
