import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        int digit;
        int sum = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0 && num<1000) {
            while(num>0) {
                digit = num%10;
                sum=sum+digit;
                num = num/10;
            }
            System.out.println("The sum of digits is "+sum);

        }
        else {
            System.out.println("Invaid number");
        }

    }

}