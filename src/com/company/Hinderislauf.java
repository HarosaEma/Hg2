package com.company;

/*
   clasa Hinderislauf care mosteneste(extinde) clasa abstracta Leichtathletik
 */
public class Hinderislauf extends Leichtathletik{

    //constructor

     Hinderislauf(String day){
        super(10,"Hinderrislauf",day);
    };

     /*
   //metoda de calculare a timpului total
  */

    @Override
    public double kalkuliereZeit() {
        return time;
    }
}
