/*
 * Created on 2024-09-17
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

public class Ingredient {
    // TODO: Implement Ingredient. Add useful variables, methods, getters, setters, and constructor(s)
    // Hint: An ingredient has a name and a potency effect that should be max. 10
    private String name;
    private int potencyEffect;

    public String getName() {
        return name;

    }

    public int getPotencyEffect() {
        return potencyEffect;


    }

    public Ingredient(String name, int potencyEffect) {
        this.name = name;
        this.potencyEffect = potencyEffect;


    }


}
