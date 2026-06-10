import java.util.List;
import java.util.ArrayList;
public class SumOfEachColumnIn2DArray {
    static List<Integer> SumofColumns(int[][] arr){
        int n = arr[0].length;
        int m = arr.length;
        List<Integer> result = new ArrayList<>();
        for (int col = 0;col<n;col++){
            int sum = 0;
            for (int row =0;row<m;row++){
                int value = arr[row][col];
                sum+=value;
            }
            result.add(sum);

        }
        return result;

    }
    public static void main(String[] args){

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        List<Integer> ans = SumofColumns(arr);

        System.out.println(ans);
    }


}
