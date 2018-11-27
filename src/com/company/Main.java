package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int n = 25;
        int temp = 0;
        int[] array= new int[n];
        for (int i = 0; i <n; i++) {
            array[i] = (int)(Math.random()*45-20);
        }
        System.out.println("ARRAY:");
        System.out.println(Arrays.toString(array) + "\n");
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if( array[j] > array[j+1] ) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("NEW ARRAY:");
        System.out.println(Arrays.toString(array) + "\n");
    }

}

