public class PivotIndex {
    static int PivotIndex(int[] arr){
        int n = arr.length;
        int leftsum[] = new int[n];
        int rightsum[] = new int[n];
        leftsum[0] = arr[0];
        for (int i=1;i<n;i++){
            leftsum[i] = leftsum[i-1] + arr[i];
        }
        rightsum[n-1] = arr[n-1];
        for (int j=n-2;j>=0;j--){
            rightsum[j] = rightsum[j+1]+arr[j];
        }
        for (int i=0;i<n;i++){
            if (leftsum[i]==rightsum[i]){
                return i;
            }
        }
        return -1;
    }
    static void main(String[] args){

        int[] arr = {1,7,3,6,5,6};

        int ans = PivotIndex(arr);

        System.out.println("Pivot Index = " + ans);
    }
}
