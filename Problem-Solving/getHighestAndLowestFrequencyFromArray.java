import java.util.HashMap;
public class getHighestAndLowestFrequencyFromArray {
    static int[] getfrequencies(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i :arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int Maxf = -1;
        int Maxk = -1;
        for(int i:freq.keySet()){
            int Currentk = i;
            int Currentf = freq.get(i);
            if(Currentf>Maxf){
                Maxf = Currentf;
                Maxk = Currentk;
            }
        }
        int Lowf = Integer.MAX_VALUE;
        int Lowk = -1;
        for (int i:freq.keySet()){
            int Currentk = i;
            int Currentf = freq.get(i);
            if (Currentf<Lowf){
                Lowf = Currentf;
                Lowk = Currentk;
            }

        }
        int[] ans = {Maxk,Lowk};
        return ans;
    }
    static void main(){
        int[] arr = {10,2,3,4,4,4,2,2,2,2,2,2,2,2,2,3};
        int[] ans = getfrequencies(arr);
        System.out.println("The max k is "+ans[0]);
        System.out.println("The low k is "+ans[1]);


    }

}
