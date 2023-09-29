package org.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstAlgorithm {

    public static void printHello(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

           while (true) {
                try {
                    Thread.sleep(500);
                    System.out.println("Enter a number...");
                    int enteredNumber = Integer.parseInt(reader.readLine());
                if (enteredNumber > 7) {
                    System.out.println("Привет");
                    continue;
                }
                    if(enteredNumber == 000){
                        System.out.println("Stop the program");
                        break;
                    }
                else{
                    System.out.println("Number <= 7 " + "\n"
                            + "Your enter is: " + enteredNumber);
                }
                }
                catch (IOException | NumberFormatException | InterruptedException e){
                    System.out.println("Your enter is not a number");
                }
            }
        }
    }

