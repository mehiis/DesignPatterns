package Behavioral.Observer;

import java.util.ArrayList;

public abstract class Subject extends Thread{
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer obs)
    {
        observers.add(obs);
    }
    public void removeObserver(Observer obs){
        observers.remove(obs);
    }
    public void notifyObservers(){
        System.out.println("\nNotifying " + observers.size() + " observer(s).");

        for(Observer obs : observers){
            obs.update();
        }
    }

    public abstract String getStatus();
}
