public class FindUniqueNumberFromArray {
    static int getUniqueNumber(int[] arr){
        int n = arr.length;
        int xorsum = 0;
        for (int i:arr){
            xorsum = xorsum ^ i;
        }
        return xorsum;
    }
    static void main(){
        int[] arr = {1,1,2,2,3,5,3,10,10};
        int d = getUniqueNumber(arr);
        System.out.println(d);
    }
}
