 System.out.println("Which items would you like to remove?");
                    System.out.println("You have:");
                    int i = 1;
               for (String item : list.userCart.keySet()) {
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
