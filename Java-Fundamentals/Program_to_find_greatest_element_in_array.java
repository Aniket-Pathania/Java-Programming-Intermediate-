package com.company;
public class Program_to_find_greatest_element_in_array {
    public static void main(String[] args){
        int max = 0 ;
        int [] arr = {1,2,31123,4,243,23424};
        for(int i = 0;i<=(arr.length-1);i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in Array is "+max);
    }
}
