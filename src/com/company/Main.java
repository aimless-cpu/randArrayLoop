package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[49];
        int sum = 0;

        Random rand = new Random();
        int frontier = 101;

        for (int i = 0; i < 49; i++) {
            intArray[i] = rand.nextInt(frontier);
            sum=sum+intArray[i];
        }

        System.out.println(sum);

    }
}
