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
      System.out.println("Welcome to the Grocery Program. You will be able to shop from a set list of items.");
      System.out.println("You will be able to choose an item and the quantity of the item you want. You are");
      System.out.println("also able to remove items from your list by choosing the item and then entering what quantity");
      System.out.println("you would like to be removed. When you are finished shopping you can then head to the main");
      System.out.println("menu to checkout and display your total. This will also print out a list of your items and quantities.");
      System.out.println("Designed by: Taylor Coronel, Ricky Medina, Angel Rodgriguez, Charlie Garvin");


      System.out.println("****************************\n");
      
      System.out.println("****************************");
      System.out.println("* Welcome To The Main Menu *");
      System.out.println("****************************\n");
      
      do {
         System.out.println("Choose an option to continue with your Grocery List");
         System.out.println("1. Add items to your Grocery List");
         System.out.println("2. Remove items from your Grocery List");
         System.out.println("3. Calculate total cost & display all items");
         System.out.println("4. Exit");
            
         // reads user input for menu choice
         System.out.print("Enter option: ");
         menuChoice = scnr.nextInt();
         System.out.println("");
      
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
                  
                  switch (addChoice) {
                     case 1: // Add Bananas
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(1, quantity);
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
                        break;
                     case 2: // Add Gallon of Milk
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(2, quantity);
                        System.out.println(list.userCart.get(0));
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
                        break;
                     case 3: // Add Dozen Eggs
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(3, quantity);
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
                        break;
                     case 4: // Add Bread
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(4, quantity);
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
                        break;
                     case 5: // Add Butter
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(5, quantity);
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
                        break;
                     case 6: // Add Bacon
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(6, quantity);
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
                        break;
                     case 7: // Add Yogurt
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(7, quantity);
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
                        break;
                     case 8: // Add Box of Cereal
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(8, quantity);
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
                        break;
                     case 9: // Add Tuna
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(9, quantity);
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
                        break;
                     case 10: // Add Cheese
                        System.out.print("How many of this item do you want? ");
                        quantity = scnr.nextInt();
                        list.AddToCart(10, quantity);
                        
                        System.out.println("");
                        System.out.println("****************************");
                        System.out.println("* Choose Your Next Option. *");
                        System.out.println("****************************\n");
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
               
               if(list.userCart.size() < 1){
                  System.out.println("*************************************");
                  System.out.println("* Invalid option. Please try again. *");
                  System.out.println("*************************************\n");
                  System.out.println(" You don't have anything in your cart");
               }else{
               int removeChoice = 1;
               while(removeChoice != 0){
                  System.out.println("You have:");
                  list.printUserCart();
                  System.out.print("Which items would you like to remove: ");
                  removeChoice = scnr.nextInt();
                  list.userCart.remove(removeChoice-1);
                  list.userTotal.remove(removeChoice-1);
                  System.out.println("Item removed");
                  System.out.print(" Enter 0 for main menu 1 to continue: ");
                  removeChoice = scnr.nextInt(); 
               }
                 System.out.println("/n************************");
                 System.out.println("* Now At The Main Menu *");
                 System.out.println("************************\n");
              }
              break;
            case 3: // Calculate the total & and display all items
                  // The cost of the quanity for each item
                  // The total cost + tax
               System.out.println("/n*******************");
               System.out.println("* Displaying Cart *");
               System.out.println("*******************\n");
                list.printUserCart();
               double userTotalPrice = 0;
               for(int i= 0; i < list.userTotal.size();++i){
                  userTotalPrice = userTotalPrice + list.userTotal.get(i);
               }
               System.out.printf("total---------------$ %.2f%n", userTotalPrice );
               System.out.printf("total plus tax---------------$ %.2f%n",(userTotalPrice +( userTotalPrice * 0.06)));
               System.out.println("************************");
               System.out.println("* Now At The Main Menu *");
               System.out.println("************************\n");

                  
               break;
            case 4:
               System.out.println("/n************");
               System.out.println("* Goodbye! *");
               System.out.println("************\n");
               break;
            default:
               // if the user enters an invalid option
               if (menuChoice <= 0 || menuChoice > 4) {
                  System.out.println("/n*************************************");
                  System.out.println("* Invalid option. Please try again. *");
                  System.out.println("*************************************\n");
               }
               break;
         }
      } while (menuChoice != 4);
      scnr.close();
   }
}