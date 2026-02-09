package com.company;
public class Whether_an_Array_is_Sorted_or_not {
    public static void main(String[] args){
        boolean isSorted = true;
        int [] arr = {1,2,3,4,5,8,1};
        for (int i=0;i<=(arr.length-1);i++){
            if (arr[i+1]<arr[i]){

                isSorted = false;
                break;
            }

        }
        System.out.println("The array is sorted this statement is "+isSorted);
    }
}
