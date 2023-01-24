package com.charan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player charan = new Player("Charan",10,15);
        System.out.println(charan.toString());
        saveObject(charan);

        charan.setHitPoints(8);
        System.out.println(charan);
        charan.setWeapon("gun");
        saveObject(charan);
        loadObject(charan);
        System.out.println(charan);
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("""
                Chosen
                1 to enter a string
                0 to quit""");

        while (!quit){
            System.out.println("Chose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:
                    quit= true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = sc.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public  static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
