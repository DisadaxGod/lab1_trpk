package com.company;

public class AFESystem implements Observer, DisplayElement {
    private String mes;
    private Subject detectorData;

    public AFESystem(Subject detectorData) {
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
        System.out.println("Система автоматического пожаротушения оповестила жильцов и начала тушить пожар");
    }
}
