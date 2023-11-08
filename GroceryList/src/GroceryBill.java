/******************************************************************************************************************************************************
Title: Grocery Bill System
Authors: Taylor Coronel, Ricky Medina, Angel Rodgriguez, Charles Garvin
Emails: rmedin41@bruinmail.slcc.edu
Program Description: Our program will take in user input to choose from a list of items that a user wants to buy along with their price.
                     The user will be able to add any number of items or to take off items from their list.
                     There will be an option to display their list of items and calculate the total and also an option to exit when the user is ready. 
                     The exit option will end the program and display a goodbye message.
Version: version-1
Date: 11/06/2023
******************************************************************************************************************************************************/
import java.util.Scanner;

public class GroceryBill {
   public static void main(String[]args) {
      Scanner scnr = new Scanner(System.in);
      
      // might want to make all of these print outs into a method for every time the user decides to back in and out of each menu
      System.out.println("Choose an option to continue with your Grocery List");
      System.out.println("1. Add items to your Grocery List");
      System.out.println("2. Remove items from your Grocery List");
      System.out.println("3. Calculate total cost & display all items");
      System.out.println("4. Exit");
      
      // reads user input for menu choice
      int menuChoice = scnr.nextInt();
      switch (menuChoice) {
         // Displays the main menu options
         case 1: // Add  item to the Grocery List
            // this method prints the list of items and each list item prices
            // printList();
            
            // reads the user input for which item they have selected
            int addChoice = scnr.nextInt();
            
            switch (addChoice) {
               case 1: // Add Bananas
                  break;
               case 2: // Add Gallon of Milk
                  break;
               case 3: // Add Eggs
                  break;
               case 4: // Add Bread
                  break;
               case 5: // Add Butter
                  break;
               case 6: // Add Bacon
                  break;
               case 7: // Add Yogurt
                  break;
               case 8: // Add Box of Cereal
                  break;
               case 9: // Add Tuna
                  break;
               case 10: // Add Cheese
                  break;
               case 0: // Exit
                  // Sends user back to the previous main menu
                  break;
               default:
                  // if the user enters an invalid response
                  // maybe use an if statement to show this message if the user enters invalid choice
                  System.out.println("Invalid option. Please try again.");
                  break;
            }
            break;
         case 2: // Remove item from the Grocery List
            // Prints the quanity for each item and allows the user to remove items from their list
            // printUserList();
            
            // remove item from the given options
            //reads the item choice the user has select
            int removeChoice = scnr.nextInt();
            
            switch (removeChoice) {
               case 1: // Remove Bananas
                  break;
               case 2: // Remove Gallon of Milk
                  break;
               case 3: // Remove Eggs
                  break;
               case 4: // Remove Bread
                  break;
               case 5: // Remove Butter
                  break;
               case 6: // Remove Bacon
                  break;
               case 7: // Remove Yogurt
                  break;
               case 8: // Remove Box of Cereal
                  break;
               case 9: // Remove Tuna
                  break;
               case 10: // Remove Cheese
                  break;
               case 0: // Exit
                  // Sends user back to the previous main menu
                  break;
               default:
                  // if the user enters an invalid response
                  // maybe use an if statement to show this message if the user enters invalid choice
                  System.out.println("Invalid option. Please try again.");
                  break;
            }
            break;
         case 3: // Calculate the total & and display all items
            // put methods to display:
               // The quanity of each item
               // The cost of the quanity for each item
               // The total amount of items
               // The total cost + tax
            break;
         case 4: // End/Exit program
            System.out.println("Goodbye");
            break;
         default:
            // if the user enters an invalid option
            System.out.println("Invalid option. Please try again.");
            break;
      }
      
      scnr.close();
   }
}