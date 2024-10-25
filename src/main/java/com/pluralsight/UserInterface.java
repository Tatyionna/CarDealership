package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    public Dealership dealership;
    public static Scanner scan = new Scanner(System.in);

    private void init () {
      dealership = DealershipFileManager.getDealership();

    }
    public void display () {
       init();
        int userOptions;

        while (true) {
            displayMenu();
            userOptions = scan.nextInt();
            switch (userOptions) {
                case 1:
                    viewAllVehicles();
                    break;
                case 2:
                    searchCriteria();
                    break;
                case 3:
                    System.out.printf("Exiting application");
                    System.exit(0);
                default:
                    System.out.println("Invalid option chosen, try again");
            }

        }

    }

    private void viewAllVehicles() {
        dealership.getAllVehicles();
    }

    private void searchCriteria() {
    }

    public void displayMenu () {
        System.out.println("""
                Welcome to TK Auto!\\n"
                1.View All Vehicles
                2.Search by Criteria:
                3.Exit""");

    }
}
