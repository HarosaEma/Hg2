package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class BenutzerTest {

    @Test
    /*
     *metoda care calculeaza timpul
     */
    void kalkuliereZeit() {

        Mannschaftssport fussball1 = new Fussball("monday");
        Basketball basketball1 = new Basketball("monday");
        Hinderislauf hindernislauf = new Hinderislauf("friday");
        Hochsprung hochsprung = new Hochsprung("saturnday");
        ArrayList<Sport> sports = new ArrayList<>();
        sports.add(fussball1);
        sports.add(basketball1);
        sports.add(hindernislauf);
        sports.add(hochsprung);

        Benutzer b = new Benutzer(sports, "Ana","Pop");
        //assertion syntax
        assertEquals(b.kalkuliereZeit(),
                240.0); //basketball 90 + fussball 120 +hinderislauf 10 + hochsprung 20
    }

    @Test
    void kalkuliereDurschnittszeit() {

        /*
         *
         * metoda testeaza timpul mediu
         */
        Fussball fussball1 = new Fussball("monday");
        Basketball basketball1 = new Basketball("monday");
        Hinderislauf hindernislauf1 = new Hinderislauf("saturnday");
        Hochsprung hochsprung1 = new Hochsprung("saturnday");
        ArrayList<Sport> sports = new ArrayList<>();
        sports.add(fussball1);
        sports.add(basketball1);
        sports.add(hindernislauf1);
        sports.add(hochsprung1);
        Benutzer benutzer = new Benutzer(sports, "Ion", "Pop");
        //assertion syntax
        assertEquals((double) 240.0/4.0, benutzer.kalkuliereDurschnittszeit());
    }
}