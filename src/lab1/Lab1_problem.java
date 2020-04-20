package lab1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
1. WAP to print all the occurrence of a given number from an array.
2. WAP program to print all the duplicate elements present in an array.
 */
public class Lab1_problem {
    public void occurrenceOfNumber(int element, int[] arr){
        System.out.println("indexes where the given element found are as follow:");
        for (int i = 0; i < arr.length ; i++) {
            if(element == arr[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public void duplicateDisplay(int[] arr){
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            boolean response = set.add(arr[i]);
            if(!response)
                set1.add(arr[i]);
        }
        if (!set1.isEmpty()){
            System.out.println("duplicate elements found:");
            for (int x: set1) {
                System.out.print(x+" ");
            }
            System.out.println();
        }else
            System.out.println("no duplicate element found");

    }

    public static void main(String[] args) {
        Lab1_problem object = new Lab1_problem();
        int[] array = {1,1,3,4,3,6,5,7,65,7,8,9};
        int[] array1 = {1,2,4,3,5,6,7,8,9};
        object.occurrenceOfNumber(3,array);
        object.duplicateDisplay(array);
        object.duplicateDisplay(array1);
    }
}
