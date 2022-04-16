package com.company;

public class BMW extends Masina{



    @Override
    public int cost() {

        int price = 0;

        if (this.oEchipare == Echipare.BASIC) {

            price+= 1000;

        } else if (this.oEchipare == Echipare.MIDDLE) {

            price+= 2000;

        } else if (this.oEchipare == Echipare.TOP) {

            price+= 3000;
        }
        return price;
    }
}
