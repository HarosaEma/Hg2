package com.company;

/*
   clasa Hochsprung care mosteneste(extinde) clasa abstracta Leichtathletik
 */

public class Hochsprung extends Leichtathletik{

    //constrctor

    Hochsprung(String day){
        super(20,"Hochsprung",day);
    };

    /*
   //metoda de calculare a timpului total
  */


    @Override
    public double kalkuliereZeit() {
        return time;
    }
}
