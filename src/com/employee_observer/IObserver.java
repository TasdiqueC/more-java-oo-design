package com.employee_observer;

/**
 * Created by TasdiqueC on 7/30/17.
 */
public class IObserver {
    String name;

    public void observe() {
        System.out.println(name + " department notified...");
    }
}
