package com.coffee_shop;

/**
 * Created by TasdiqueC on 7/31/17.
 */
public class Customer implements  WaitingCustomer {
    String name;
    String drinkOrdered;

    public Customer (String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    public void orderReady(String preparedDrink) { // callMe(), aka observe()
        System.out.println(name + "'s " + preparedDrink + " has been made ready.");
    }
}
