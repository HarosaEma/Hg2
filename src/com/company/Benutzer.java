package com.company;

import java.util.Iterator;
import java.util.List;



public class Benutzer implements Iterable<Sport>
{
    //campurile clasei
    private Sport [] sports;
    private String vorName;
    private String nachName;
    /*
     constructorul  clasei Benutzer
     */
    public Benutzer(List<Sport> sports, String vorName, String nachName){
        this.sports= sports.toArray(new Sport[0]);
        this.vorName=vorName;
        this.nachName=nachName;
    }

    @Override
    public Iterator<Sport> iterator() {
        return new BenutzerIterator();
    }
    /*
     clasa iterator cu metodele hasNext si next
     */

    class BenutzerIterator implements  Iterator<Sport>{

        private int currentIndex=0;
        @Override
        public boolean hasNext() {
            if(currentIndex>=sports.length)
                return false;
            return true;
        }

        @Override
        public Sport next() {
            if(hasNext()){
                return sports[currentIndex++];
            }
            return null;

        }
    }
    /*
     metoda care calculeaza timmpul total
     */

    public double kalkuliereZeit(){
        int sumZeit=0;
        for(Sport sport : sports){
            sumZeit= (int) (sumZeit+sport.kalkuliereZeit());
        }
        return sumZeit;
    }
/*
  metoda care calculeaza timpul unui singur sport
 */
    public double kalkuliereZeit(String sportName){
        int sumZeitSport=0;
        for(Sport sport : sports){
            if(sport.getName()==sportName)
                sumZeitSport += sport.getTime();
        }

        return sumZeitSport;

    }
    /*
      metoda care calculeaza timpul mediu a tuturor sporturilor
     */

    public double kalkuliereDurschnittszeit(){

        int sumZeitSport=0;
        for(Sport sport : sports){
                sumZeitSport += sport.getTime();
        }

        return sumZeitSport/sports.length;
    }
 /*
  gettere
  */
    public Sport[] getSports() {
        return sports;
    }

    public void setSports(Sport[] sports) {
        this.sports = sports;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }
}
