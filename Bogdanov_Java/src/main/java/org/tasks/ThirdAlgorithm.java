package org.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThirdAlgorithm {


    public static Integer[] getArray(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size");
        Integer[] array = null;
        try {
            int arraySize = Integer.parseInt(reader.readLine());
            System.out.println("Enter numbers");
            array = new Integer[arraySize];
            for (int i = 0; i < arraySize; i++) {
                int a = Integer.parseInt(reader.readLine());
                array[i] = a;
            }
            System.out.println("Array with size " + arraySize + " was created");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return array;
    }


    public static void getNumbers(Integer[] arr){
        ArrayList<Integer> resultList = new ArrayList<>();
        for (Integer number : arr) {
            if (number % 3 == 0) {
                resultList.add(number);
            }
        }
        System.out.println("The result is..." + "\n" + resultList);
    }
}
