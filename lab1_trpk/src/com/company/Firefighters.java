package com.company;

public class Firefighters implements Observer, DisplayElement  {
    private String mes;
    private Subject detectorData;

    public Firefighters(Subject detectorData) {
        this.detectorData = detectorData;
        detectorData.registerObserver(this);
    }

    @Override
    public void update(String mes) {
        this.mes = mes;
        display();
    }
    @Override
    public void display() {
        System.out.println("Пожарный расчет выехал на борьбу с огнем");
    }
}
