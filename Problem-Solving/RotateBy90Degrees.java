public class RotateBy90Degrees {
    static void Rotate(int[][] arr,int N){
        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
        for(int row=0;row<N;row++){
            int start =0;
            int end =N-1;
            while(start<=end){
                int temp = arr[row][start];
                arr[row][start] = arr[row][end];
                arr[row][end] = temp;
                start++;
                end--;

            }
        }
    }
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int N = arr.length;

        Rotate(arr, N);

        System.out.println("Matrix after 90 degree clockwise rotation:");

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                System.out.print(arr[i][j] + " ");

            }

            System.out.println();
        }
    }
}
