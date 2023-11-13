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
      

      
      // might want to make all of these print outs into a method for every time the user decides to back in and out of each menu
      System.out.println("Choose an option to continue with your Grocery List");
      System.out.println("1. Add items to your Grocery List");
      System.out.println("2. Remove items from your Grocery List");
      System.out.println("3. Calculate total cost & display all items");
      System.out.println("4. Exit");
      
      // reads user input for menu choice
      System.out.print("Enter option: ");
      int menuChoice = scnr.nextInt();
      switch (menuChoice) {
         // Displays the main menu options
         case 1: // Add  item to the Grocery List
            // this method prints the list of items and each list item prices
            GroceryItems list = new GroceryItems();
            list.printList();
            System.out.print("Choose an item to add to your list: ");
            
            // reads the user input for which item they have selected
            int addChoice = scnr.nextInt();
            
            switch (addChoice) {
               case 1: // Add Bananas
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(1, quantity);
                  break;
               case 2: // Add Gallon of Milk
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(2, quantity);
                  System.out.println(list.userCart.get(0));
                  break;
               case 3:
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(3, quantity);
                  break;
               case 4: // Add Bread
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(4, quantity);
                  break;
               case 5: // Add Butter
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(5, quantity);
                  break;
               case 6: // Add Bacon
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(6, quantity);
                  break;
               case 7: // Add Yogurt
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(7, quantity);
                  break;
               case 8: // Add Box of Cereal
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(8, quantity);
                  break;
               case 9: // Add Tuna
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(9, quantity);
                  break;
               case 10: // Add Cheese
                  System.out.print("How many of this item do you want?");
                  quantity = scnr.nextInt();
                  list.AddToCart(10, quantity);
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
         case 2: System.out.println("Which items would you like to remove?");
                    System.out.println("You have:");
                    int i = 1;
                    for (String item : itemCount.keySet()) {
                        int count = itemCount.get(item);
                        if (count > 0) {
                            System.out.println(i + ". " + item + " (" + count + ")");
                            i++;
                        }
                    }
                    System.out.println("0. Exit");
                    System.out.print("User: ");
                    int removeItemOption = scanner.nextInt();
                    if (removeItemOption == 0) {
                        break;
                    }

                    String itemToRemove = (String) itemCount.keySet().toArray()[removeItemOption - 1];
                    System.out.print("How many would you like to remove? ");
                    int removeQuantity = scanner.nextInt();
                    int currentQuantity = itemCount.get(itemToRemove);

                    if (removeQuantity > currentQuantity) {
                        System.out.println("You don't have that many " + itemToRemove + " to remove.");
                    } else {
                        itemCount.put(itemToRemove, currentQuantity - removeQuantity);
                        totalCost -= items.get(itemToRemove) * removeQuantity;
                        System.out.println("You have " + itemToRemove + " (" + (currentQuantity - removeQuantity) + ") left");
                    }
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