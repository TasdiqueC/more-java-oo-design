package com.coffee_shop;

/**
 * Created by TasdiqueC on 7/31/17.
 */
// THIS PROGRAM IS NONSENSE AND I KNOW IT
public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeAttendant coffeeAttendant = new CoffeeAttendant();
        coffeeAttendant.takeOrder(new Customer("Tasdique", "macchiato"));
        coffeeAttendant.prepareDrink("latte");
        coffeeAttendant.prepareDrink("coffee");
        coffeeAttendant.prepareDrink("white chocolate mocha");
        coffeeAttendant.prepareDrink("caramel latte");
        coffeeAttendant.prepareDrink("mocha latte");
        coffeeAttendant.prepareDrink("macchiato");
    }
}
