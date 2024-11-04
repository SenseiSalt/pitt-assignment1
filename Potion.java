/*
 * Created on 2024-09-17
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Random;

public class Potion {
    // TODO: Implement Potion. Add useful variables, methods, getters, setters, and constructor(s)
    // Hint: A potion should have a potency, stirring level, and heat level, as well as an indicator of whether it has been ruined
    // Ingredients do not need to be stored within the Potion class!

    Random rand = new Random();
    int potency;
    int stirringLevel;
    int heatLevel;
    boolean isRuined;

    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;
    Ingredient ingredient4;

    public Potion() {
        this.potency = 0;
        this.stirringLevel = 0;
        this.heatLevel = 0;
        isRuined = false;



    }


    // TODO: Implement addIngredient(...) 
    // The ingredient's potency effect should be added to the potion's potency
    public void addIngredient1(Ingredient ingredient) {
        this.ingredient1 = ingredient;
        System.out.println(ingredient.getName() + " has been added to the potion");
        potency += ingredient1.getPotencyEffect();
        
    }

    public void addIngredient2(Ingredient ingredient) {
        this.ingredient2 = ingredient;
        System.out.println(ingredient.getName() + " has been added to the potion");
        potency += ingredient2.getPotencyEffect();
        
    }

    public void addIngredient3(Ingredient ingredient) {
        this.ingredient3 = ingredient;
        System.out.println(ingredient.getName() + " has been added to the potion");
        potency += ingredient3.getPotencyEffect();
        
    }

    public void addIngredient4(Ingredient ingredient) {
        this.ingredient4 = ingredient;
        System.out.println(ingredient.getName() + " has been added to the potion");
        potency += ingredient4.getPotencyEffect();
        
    }

    // TODO: Implement stirPotion(...) , add for loop
    // Stir the potion with a random effect: add a random value between 1 and 5
    public int stirPotion(int stirs) {
        for (int i = 1; i <= stirs; i++) {
            stirringLevel = stirringLevel + rand.nextInt(5) + 1;
            System.out.println("Potion stirred. Stirring level: " + stirringLevel);
            
        }
        return stirringLevel;
    }



    // TODO: Implement heatPotion(...) 
    // Heat the potion with a random effect: add a random value between 0 and 7
    public int heatPotion(int heats) {
        for (int i = 1; i <= heats; i++) {
            heatLevel = heatLevel + rand.nextInt(8);
            System.out.println("Potion heated. Heating level: " + heatLevel);

        }
        return heatLevel;


    }


    // TODO: Implement evaluatePotion(...) 
    /* Criteria: 
     * If the potion is not ruined, and its potency is greater than 15, the stirring level is greater than 5,
     * and the heat level is greater than 3, it is brewed perfectly
     * If the potion is not ruined and its potency is less than 15 but greater than 10,
     * the stirringLevel is greater than 3 and the heatLevel is greater than 3, the potion is a bit unstable but ok
     * Otherwise, the potion is ruined.
     */ 

     public void evaluatePotion() {
        CauldronEvent cauldronEvent = new CauldronEvent();
        if (cauldronEvent.triggerEvent()) {
            isRuined = true;
        }
       
        if (potency > 15 && stirringLevel > 5 && heatLevel > 3 && !isRuined) {
            System.out.println("Perfect");

        }

        else if (potency > 10 && stirringLevel > 3 && heatLevel > 3 && !isRuined) {
            System.out.println("bit unstable but ok");

        }

        else {
            System.out.println("potion is ruined");


        }

     }

}


