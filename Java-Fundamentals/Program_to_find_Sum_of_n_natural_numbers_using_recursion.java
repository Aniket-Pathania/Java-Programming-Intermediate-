package com.company;
public class Program_to_find_Sum_of_n_natural_numbers_using_recursion {
    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static void main(String[] args){
        int c =sumRec(5);
        System.out.println(c);
    }
}
