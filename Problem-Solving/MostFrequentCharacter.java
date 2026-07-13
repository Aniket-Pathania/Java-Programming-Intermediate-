import java.util.HashMap;

public class MostFrequentCharacter {
    public char MostFrequentCharacter(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        char ans = 'a';
        int maxfreq = 0;
        for (char ch = 'a';ch<='z';ch++){
            if (map.containsKey(ch)){
                if (map.get(ch)>maxfreq){
                    maxfreq = map.get(ch);
                    ans = ch;
                }
            }

        }
        return ans;


    }
    public static void main(String[] args){

        MostFrequentCharacter obj = new MostFrequentCharacter();

        String s = "testsample";

        char ans = obj.MostFrequentCharacter(s);

        System.out.println("Most Frequent Character = " + ans);
    }
}
