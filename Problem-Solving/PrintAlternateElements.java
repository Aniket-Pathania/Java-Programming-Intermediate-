public class PrintAlternateElements {
    static void printAlternateEl(int[] arr){
        int i = 0;
        int n = arr.length;
        int j = n-1;
        while (i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }

        }
    }
    static void main(){
        int[] arr = {1,2,3,4,123};
        printAlternateEl(arr);
    }
}
