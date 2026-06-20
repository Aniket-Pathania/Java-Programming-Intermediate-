import java.util.ArrayList;
import java.util.List;

public class WavePrintAMatrix {
    static List<Integer> WavePrint(int[][] arr,int n,int m){
        List<Integer> result = new ArrayList<>();
        for (int col =0;col<n;col++){
            if (col%2==0){
                for (int row=0;row<n;row++){
                    int value = arr[row][col];
                    result.add(value);
                }
            }
            else{
                for (int row = n-1;row>=0;row--){
                    int v = arr[row][col];
                    result.add(v);
                }
            }
        }
        return result;
    }
    public static void main(String[] args){

        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int n = arr.length;
        int m = arr[0].length;

        List<Integer> ans = WavePrint(arr,n,m);

        System.out.println(ans);
    }

}
