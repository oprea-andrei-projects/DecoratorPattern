package com.company;

public class Main {

    public static void main(String[] args) {

       Masina m1 = new BMW();
       m1.model = "s2";
       m1.oEchipare = Masina.Echipare.MIDDLE;

       m1 = new Transmisie("4X4",m1);
       m1 = new Faruri(Faruri.TipFar.HALOGEN,m1);

       System.out.println(m1.cost());


    }
}
