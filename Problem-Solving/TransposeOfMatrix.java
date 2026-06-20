public class TransposeOfMatrix {
    static int[][] Transpose(int[][] arr){
        int originalRow = arr.length;
        int originalCol = arr[0].length;
        int newRow = originalCol;
        int newCol = originalRow;
        int ans[][] = new int[newRow][newCol];
        for (int i = 0;i<originalRow;i++){
            for (int j =0;j<originalCol;j++){
                ans[j][i] = arr[i][j];

            }
        }
        return ans;
    }
    public static void main(String[] args){

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] ans = Transpose(arr);

        System.out.println("Transpose Matrix:");

        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){

                System.out.print(ans[i][j] + " ");

            }
            System.out.println();
        }
    }
}
