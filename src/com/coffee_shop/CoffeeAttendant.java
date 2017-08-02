package com.coffee_shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TasdiqueC on 7/31/17.
 */
public class CoffeeAttendant {
    private List<WaitingCustomer> waitingCustomers = new ArrayList<WaitingCustomer>();
    private String completedDrink;

    public CoffeeAttendant() {
        makeCustomers();
    }

    public void makeCustomers() {
        waitingCustomers.add(new Customer("John", "latte"));
        waitingCustomers.add(new Customer("Steve", "coffee"));
        waitingCustomers.add(new Customer("Rudolph", "white chocolate mocha"));
        waitingCustomers.add(new Customer("Kobe", "caramel latte"));
        waitingCustomers.add(new Customer("Dude", "mocha latte"));
    }
    public void takeOrder(WaitingCustomer customer) {
        waitingCustomers.add(customer);
    }
    public void prepareDrink(String drinkToPrepare) {
        completedDrink = drinkToPrepare;
        callOutCompletedOrder();
    }
    public void callOutCompletedOrder() {
        waitingCustomers.get(0).orderReady(completedDrink);
        waitingCustomers.remove(0);
    }

}
