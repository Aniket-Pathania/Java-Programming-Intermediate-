package com.company;
public class Calculate_Sum_of_Elements_of_Array {
    public static void main(String[] args){
        int sum =0;
        int [] Array1 = {1,2,3,4};
        for(int i = 0;i<=(Array1.length-1);i+=1){
            System.out.println(Array1[i]);
            sum+=Array1[i];
        }
        System.out.println("The sum of given array is");
        System.out.println(sum);
        
    }
}
