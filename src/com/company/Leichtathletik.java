package com.company;

import java.util.Iterator;

/*
   clasa abstracta care mosteneste(implementeaza) interfata Sport
 */

public class Leichtathletik implements Sport{

    /*
        campurile si constructorul clasei
     */

    public int time;
    public String name;
    public String day;

    public Leichtathletik(int time,String name,String day){
        time=time;
        name=name;
        day=day;
    };

    /*
        settere si gettere
     */
    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(String day) {
        this.day = day;
    }

    /*
   //metoda de calculare a timpului total
  */


    @Override
    public double kalkuliereZeit() {
        return 0;
    }


}
