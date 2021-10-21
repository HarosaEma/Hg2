package com.company;

/*
   clasa Basketball care mosteneste(extinde) clasa abstracta Mannschaftssport
 */

public class Basketball extends Mannschaftssport{

    //constructor

    Basketball(String day){
        super(5, 90,"Basketball",day);
    };

    /*
   //metoda de calculare a timpului total
  */


    @Override
    public double kalkuliereZeit() {
        return time;
    }
}
