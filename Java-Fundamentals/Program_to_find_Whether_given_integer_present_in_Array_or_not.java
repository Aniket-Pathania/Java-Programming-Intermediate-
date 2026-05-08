package com.company;
import java.util.Scanner;
public class Program_to_find_Whether_given_integer_present_in_Array_or_not {
    public static void main(String[] args){
        System.out.println("Enter the Integer to check the number is in Array or not");
        Scanner sc = new Scanner(System.in);
        boolean isInArray = false;
        int Int = sc.nextInt();
        int [] Arr = {1,2,3,4,5};
        for (int i=0;i<=(Arr.length-1);i+=1){

            if (Arr[i]==Int){
                isInArray = true;
                break;
            }



        }
        if (isInArray){
            System.out.println("The given number is present in array ");

        }
        else{
            System.out.println("No the given number is not present in array");

        }




    }
}
