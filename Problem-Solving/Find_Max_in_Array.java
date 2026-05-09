public class Find_Max_in_Array {
    static int maxelement(int[] arr ){
        int Max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>Max){
                Max = arr[i];
            }
        }
        return Max;
    }
    static void main(){
        int[] arr = {1,2,3,4};
        System.out.println(maxelement(arr));
    }
}
