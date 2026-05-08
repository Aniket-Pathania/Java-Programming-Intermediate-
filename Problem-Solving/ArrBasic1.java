public class ArrBasic1{
    static double arr_avg(int[] arr ){
        double sum =0;
        for (int i :arr){
            sum+=i;
        }
        double size = arr.length;
        double avg = sum/size;
        return avg;
    }
    static void main(){
        int[] arr = {1,2,3};
        System.out.println(arr_avg(arr));
    }
}