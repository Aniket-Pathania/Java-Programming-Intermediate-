import java.util.List;
import java.util.ArrayList;

public class SumOfEachRowIn2DArray {

    static List<Integer> SumOfEachRowIn2DArray(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;

        List<Integer> result = new ArrayList<>();

        for(int row = 0; row < n; row++){

            int sum = 0;

            for(int col = 0; col < m; col++){

                int value = arr[row][col];

                sum = sum + value;
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

        List<Integer> ans = SumOfEachRowIn2DArray(arr);

        System.out.println(ans);
    }
}