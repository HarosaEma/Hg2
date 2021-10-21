package com.company;

import java.util.Iterator;

/*
   clasa abstracta care mosteneste(implementeaza) interfata Sport
 */
public class Mannschaftssport implements Sport{

  //campurile clasei
    public int number_players;
    public int time;
    public String name;
    public String day;

   //comstructorul clasei
    public Mannschaftssport(int number_players,int time,String name,String day){
        time=time;
        name=name;
        day=day;
        number_players=number_players;
    };

    //gettere
    public int getNumber_players() {
        return number_players;
    }

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    //settere

    public void setNumber_players(int number_players) {
        this.number_players = number_players;
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


