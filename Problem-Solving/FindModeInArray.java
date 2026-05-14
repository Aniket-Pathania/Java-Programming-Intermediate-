import java.util.HashMap;

public class FindModeInArray {
    static int get_Mode(int[]arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i:arr){
            freq.put(i,freq.getOrDefault(i,0)+1);

        }
        int maxf = -1;
        int maxk = -1;
        for(int i:freq.keySet()){
            int currentk = i;
            int currentf = freq.get(i);
            if (currentf>maxf){
                maxf = currentf;
                maxk = currentk;
            }



        }
        return maxk;
    }
    static void main(){
        int[] arr = {1,2,3,4,5,1,1,1,1,2,2,2};
        int ans = get_Mode(arr);
        System.out.println("The Highest freq element is "+ans);
    }

}
