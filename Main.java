package GroceryList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean exit = false;

        while(!exit){
            System.out.println(
                    "Options to choose:\n" +
                            "1. Print the grocery list.\n" +
                            "2. Add an item to the grocery list.\n" +
                            "3. Remove an item from the grocery list.\n" +
                            "4. Search Item.\n" +
                            "5. Exit.");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                groceryList.printGroceryList();
            }
            else if(choice == 2){
                System.out.print("Enter an item you want to add: ");
                String newItem = scanner.nextLine();
                if(newItem.equalsIgnoreCase("")){
                    System.out.println("Incorrect name!");
                    System.out.println("=====================");
                } else {
                groceryList.addItem(newItem);
                    System.out.println(newItem + " has been added to the grocery list");
                    System.out.println("=====================");}

            }
            else if(choice == 3){
                System.out.println("Enter the position of an item to remove:");
                int itemPosition = scanner.nextInt();
                if(groceryList.getSize() <= 0){
                    System.out.println("There's no items to remove.");
                    System.out.println("=====================");
                }
                else{
                groceryList.removeItem(itemPosition);
                System.out.println("has been removed.");
                System.out.println("=====================");}
            }
            else if(choice == 4){
                System.out.println("What item are you looking for?");
                String itemName = scanner.nextLine();
                if(groceryList.searchForItem(itemName) != null){
                    System.out.println("=====================");
                }
                else {
                    System.out.println(itemName + " not found");
                    System.out.println("=====================");
                }

            }
            else if(choice == 5){
                exit = true;
            }
        }


    }
}
