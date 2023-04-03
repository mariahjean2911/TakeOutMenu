package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creating an array with four columns and four rows of menu items to choose from
        //First column is appetizers
        //Second column is soups/salads
        //Third column is entrées
        //Fourth column is desserts

        double[][] menuPrices = {{5.00, 4, 7, 8},
                {4, 7, 10, 12},
                {16, 18, 22, 40},
                {7, 8, 9, 10}};
        int totalPrice = 0;

        System.out.println(menuPrices.length);
        System.out.println("The Appetizers to choose from are:");
        System.out.println("1. Chicken Tenders" +
                " 2. Stuffed Quahog" +
                " 3. Fried Calamari" +
                " 4. Shrimp Cocktail");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate which number appetizer you would like and press enter: ");
        int appetizer = scanner.nextInt();

        if (appetizer == 1) {
            System.out.println("Chicken Tenders price: $" + menuPrices[0][0]);
            totalPrice += menuPrices[0][0];
        } else if (appetizer == 2) {
            System.out.println("Stuffed Quahog price: $" + menuPrices[0][1]);
            totalPrice += menuPrices[0][1];
        } else if (appetizer == 3) {
            System.out.println("Fried Calamari price: $" + menuPrices[0][2]);
            totalPrice += menuPrices[0][2];
        } else if (appetizer == 4) {
            System.out.println("Shrimp Cocktail price: $" + menuPrices[0][3] + ".00");
            totalPrice += menuPrices[0][3];
        }

        System.out.println("The Soups and Salads to Choose From Are: ");
        System.out.println("5. Clam Chowder" +
                " 6. Lobster Bisque" +
                " 7. Chef's Salad" +
                " 8. Chicken Caesar Salad");
        System.out.println("Please indicate which number Soup or Salad you would like and press enter: ");
        int soupSalad = scanner.nextInt();
        if (soupSalad == 5) {
            System.out.println("Clam Chowder price: $" + menuPrices[1][0]);
            totalPrice += menuPrices[1][0];
        } else if (soupSalad == 6) {
            System.out.println("Lobster Bisque price: $" + menuPrices[1][1]);
            totalPrice += menuPrices[1][1];
        } else if (soupSalad == 7) {
            System.out.println("Chef's Salad price: $" + menuPrices[1][2]);
            totalPrice += menuPrices[1][2];
        } else if (soupSalad == 8) {
            System.out.println("Chicken Caesar Salad price: $" + menuPrices[1][3]);
            totalPrice += menuPrices[1][3];
        }

        System.out.println("The Entrees to Choose From Are: ");
        System.out.println("9. Chicken Florentine" +
                " 10. Chicken Alfredo" +
                " 11. Shrimp Scampi" +
                " 12. Filet Mignon");
        System.out.println("Please Indicate Which Number Entree You Would Like and Press Enter: ");
        int entree = scanner.nextInt();
        if (entree == 9) {
            System.out.println("Chicken Florentine price: $" + menuPrices[2][0]);
            totalPrice += menuPrices[2][0];
        } else if (entree == 10) {
            System.out.println("Chicken Alfredo price: $" + menuPrices[2][1]);
            totalPrice += menuPrices[2][1];
        } else if (entree == 11) {
            System.out.println("Shrimp Scampi price: $" + menuPrices[2][2]);
            totalPrice += menuPrices[2][2];
        } else if (entree == 12) {
            System.out.println("Filet Mignon price: $" + menuPrices[2][3]);
            totalPrice += menuPrices[2][3];
        }

        System.out.println("The Desserts to Choose From Are: ");
        System.out.println("13. Cheesecake" +
                " 14. Brownie Sundae" +
                " 15. Raspberry Chocolate Tart" +
                " 16. Tiramisu");
        System.out.println("Please Indicate Which Number Dessert You Would Like and Press Enter: ");
        int dessert = scanner.nextInt();
        if (dessert == 13) {
            System.out.println("Cheesecake price: $" + menuPrices[3][0]);
            totalPrice += menuPrices[3][0];
        } else if (dessert == 14) {
            System.out.println("Brownie Sundae price: $" + menuPrices[3][1]);
            totalPrice += menuPrices[3][1];
        } else if (dessert == 15) {
            System.out.println("Raspberry Chocolate Tart price: $" + menuPrices[3][2]);
            totalPrice += menuPrices[3][2];
        } else if (dessert == 16) {
            System.out.println("Tiramisu price: $" + menuPrices[3][3]);
            totalPrice += menuPrices[3][3];
        }
        System.out.println("Thank You For Dining With Us!");

        System.out.println("Total price: $" + totalPrice);
    }
}