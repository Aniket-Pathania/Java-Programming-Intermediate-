public class SortAnArrayOf0sand1s {
    static void getSortedArray(int[] arr){
        int i = 0;
        int n = arr.length;
        int j = n-1;
        while (i<j){
            if (arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j]==1){
                j--;
            }
            if (arr[i]==0){
                i++;
            }

        }
        for (int d:arr){
            System.out.println(d);
        }



    }
    static void main(){
        int[] arr = {1,1,0,0,1,1,0,0,0,1};
        getSortedArray(arr);
    }
}
