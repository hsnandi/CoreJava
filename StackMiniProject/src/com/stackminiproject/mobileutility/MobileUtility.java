package com.stackminiproject.mobileutility;
import com.stackminiproject.mobile.Mobile;

import java.util.Scanner;

public class MobileUtility {
    private Mobile[] mobiles;
    private int top = 0;

    public void setSize(Scanner scanner) {
        System.out.println("Enter the value of your size: ");
        mobiles = new Mobile[scanner.nextInt()];
    }

    public void printAllMobiles() {
        System.out.println("Mobile Entries:");
        for (int i = 0; i < top; i++) {
            if (mobiles[i] != null) {
                System.out.println("Serial Number: " + mobiles[i].getSerialNumber());
                System.out.println("Brand: " + mobiles[i].getBrandName());
                System.out.println("OS: " + mobiles[i].getOs());
                System.out.println("---------------------------");
            }
        }
    }

    public int printMenu(Scanner scanner) {
        System.out.println("1: Add Mobile Entry");
        System.out.println("2: Update Mobile Entry");
        System.out.println("3: Delete Mobile Entry");
        System.out.println("4: Print Mobile Entry");
        System.out.println("5: Show All Mobile Entry");
        System.out.println("0: Exit");
        return scanner.nextInt();
    }

    public void addMobileEntry(Scanner scanner) {
        if (top < mobiles.length) {
            mobiles[top] = new Mobile();
            System.out.println("Enter Mobile Brand: [Samsung/Motorola/iPhone/Nokia] ");
            mobiles[top].setBrandName(scanner.next());
            System.out.println("Enter Serial Number: ");
            mobiles[top].setSerialNumber(scanner.nextInt());
            System.out.println("Enter OS: ");
            mobiles[top].setOs(scanner.next());
            top++;
        } else {
            System.out.println("Mobile Utility is full.");
        }
    }

    public void deleteMobileEntry() {
        if (top > 0) {
            System.out.println("Enter Serial Number to delete Mobile Entry: ");
            int serialNumber = new Scanner(System.in).nextInt();
            boolean found = false;
            for (int i = 0; i < top; i++) {
                if (mobiles[i] != null && mobiles[i].getSerialNumber() == serialNumber) {
                    mobiles[i] = null;
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Record not found.");
            } else {
                top--;
                System.out.println("Mobile entry deleted successfully.");
            }
        } else {
            System.out.println("No mobile entries to delete.");
        }
    }

    public void updateMobileEntry(Scanner scanner) {
        System.out.println("Enter Serial Number to update Mobile Entry: ");
        int serialNumber = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < top; i++) {
            if (mobiles[i] != null && mobiles[i].getSerialNumber() == serialNumber) {
                System.out.println("Enter New Brand: ");
                mobiles[i].setBrandName(scanner.next());
                System.out.println("Enter New OS: ");
                mobiles[i].setOs(scanner.next());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Record not found.");
        } else {
            System.out.println("Mobile entry updated successfully.");
        }
    }

    public void printMobileEntry(Scanner scanner) {
        System.out.println("Enter Serial Number to print Mobile Entry: ");
        int serialNumber = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < top; i++) {
            if (mobiles[i] != null && mobiles[i].getSerialNumber() == serialNumber) {
                System.out.println("Serial Number: " + mobiles[i].getSerialNumber());
                System.out.println("Brand: " + mobiles[i].getBrandName());
                System.out.println("OS: " + mobiles[i].getOs());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Record not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobileUtility mobileUtility = new MobileUtility();

        mobileUtility.setSize(scanner);

        int choice;
        do {
            choice = mobileUtility.printMenu(scanner);
            switch (choice) {
                case 1:
                    mobileUtility.addMobileEntry(scanner);
                    break;
                case 2:
                    mobileUtility.updateMobileEntry(scanner);
                    break;
                case 3:
                    mobileUtility.deleteMobileEntry();
                    break;
                case 4:
                    mobileUtility.printMobileEntry(scanner);
                    break;
                case 5:
                    mobileUtility.printAllMobiles();
                    break;
                case 0:
                    System.out.println("Exiting Mobile Utility. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
