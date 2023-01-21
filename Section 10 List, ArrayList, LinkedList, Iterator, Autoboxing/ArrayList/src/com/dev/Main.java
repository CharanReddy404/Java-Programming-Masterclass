package com.dev;


import java.util.ArrayList;
import java.util.List;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s  ",count,name.toUpperCase(),true);
    }
}
public class Main {

    public static void main(String[] args) {
//        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
//        groceryItems.add(new GroceryItem("Butter"));
//        groceryItems.add(new GroceryItem("MILK"));
//        groceryItems.add(new GroceryItem("orange","Product",5) );
//        groceryItems.set(0,new GroceryItem("apple","Product",6) );
//        System.out.println(groceryItems );

        String[] items = {"apple","banana","mango", "milk"};
        List<String> list = List.of(items);
        System.out.println(list.getClass().getName());
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("orange");
        System.out.println(groceries);

        ArrayList<String> newList = new ArrayList<>(List.of("apple","mango","orange"));
        System.out.println(newList);
        groceries.addAll(list);
        System.out.println(groceries);
    }
}
