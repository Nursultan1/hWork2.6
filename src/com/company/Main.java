package com.company;
import java.util.ArrayList;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cars> cars = new ArrayList<>();
        cars.add(new Cars("Acura", 2018, 4.0));
        cars.add(new Cars("Bugatti", 2010, 5.8));
        cars.add(new Cars("Buick", 2011, 4.4));
        cars.add(new Cars("Cadilac", 2006, 5.5));
        cars.add(new Cars("Audi", 1991, 2.3));
        cars.add(new Cars("Cherry", 2008, 3.0));
        cars.add(new Cars("Porshe", 2002, 5.3));
        cars.add(new Cars("Bentley", 2013, 4.5));
        cars.add(new Cars("BMW", 1993, 2.5));
        cars.add(new Cars("Ford", 2019, 5.3));
        System.out.println("До сортировки");
        for (Cars car : cars) {
            System.out.println(" Модель машины- (" + car.getModel() + ")" +
                    " Год выпуска машины -(" + car.getYear() + ")" +
                    " Обьем двигателя :" + car.getVolume() + ")");
        }

        Collections.sort(cars);
        System.out.println("После сортировки");
        for (Cars car : cars) {
            System.out.println(" Модель машины - " + car.getModel() + ")" +
                    " Год выпуска машины -" + car.getYear() + ")" +
                    " Обьем двигателя :" + car.getVolume() + ")");
        }
        Collections.reverse(cars);
        System.out.println("В обратном порядке");
        for (Cars car : cars) {
            System.out.println(" Модель машины -( " + car.getModel() + ")" +
                    " Год выпуска машины -(" + car.getYear() + ")" +
                    " Обьем двигателя :(" + car.getVolume() + ")");
        }
    }
}
