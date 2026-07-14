public class RemoveOccurencesOfASubstring {
    public String RemoveOccurencesOfASubstring(String s,String part){
        while(s.contains(part)){
            int index = s.indexOf(part);
            s = s.substring(0,index)+s.substring(index+part.length());

        }
        return s;
    }
    public static void main(String[] args){

        RemoveOccurencesOfASubstring obj = new RemoveOccurencesOfASubstring();

        String s = "daabcbaabcbc";
        String part = "abc";

        String ans = obj.RemoveOccurencesOfASubstring(s, part);

        System.out.println("Final String = " + ans);
    }
}
