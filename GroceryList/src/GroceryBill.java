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
import java.util.*;

public class GroceryBill {
   public static void main(String[]args) {
      Scanner scnr = new Scanner(System.in);
      int quantity;
      int menuChoice;
      GroceryItems list = new GroceryItems();

      
      System.out.println("****************************");
      System.out.println("* Welcome To The Main Menu *");
      System.out.println("****************************\n");
      
      do {
         // might want to make all of these print outs into a method for every time the user decides to back in and out of each menu
         System.out.println("Choose an option to continue with your Grocery List");
         System.out.println("1. Add items to your Grocery List");
         System.out.println("2. Remove items from your Grocery List");
         System.out.println("3. Calculate total cost & display all items");
         System.out.println("4. Exit");
            
         // reads user input for menu choice
         System.out.print("Enter option: ");
         menuChoice = scnr.nextInt();
      
         switch (menuChoice) {
            // Displays the main menu options
            case 1: // Add  item to the Grocery List
               int addChoice;
               System.out.println("************************");
               System.out.println("* Now At Adding Menu *");
               System.out.println("************************\n");
                              
               do {
                  // this method prints the list of items and each list item prices
                 
                  list.printList();
                  System.out.println("0. Exit to Main Menu");
                  System.out.print("Choose an item to add to your list: ");
               
                  // reads the user input for which item they have selected
                  addChoice = scnr.nextInt();
                  
                  // OPTIONAL TODO: if a user enters 0 or less items to the quanity add an error message letting them know 0 or less quanity won't count
                  switch (addChoice) {
                     case 1: // Add Bananas
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(1, quantity);
                        break;
                     case 2: // Add Gallon of Milk
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(2, quantity);
                        System.out.println(list.userCart.get(0));
                        break;
                     case 3: // Add Dozen Eggs
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(3, quantity);
                        break;
                     case 4: // Add Bread
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(4, quantity);
                        break;
                     case 5: // Add Butter
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(5, quantity);
                        break;
                     case 6: // Add Bacon
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(6, quantity);
                        break;
                     case 7: // Add Yogurt
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(7, quantity);
                        break;
                     case 8: // Add Box of Cereal
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(8, quantity);
                        break;
                     case 9: // Add Tuna
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(9, quantity);
                        break;
                     case 10: // Add Cheese
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(10, quantity);
                        break;
                     case 0: // Exit
                        // Sends user back to the previous main menu
                        System.out.println("************************");
                        System.out.println("* Now At The Main Menu *");
                        System.out.println("************************\n");
                        break;
                     default:
                        // if the user enters an invalid response
                        if (addChoice < 0 || addChoice > 10) {
                           System.out.println("*************************************");
                           System.out.println("* Invalid option. Please try again. *");
                           System.out.println("*************************************\n");
                        }
                        break;
                  }
               } while (addChoice != 0);
               break;
            case 2: // Remove items from the Grocery List
               System.out.println("****************************");
               System.out.println("* Now At The Removing Menu *");
               System.out.println("****************************\n");
               int removeChoice = 1;
               while(removeChoice != 0){
                  System.out.println("You have:");
                  list.printUserCart();
                  System.out.print("Which items would you like to remove: ");
                  removeChoice = scnr.nextInt();
                  list.userCart.remove(removeChoice-1);
                  System.out.println("Item removed");
                  System.out.print(" Enter 0 for main menu 2 to continue: ");
                  removeChoice = scnr.nextInt(); 
               }
                 System.out.println("************************");
                 System.out.println("* Now At The Main Menu *");
                 System.out.println("************************\n");

              break;
              
            
            case 3: // Calculate the total & and display all items
               System.out.println("*******************");
               System.out.println("* Displaying Cart *");
               System.out.println("*******************\n");
               list.printUserCart();
               System.out.println("total---------------");
               System.out.println("total plus tax---------------");
               // put methods to display:
                  // The quanity of each item
                  // The cost of the quanity for each item
                  // The total amount of items
                  // The total cost + tax
               break;
            case 4:
               System.out.println("************");
               System.out.println("* Goodbye! *");
               System.out.println("************\n");
               break;
            default:
               // if the user enters an invalid option
               if (menuChoice < 0 || menuChoice > 4) {
                  System.out.println("*************************************");
                  System.out.println("* Invalid option. Please try again. *");
                  System.out.println("*************************************\n");
               }
               break;
         }
      } while (menuChoice != 4);
      scnr.close();
   }
}