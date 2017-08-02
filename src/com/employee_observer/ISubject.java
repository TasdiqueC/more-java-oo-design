package com.employee_observer;

/**
 * Created by TasdiqueC on 7/30/17.
 */
public interface ISubject {
    public void registerObserver(Employee employee);
    public void notifyObserver(IObserver iObserver);
}
