package com.company;
import java.util.Scanner;
public class Multiplication_table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the multiplication table ");
        int a = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}
