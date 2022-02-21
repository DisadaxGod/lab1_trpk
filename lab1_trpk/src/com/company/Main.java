package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DetectorData deatherData = new DetectorData();
        String mes = "нет";
        Scanner in = new Scanner(System.in);
        while (mes.equals("нет")){
            TimeUnit.SECONDS.sleep(3);
            System.out.print("У нас пожар?");
            mes = in.nextLine();
        }
        Message message =
                new Message(deatherData);
        deatherData.setMeasurements("пожар");
    }
}
