package org.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondAlgorithm {

    public static void checkName(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("Enter the name...");
                String name = reader.readLine();
                if(name.isEmpty()){
                    System.out.println("Empty enter. The program will stop");
                    break;
                }
                if (name.equalsIgnoreCase("вячеслав")) {
                    System.out.println("Привет Вячеслав");
                } else {
                    System.out.println("Нет такого имени");
                }
            } catch (IOException | InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
