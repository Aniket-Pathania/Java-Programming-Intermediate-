public class FIndMissingNumberFromArray {
    static int MissingNumber(int[] arr){
        int n = arr.length;
        int xorsum = 0;
        for(int d:arr){
            xorsum = xorsum ^ d;
        }
        for (int j=0;j<=n;j++){
            xorsum = xorsum ^ j;
        }
        return xorsum;
    }
    static void main(){
        int[] arr = {0,1,2,3,5};
        int ans = MissingNumber(arr);
        System.out.println(ans);
    }
}
