package com.company;

/*
   clasa Fussball care mosteneste(extinde) clasa abstracta Mannschaftssport
 */

public class Fussball extends Mannschaftssport{
    //constructor


    Fussball(String day){
        super(24, 120,"Fussball",day);
    }

    /*
   //metoda de calculare a timpului total
  */


    @Override
    public double kalkuliereZeit() {
        return time;
    }
}
