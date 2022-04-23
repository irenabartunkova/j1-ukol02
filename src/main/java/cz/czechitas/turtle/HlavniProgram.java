package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setLocation(200, 400);
        nakresliRovnostrannyTrojuhelnik(zofka, 115.0);

        zofka.setLocation(400, 400);
        nakresliCtverec(zofka, 130.0);

        zofka.setLocation(600, 400);
        nakresliObdelnik(zofka, 120.0, 60.0);

        zofka.setLocation(800, 400);
        zofka.turnRight(90.0);
        nakresliKolecko(zofka, 15.0);


    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(120.0);
        }


    }

    private void nakresliCtverec(Turtle zofka, double velikostStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(90.0);
        }
    }

    private void nakresliObdelnik(Turtle zofka, double velikostStranyA, double velikostStranyB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnRight(90.0);
            zofka.move(velikostStranyB);
            zofka.turnRight(90.0);

        }
    }

    private void nakresliKolecko(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 24; i++) {

            zofka.move(delkaStrany);
            zofka.turnRight(15.0);
        }
    }
}




