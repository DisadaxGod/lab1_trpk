package com.company;

import java.util.ArrayList;

public class DetectorData implements Subject {
    private ArrayList<Observer> observers;
    //private ArrayList observers;
    private String mes;

    public DetectorData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(mes);
        }
    }
    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurements(String mes) {
        this.mes = mes;
        measurementsChanged();
    }
}
