package com.company;
public class Program_to_find_smallest_element_in_array {
    public static void main(String[] args){
        int [] arr = {0,-11,2,34,44};
        int min =0;
        for (int i=0;i<=(arr.length-1);i++){
            if (arr[i]<min){
                min = arr[i];

            }

        }
        System.out.println("The minimum element in the array is  "+min);
    }
}
