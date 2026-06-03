import java.util.HashMap;
public class FirstRepeatingElementInArray {
    static int FirstRepeatingElement(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i :arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for (int d:arr){
            if (freq.get(d)>1){
                return d;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int[] arr = {10,5,3,4,3,5,6};

        int ans = FirstRepeatingElement(arr);

        System.out.println("First Repeating Element is " + ans);
    }

}
