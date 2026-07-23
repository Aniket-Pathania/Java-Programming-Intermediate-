public class StringCompression {
    public static int stringCompression(char[] chars){
        int readIndex = 0;
        int writeIndex = 0;
        while(readIndex<chars.length){
            char ch = chars[readIndex];
            int count = 0;
            while(readIndex<chars.length && ch==chars[readIndex]){
                readIndex++;
                count++;
            }
            chars[writeIndex] = ch;
            writeIndex++;
            if (count>1){
                String countStr = String.valueOf(count);
                for(char c:countStr.toCharArray()){
                    chars[writeIndex] = c;
                    writeIndex++;
                }
            }
        }
        return writeIndex;
    }
    public static void main(String[] args){

        char[] chars = {'a','a','b','b','c','c','c'};

        int ans = stringCompression(chars);

        System.out.println("Length = " + ans);

        System.out.print("Compressed Array = ");

        for(int i = 0; i < ans; i++){

            System.out.print(chars[i] + " ");

        }

        System.out.println();
    }
}
