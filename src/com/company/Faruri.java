package com.company;

public class Faruri extends Optionale{

    Masina masina;

    public enum TipFar {LASER, HALOGEN, XENON}
    public TipFar tipFar;

    TipFar[] faruri = tipFar.values();

    public Faruri(TipFar tipFar,Masina masina) {
        super(tipFar.name());
        this.masina = masina;
    }


    @Override
    public int cost() {

        int price = masina.cost();

        if(optional==TipFar.XENON.name()){

            price+=145;
        }else if(optional==TipFar.LASER.name()){

            price+=160;
        }else if(optional==TipFar.HALOGEN.name()){


            price+=100;
        }




        return price;
    }
}
