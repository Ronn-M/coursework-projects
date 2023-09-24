package com.company;

import java.io.DataOutputStream;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.TransferQueue;

public class Mashava_Finals_Summative_Assessment {

    public static void main(String[] args) {

        Queue<Integer> S = new LinkedList<Integer>();
        Queue<Integer> T = new LinkedList<Integer>();
        Queue<Integer> TheGame = new LinkedList<Integer>();

        //Selection for odd or even numbers to the S queue
        Scanner Input = new Scanner(System.in);

        int Checker = 0;
        int SChecker = 0;
        int RSelector = (int) (Math.random() * 2);

        System.out.print("This is a random selector between variables S and T. It will select which of the 2 will store odd or even numbers at random, " +
                "\nafter it will output numbers at random from each set. The last number to be outputted will win the game.\nType any Character to proceed: ");

        String NA = Input.nextLine();
        int i = 100000;
        int ii = 2;
        int multiplier = 2;

        if (RSelector == 1) //S stored odd numbers
        {

            System.out.println("\nS Queue has odd number");
            for (int counter = 0; counter < 10; counter++) {

                i /= 3;
                S.add(i);
                ii *= multiplier;
                T.add(ii);

            }
        } else if (RSelector == 0) {

            System.out.println("\nS Queue has even number");
            for (int counter = 0; counter < 10; counter++) {

                i /= 3;
                T.add(i);
                ii *= multiplier;
                S.add(ii);

            }
        }


        int PassCheck = (int) S.toArray()[0];

        System.out.println("S = " + S);
        System.out.println("T = " + T);
        System.out.println("");

            for ( int RCounter = 0; RCounter < 20; RCounter ++)
            {

                    int SSelector = (int) (Math.random() * 2);

                {

                if (SSelector == 1)
                {

                    if (S.isEmpty())
                    {
                        TheGame.add(T.poll());
                    }

                    else
                    {
        System.out.println("S has been selected: " + S.peek());
                        TheGame.add(S.poll());
                    }

                }

                else if (SSelector == 0)
                {


                if (T.isEmpty())
                {
                    TheGame.add(S.poll());
                }
                else
                {
        System.out.println("T has been selected: " + T.peek());
                    TheGame.add(T.poll());
                }


                }

                }

                }

      System.out.println("\n" + TheGame);

            Checker = (int) TheGame.toArray()[19];
            SChecker = PassCheck;

            SChecker %= 2;
            Checker %= 2;

            if (Checker == 0 && SChecker == 0)
            {

      System.out.println("\nS has won!");

            }

            else
            {

      System.out.println("\nT has won!");

            }
        }
    }





