package com.company;

public class Main {

    public static void main(String[] args) {

        int X = 5;
        int Y = 8;
        int result = 2 + 5;
        int previousresult = result;
        System.out.println("" + result);
            result = result - 1;
        System.out.println("" + previousresult);
            result = result * 10;
        System.out.println("" + result);
            result = result / 5;
        System.out.println("" + result);
            result = result % 3;
        System.out.println("" + result);
            result ++;
        System.out.println("" + result);
            result --;
        System.out.println("" + result);
            result += 2;
        System.out.println("" + result);
            result -= 6;
        System.out.println("" + result);
            result *= 2;
        System.out.println("" + result);

        boolean isAlien = false;
        if(isAlien == true)
        {
            System.out.println("it is not an Alien");
            System.out.println("and I am scared of Alien");
        }
        else
        {
            System.out.println("it is an Alien");
            System.out.println("and I am scared of Alien");
        }

        int TopScore = 80;
        int SecondTopScore = 79;

        if (TopScore < 100)
        {
            System.out.println("You got High Score");
        }

        if (TopScore > SecondTopScore && TopScore < 100)
        {
            System.out.println("Greater than Second Score and less than 100");
        }

        boolean IsCar = false;
        if (!IsCar)
        {
            System.out.println("This is not supposed to happen");
        }

        int AgeOfLion = 20;
        Boolean IsEighteenOrOver = AgeOfLion == 20?true:false;
        System.out.println("" + IsEighteenOrOver);

        // challenge 1: create a double variable with a value of 20,
        // challenge 2: create second variable of double with value f 80
        // challenge 3: add both numbers together and multiply by 100
        // challenge 4: use the remainder operator to figure out what the remainder of the result in step 3 and 40
        // challenge 5: create a boolean variable that assigns the value true if remainder in challenge 4 is 0 or false if not zero
        // challenge 6: output boolean variable
        // challenge 7: Write an if the statement and display a message "got some remainder" if the boolean in challenge 5 is not true
        // challenge 8: explain the result
        System.out.println("");
        double Value_1 = 20;
        double Value_2 = 80;
        double Percent = (Value_1 + Value_2) * 100;
        System.out.println("Value: " + Percent);
        Percent %= 40;
        System.out.println("Remainder: " + Percent);
        if(Percent == 0)
        {
            boolean PercentTF = true;
            boolean PercentTFx = Percent == 0?true:false;               /*if the remainder value is equal to zero, then our result is true due to
                                                                          challenge condition that required a true boolean value when there was no remainder in the modulo calculation.*/
            System.out.println("Is Remainder equal to 0? " + PercentTFx);
        }
         else
         {
             System.out.println("Got some remainder");
         }
    }
}
