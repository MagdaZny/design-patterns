package EmployeeObserver;

import java.util.ArrayList;
import java.util.Random;

public class Employer implements Subject{

    private ArrayList observers;
    private boolean isEmployed;
    Random random = new Random();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    public void nofifyObserver(Observer observer) {
        observer.update(isEmployed);
    }

    public boolean isEmployed(){
        return isEmployed;
    }

    public void startWorkingOnApplication() {
        try {
            Thread.sleep(5000+random.nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isEmployed = random.nextBoolean();
    }

}
