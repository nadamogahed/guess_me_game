package com.exmple.guessmegame;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
//        get the name of the user
        System.out.println("please enter your name: ");
        String name = scanner.next();
        System.out.println("hello "+name);
//        asking for start
        System.out.println("Start The Game?...");
        String start = scanner.next();



        if (start.equals("Yes") || start.equals("yes") || start.equals("y") || start.equals("k") || start.equals("Y") || start.equals("K"))
        {
            System.out.println("Remember you only have 5 tries to win!!!:D");
            Random random = new Random();
            int number = random.nextInt(5)+1;
            int guessed_num;


            do
            {
//                loop for counting times of tries
                for (int i = 0; i < 5; i++){
//                    get the guessed number from the user
                    System.out.println("enter guessed number: ");
                    guessed_num = scanner.nextInt();
//                    hints
                    if (guessed_num == number)
                    {
                        System.out.println("congartulations!!! You Guessed it right!!!<3");
                        break;
                    }
                    else if (guessed_num > number)
                    {
                        System.out.println("that's too high try something lower than "+ guessed_num + "...");
                    }
                    else if (guessed_num < number)
                    {
                        System.out.println("that's a little low try something higher than "+ guessed_num + "...");
                    }
                    else if (guessed_num < 0)
                    {
                        System.out.println("that's too low try something higher than 0...");
                    }
//                    when pass the try times show game over message
                    if (i == 4 && guessed_num != number)
                    {
                        System.out.println("Game over!:(");

                    }
                }
                break;
            }while (guessed_num != number);
        }
        else
        {
//            show message if they choose not to start
            System.out.println("hope to see you soon!!!:D");
        }



    }
}
