package com.company;
public class Multidimensional_Array {
    public static void main(String[] args){
        System.out.println("Displaying a multidimensional Array");
        int [][] flats = {{101,102,103},{201,202,203}};
        for(int i = 0;i<(flats.length);i+=1){
            for(int j=0;j<flats[i].length;j+=1){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }
        System.out.println("\n");
    }
}
