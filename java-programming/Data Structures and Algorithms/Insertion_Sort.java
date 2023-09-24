package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Mashava_Insertion_Sort
{
    private void insertionSort (int intArray[])
    {
        int n = intArray.length;
            for (int i = 1; i < n; ++i)
            {
                 int key = intArray[i];
                 int j   = i - 1;

                 while (j >= 0 && intArray[j] > key)
                {
                    intArray[j + 1] = intArray[j];
                    j = j - 1;
                }
                    intArray[j + 1] = key;
            }
    }
    public static void main (String args[])
    {
        Mashava_Insertion_Sort insertionSort = new Mashava_Insertion_Sort();

        Scanner Input = new Scanner(System.in);

        System.out.print("Input Array Size: ");
        int N = Input.nextInt();
        int[] intArray = new int[N];

            for (int i = 0; i < N; i ++)
            {
                System.out.print("Num[" + i + "]: ");
                int Num = Input.nextInt();
                intArray[i] = Num;
            }
        System.out.println("Before Sorting:" + Arrays.toString(intArray));
        insertionSort.insertionSort(intArray);
        System.out.println("After Sorting :" + Arrays.toString(intArray));
    }
}
