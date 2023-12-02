/***********************************************************
Title:Items class of grocery billing system
Authors:Taylor Coronel, Ricky Medina, Angel Rodiguez, Charles Garvin
Emails:tcorone1@bruinmail.slcc.edu
date:11/6/23
Version 1

***********************************************************/
import java.util.*;
public class GroceryItems{
   //fields
   private int quantity = 0;
   public String[] groceryName =  new String[] {"Bananas","Milk","Eggs", "Bread",
   "Butter", "Bacon","Yogurt","Cereal","Tuna","Cheese"};
   
   public double[] groceryPrice = new double[]{1.79,3.89,4.50, 2.99, 1.20,7.89, 3.60, 2.40, 0.99, 5.50};
   public ArrayList <String> userCart = new ArrayList<String>();
   public ArrayList <Double> userTotal = new ArrayList<Double>();
   public double userTotalPrice = 0.0;
   
   //method to print the list of items with their price
   public void printList(){
      for(int i = 0; i<10; i++){
         System.out.printf("%d. %s ($%.2f)%n",(i+1), groceryName[i], groceryPrice[i]); 
      }
   }
   
   public void printUserCart(){
      for (int i = 0;i < userCart.size();++i){
         System.out.println((i + 1) + ". " + userCart.get(i));
      }
   }
   
   //getters getName and getPrice
   public String getName(int addChoice){
      return groceryName[addChoice-1];
      }
      
   public double getPrice(int addChoice){
      return groceryPrice[addChoice-1];
   }
   
   // AddToCart. This will allow the user to select an item from the main list
   //and add it to their own list. They will choose the item and the quantity and it will create a string with 
   //that item, its price, and how many of that item they want and add it to an arraylist
   
   public void AddToCart(int addChoice, int q){
      quantity = q;
      System.out.printf("%s (%d)--------------- $%.2f%n", getName(addChoice), quantity, getPrice(addChoice)*quantity);
      userCart.add(getName(addChoice) + " (" + quantity + ")" + "--------------- $" + Math.round(100.0 *(getPrice(addChoice)*quantity))/100.0);
      userTotal.add(getPrice(addChoice)*quantity);
   }
   
   
   public int getRemoveItemIndex(int removeChoice){
      String itemName= "";
      int index = 0;
      if (removeChoice < 0){
         System.out.println("Invalid Option");
      }else{
         String itemToRemove;
         itemToRemove = userCart.get(removeChoice);
         int i = 0;
         while(itemToRemove.charAt(i)!= ' '){
            itemName = itemName + (itemToRemove.charAt(i));
            i++;
         }  
          boolean found = false;
          for (int j = 0; j < groceryName.length; j++){
             if (itemName.equals(groceryName[j])){
                index = j;
                found = true;
                break;
             }
          }
       }
    return index;
    }
 
 }
 
