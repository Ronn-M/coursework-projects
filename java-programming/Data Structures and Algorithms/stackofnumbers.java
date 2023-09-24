package com.company;
import java.util.Scanner;
import java.util.*;


public class Mashava_StackOfNumbers
{

    public static void main(String[] args)
    {
        Stack Numbers = new Stack<Integer>();
        Scanner Input = new Scanner(System.in);
        int Num;

        for (int counter = 10; counter >= 1; counter --)
        {
                        System.out.print("Menu:\n" +
                    "[1] - Add item\n" +
                    "[2] - Delete an item\n" +
                    "[3] - Display top\n" +
                    "[4] - Print all items\n" +
                    "[5] - Search the position of the first element found\n" +
                    "[6] - Check if empty\n" +
                    "[7] - Exit\n\n"
                    + "Input Option Menu Number to Continue: ");

            int ManNum = Input.nextInt();
                switch (ManNum)
                {
                    case 1:
                        System.out.print("[1] - Add item: ");
                    Numbers.add(Num = Input.nextInt());

                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp1 = new Scanner(System.in);
                    int ExOrC1 = Inp1.nextInt();

                        if (ExOrC1 == 1)
                        {
                            counter += 1;
                        }

                        else
                        {
                            counter = 0;
                        }

                    break;

                    case 2:
                        System.out.print("[2] - Delete an item: ");
                        Num = Input.nextInt();

                        if (Numbers.empty() == true)
                        {
                        System.out.println("\n*ERROR* Stack is Empty! Please Add items to view stack.\n");
                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp2 = new Scanner(System.in);
                    int ExOrC2 = Inp2.nextInt();

                            if (ExOrC2 == 1)
                            {
                                counter += 1;
                            }
                            else
                            {
                                counter = 0;
                            }
                        }

                        else if (Numbers.search(Num) < 1)
                        {
                        System.out.println("\n*ERROR* Item does not exist in stack.\n");
                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp2 = new Scanner(System.in);
                    int ExOrC2 = Inp2.nextInt();

                            if (ExOrC2 == 1)
                            {
                                counter += 1;
                            }
                            else
                            {
                                counter = 0;
                            }
                        }

                        else
                        {
                        Numbers.removeElement(Num);
                        System.out.println("\nItem Deleted\n");
                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp2 = new Scanner(System.in);
                    int ExOrC2 = Inp2.nextInt();

                            if (ExOrC2 == 1)
                            {
                                counter += 1;
                            }
                            else
                            {
                            counter = 0;
                            }
                        }
                    break;

                    case 3:
                        System.out.println("[3] - Display top: ");
                        System.out.println("\n" + Numbers.peek() + "\n");
                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp3 = new Scanner(System.in);
                    int ExOrC3 = Inp3.nextInt();

                    if (ExOrC3 == 1)
                    {
                        counter += 1;
                    }

                    else
                    {
                        counter = 0;
                    }

                    break;

                    case 4:
                        System.out.print("[4] - Print all items: ");

                    if (Numbers.empty() == true)
                    {
                        System.out.println("\n*ERROR* Stack is Empty! Please Add items to view stack.\n");

                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp4 = new Scanner(System.in);
                    int ExOrC4 = Inp4.nextInt();

                        if (ExOrC4 == 1)
                        {
                            counter += 1;
                        }

                        else
                        {
                            counter = 0;
                        }
                    }

                    else
                    {
                        System.out.println("\n" + Numbers + "\n");
                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp4 = new Scanner(System.in);
                    int ExOrC4 = Inp4.nextInt();

                        if (ExOrC4 == 1)
                        {
                            counter += 1;
                        }
                        else
                        {
                            counter = 0;
                        }
                    }
                    break;

                    case 5:
                        System.out.print("[5] - Search the position of the first element found: ");

                    if (Numbers.empty() == true)
                    {
                        System.out.println("\n*ERROR* Stack is Empty! Please Add items to view stack.\n");
                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp4 = new Scanner(System.in);
                    int ExOrC4 = Inp4.nextInt();

                        if (ExOrC4 == 1)
                        {
                            counter += 1;
                        }
                        else
                        {
                            counter = 0;
                        }
                    }

                    else if (Numbers.search(Num = Input.nextInt()) > -1)
                    {
                        System.out.println("\n" + Numbers.search(Num) + "\n");
                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp4 = new Scanner(System.in);
                    int ExOrC4 = Inp4.nextInt();

                        if (ExOrC4 == 1)
                        {
                            counter += 1;
                        }
                        else
                        {
                            counter = 0;
                        }
                    }

                    else
                    {
                        System.out.println("\n*ERROR* Item does not exist in stack.\n");
                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp4 = new Scanner(System.in);
                    int ExOrC4 = Inp4.nextInt();

                        if (ExOrC4 == 1)
                        {
                            counter += 1;
                        }

                        else
                        {
                            counter = 0;
                        }
                    }
                    break;

                    case 6:
                        System.out.print("[6] - Check if empty: ");
                        System.out.println("\n" + Numbers.empty() + "\n");

                        System.out.print("\nDo you wish to perform another action? (type [1] 'Yes' to continue & [0] 'No' to exit): ");

                    Scanner Inp6 = new Scanner(System.in);
                    int ExOrC6 = Inp6.nextInt();

                    if (ExOrC6 == 1)
                    {
                        counter += 1;
                    }

                    else
                    {
                        counter = 0;
                    }
                    break;

                    case 7:
                    java.lang.System.exit(0);
                    break;
            }
        }
    }
}
