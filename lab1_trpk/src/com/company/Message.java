package com.company;

public class Message implements Observer, DisplayElement  {
    private String mes;
    private Subject detectorData;

    public Message(Subject detectorData) {
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
        //System.out.println(mes);
        System.out.println("Пожарный расчет выехал на борьбу с огнем");
        System.out.println("Владельцы помещения выехали");
        System.out.println("Система автоматического пожаротушения оповестила жильцов и начала тушить пожар");
    }
}
