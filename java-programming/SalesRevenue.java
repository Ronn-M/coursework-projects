package com.company;

import java.util.Scanner;

public class SalesRevenue_Mashava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Song Name: ");
                String SongName = scanner.nextLine();

            System.out.print("Enter Purchasing Price: $");
                double PurchasePrice = scanner.nextDouble();

            System.out.print("Enter Number of Copies Sold: ");
                int NumberofCopies = scanner.nextInt();

                double GrossRevenue = PurchasePrice * NumberofCopies;
                double ManagersCommission =  (GrossRevenue * 0.12);
                double SiteCommission = (GrossRevenue * 0.3);
                double NetRevenue = (GrossRevenue - (ManagersCommission + SiteCommission));

            System.out.println("Gross Revenue of Song   : $" + GrossRevenue);
            System.out.println("Managers Commission     : $" + ManagersCommission);
            System.out.println("Site Commission         : $" + SiteCommission);
            System.out.println("Net Revenue of Song     : $" + NetRevenue);
    }
}
