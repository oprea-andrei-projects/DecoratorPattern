package com.company;

public abstract class Masina {

    public enum Echipare { BASIC,MIDDLE,TOP};
    String model;
    Echipare oEchipare;




    public String getModel() {
        return model;
    }

    public Echipare getoEchipare() {
        return oEchipare;
    }

    public abstract int cost();




}
