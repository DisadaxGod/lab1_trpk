package com.company;

public class Owners implements Observer, DisplayElement {
    private String mes;
    private Subject detectorData;

    public Owners(Subject detectorData) {
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
        System.out.println("Владельцы помещения выехали");
    }
}
