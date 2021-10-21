package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mannschaftssport m1 = new Basketball("Monday");
        Basketball b2 = new Basketball("Friday");
        Leichtathletik l3 = new Hinderislauf("Tuesday");
        Leichtathletik l4 = new Hochsprung("Tuesday");
        Hochsprung h5 = new Hochsprung("Wednesday");

        List<Sport> sportList = new ArrayList<>();
        sportList.add(m1);
        sportList.add(b2);
        sportList.add(l3);
        sportList.add(l4);
        sportList.add(h5);

        Benutzer b1 = new Benutzer(sportList, "Popa", "Petru");
        System.out.println(b1.kalkuliereZeit()); //calculeaza timpul pentru toate sporturile
        System.out.println(b1.kalkuliereZeit("Basketball")); //calculeaza timpul doar pentru basket
        System.out.println(b1.kalkuliereDurschnittszeit()); //calculeaza media



    }
}
