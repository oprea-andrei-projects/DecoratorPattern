package com.company;

public class Transmisie extends Optionale {

    Masina masina;

    public Transmisie(String optional,Masina masina) {
        super(optional);
        this.masina = masina;
    }

    @Override
    public int cost() {

        int price=0;

        if(this.optional =="4X4"){

            price+= masina.cost() + 500;

        }else if(this.optional =="4X2"){

            price+=masina.cost() + 0;
        }

        return price;
    }
}
