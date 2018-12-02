package GroceryList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void printGroceryList (){
        System.out.println("You have " + groceryList.size() + " item(s) in the list:");
        for (int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+". " + groceryList.get(i));

        }
        System.out.println("=====================");
    }

    public void addItem (String item){
        groceryList.add(item);
    }

    public void removeItem(int position){
        System.out.print(groceryList.get(position-1) + " ");
        groceryList.remove(position-1);
    }

    public void replaceItem(int position, String itemName){
        groceryList.set(position,itemName);
    }

    public int getSize (){
        return groceryList.size();
    }

    public String searchForItem (String itemName){
        int position = groceryList.indexOf(itemName);
        if(position >=0){
            System.out.println("Item found on position: "+ (position+1));
            return groceryList.get(position);
        }
        else return null;

    }
}
