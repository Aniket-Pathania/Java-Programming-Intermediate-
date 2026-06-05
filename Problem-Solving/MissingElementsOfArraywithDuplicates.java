import java.util.List;
import java.util.ArrayList;

public class MissingElementsOfArraywithDuplicates {
    static List<Integer> MissingElement(int[] arr){
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<n;i++){
            int value = Math.abs(arr[i]);
            int index = value-1;
            if (arr[index]>0){
                arr[index] = -arr[index];
            }

        }
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                int newValue = i+1;
                ans.add(newValue);
            }
        }
        return ans;
    }
    public static void main(String[] args){

        int[] arr = {1,2,3,3,5,5,7};

        List<Integer> ans = MissingElement(arr);

        System.out.println(ans);
    }
}
