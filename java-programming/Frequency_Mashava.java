package com.company;
import java.util.Scanner;

public class Frequency_Mashava

        {
            public static void main(String[] args)

            {
                String InPut = " ";
                Scanner InPsc = new Scanner(System.in);

                System.out.println("Enter a string: ");

                InPut = InPsc.nextLine();

                int[] freq = new int[InPut.length()];
                int C, F;

            //Converts given string into character array
                    char string[] = InPut.toCharArray();

                        for(C = 0; C < InPut.length(); C ++)

                            {
                            freq[C] = 1;

                        for(F = C + 1; F < InPut.length(); F ++)

                            {
                            if(string[C] == string[F])

                                {
                                freq[C] ++;

            //Set string[j] to 0 to avoid printing visited character
                    string[F] = '0';

                                }
                            }
                            }

            //Displays each character and their corresponding frequency
            for(C = 0; C < freq.length; C ++)

                {
                    if(string[C] != ' ' && string[C] != '0')

                        System.out.println(string[C] + "    -   " + freq[C]);

                }
            }
        }