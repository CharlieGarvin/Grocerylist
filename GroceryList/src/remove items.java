 System.out.print("Choose an item to remove (0 to exit): ");
                int itemChoice = scanner.nextInt();

                if (itemChoice == 0) {
                    continue;
                }

                if (itemChoice > 0 && itemChoice <= groceryBill.groceryList.size()) {
                    GroceryItems selectedItem = groceryBill.groceryList.get(itemChoice - 1);

                    System.out.print("How many would you like to remove? ");
                    int quantityToRemove = scanner.nextInt();

                    selectedItem.removeQuantity(quantityToRemove);
                    groceryBill.removeItem(selectedItem);
                } else {
                    System.out.println("Invalid choice. Please choose a valid option.");
                }
