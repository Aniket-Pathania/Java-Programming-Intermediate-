package com.company;
public class Intro_to_Arrays {
    public static void main(String [] args) {
        int [] marks = {1,2,3,4,5};
        System.out.println(marks[3]);
        String [] students = {"Aniket","Aryan","Shreyansh"};
        System.out.println("The length of students array is");
        System.out.println(students.length);
        System.out.println(students[0]);
        System.out.println("Displaying students array using for loop");
        for (int i=0;i<students.length;i++){
            System.out.println(students[i]);


        }
        System.out.println("Dispaying Marks array in reverse");
        for (int i= (marks.length -1);i>=0;i-=1){
            System.out.println(marks[i]);
        }
    }
}
