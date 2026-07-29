import java.util.Scanner;
public class PalindromeChecker {
    public static Boolean isPalindrome(String s){
        String lowers = s.toLowerCase();
        int i = 0;
        int j = lowers.length()-1;
        while(i<j){
            if (lowers.charAt(i)!=lowers.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Enter  the string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (isPalindrome(input) == true){
            System.out.println(input+" is a palindrome");
        }
        else{
            System.out.println(input+" is not a palindrome");
        }
    }
}
