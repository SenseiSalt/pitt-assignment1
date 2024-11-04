/*
 * Created on 2024-09-17
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Scanner;

public class AdvancedPotionsClass {
    
    private static Scanner myScanner = new Scanner(System.in);

    // TODO: Add new ingredients
    private static Ingredient ingredient1 = new Ingredient("Bicorn Horn", 5);
    private static Ingredient ingredient2 = new Ingredient("Dragon Blood", 7);
    private static Ingredient ingredient3 = new Ingredient("Armadillo Bile", 10);
    private static Ingredient ingredient4 = new Ingredient("Wormwood Essence", 4);
    private static Ingredient ingredient5 = new Ingredient("Moonstone", 3);

    public static void main(String[] args) {

        // TODO: Create a new potion
        Potion potion = new Potion();
        // TODO: Prompt the user about ingredient options
        selectIngredients(potion);
        

        // TODO: Prompt the user to stir and heat the potion
        stirPotion(potion);
        heatPotion(potion);
        // TODO: Evaluate the potion and print the result
        potion.evaluatePotion();

        // TODO: uncomment
        myScanner.close();
    }

    // TODO: Implement selectIngredients(...)
    // Allow the user to choose ingredients
    // Prompt the user again for invalid choices
    public static void selectIngredients(Potion potion) {
        System.out.println("Choose 4 ingredients to add to your potion:");
        System.out.println("(1) Bicorn Horn, (2) Dragon Blood, (3) Armadillo Bile, (4) Wormwood Essence, (5) Moonstone");
        
        for (int i = 1; i <= 4; i++) {
            while (true) {
                try {
                    System.out.print("Select ingredient No." + i + ": ");
                    int choice = Integer.parseInt(myScanner.nextLine());
    
                    switch (choice) {
                        case 1:
                            potion.addIngredient1(ingredient1);
                            break;
                        case 2:
                            potion.addIngredient2(ingredient2);
                            break;
                        case 3:
                            potion.addIngredient3(ingredient3);
                            break;
                        case 4:
                            potion.addIngredient4(ingredient4);
                            break;
                        case 5:
                            potion.addIngredient1(ingredient5); 
                            break;
                        default:
                            System.out.println("Invalid input. Please enter a number between 1 and 5.");
                            continue; 
                    }
                    break; 
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }
    

    }

    // TODO: Implement stirPotion(...)
    // to prompt the user on how often they would like to stir the potion
    // Then stir the potion as many times
    public static void stirPotion(Potion potion) {
        System.out.println("How many times to stir? (1-3)");
        int stirs = myScanner.nextInt();
        while (stirs < 1 || stirs > 3) {
            System.out.println("Invalid number try again");
            stirs = myScanner.nextInt();

        }


        potion.stirPotion(stirs);

    }

    // TODO: Implememt heatPotion(...)
    // That prompts the user to input the heat level of the potion
    public static void heatPotion(Potion potion) {
        System.out.println("How many times to heat? (1-3)");
        int heats = myScanner.nextInt();
        while (heats < 1 || heats > 3) {
            System.out.println("Invalid number try again");
            heats = myScanner.nextInt();

        }


        potion.heatPotion(heats);


    }
}
