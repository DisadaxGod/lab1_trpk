package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DetectorData detectorData = new DetectorData();
        String mes = "нет";
        Scanner in = new Scanner(System.in);
        while (mes.equals("нет")){
            TimeUnit.SECONDS.sleep(3);
            System.out.print("У нас пожар?\n");
            mes = in.nextLine();
        }
        Firefighters firefighters =
                new Firefighters(detectorData);
        Owners owners =
                new Owners(detectorData);
        AFESystem afeSystem =
                new AFESystem(detectorData);
        detectorData.setMeasurements("пожар");
    }
}
