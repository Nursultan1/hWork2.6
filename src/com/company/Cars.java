package com.company;

public class Cars implements Comparable< Cars> {

    private String model;
    private int year;
    private double volume;

    public Cars(String model, int year, double volume) {
        this.model = model;
        this.year = year;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public int compareTo(Cars c){
        if(this.year<c.getYear()){
            return 1;
        }else if (this.year>c.getYear()){
            return -1;
        }else{
            return 0;
        }
    }


}
