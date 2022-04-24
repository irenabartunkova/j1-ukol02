package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliZmrzlinu(zofka);

        zofka.setLocation(600, 600);

        nakresliSnehulaka(zofka);

        zofka.setLocation(1500, 400);
        zofka.turnLeft(90.0);

        nakresliMasinku(zofka);

        zofka.setLocation(1200, 600);


    }

    private void nakresliZmrzlinu(Turtle zofka) {
        zofka.setLocation(200, 300);
        zofka.turnRight(90.0);
        nakresliRovnostrannyTrojuhelnik(zofka, 150.0);
        zofka.turnLeft(90.0);
        zofka.setLocation(200, 290);
        nakresliKolecko(zofka, 20.0);
    }


    private void nakresliRovnostrannyTrojuhelnik(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(120.0);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik1(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(120.0);
        }
    }


    private void nakresliObdelnik(Turtle zofka, double velikostStranyA, double velikostStranyB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnLeft(90.0);
            zofka.move(velikostStranyB);
            zofka.turnLeft(90.0);

        }
    }

    private void nakresliKolecko(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(15.0);

        }
    }

    private void nakresliKoleckoMasinka(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(15.0);

        }
    }

    private void nakresliKoleckoMasinka1(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(15.0);
        }
    }

    private void nakresliKoleckoSnehulak1(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(15.0);
        }
    }

    private void nakresliKoleckoSnehulak2(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(15.0);
        }
    }

    private void nakresliKoleckoSnehulak3(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(15.0);
        }
    }

    private void nakresliKoleckoSnehulakRuce(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(15.0);
        }
    }

    private void nakresliSnehulaka(Turtle zofka) {
        nakresliKoleckoSnehulak1(zofka, 30.0);

        zofka.penUp();
        zofka.setLocation(700, 465);

        zofka.turnRight(90.0);
        zofka.penDown();
        nakresliKoleckoSnehulak2(zofka, 20.0);

        zofka.penUp();
        zofka.setLocation(785, 390);
        zofka.turnRight(90.0);
        zofka.penDown();
        nakresliKoleckoSnehulakRuce(zofka, 10);

        zofka.penUp();
        zofka.setLocation(634, 399);
        zofka.turnRight(180.0);
        zofka.penDown();
        nakresliKoleckoSnehulakRuce(zofka, 10.0);

        zofka.penUp();
        zofka.setLocation(705, 313.084);
        zofka.turnRight(90.0);
        zofka.penDown();
        nakresliKoleckoSnehulak3(zofka, 15.0);

    }

    private void nakresliMasinku(Turtle zofka) {
        nakresliObdelnik(zofka, 250, 150);

        nakresliKoleckoMasinka(zofka, 20.0);

        zofka.penUp();
        zofka.turnLeft(90.0);
        zofka.move(150.0);
        zofka.turnRight(90.0);
        zofka.move(150.0);
        zofka.turnLeft(90.0);
        zofka.penDown();

        nakresliObdelnik(zofka, 250, 150);

        zofka.penUp();
        zofka.turnLeft(90.0);
        zofka.move(150.0);
        zofka.turnRight(90.0);
        zofka.move(62.5);
        zofka.penDown();

        nakresliKoleckoMasinka1(zofka, 8.0);

        zofka.penUp();
        zofka.move(125.0);
        zofka.penDown();

        nakresliKoleckoMasinka1(zofka, 8.0);

        zofka.penUp();
        zofka.move(62.5);
        zofka.turnRight(90.0);
        zofka.move(120.0);
        zofka.turnLeft(120.0);
        zofka.penDown();

        nakresliRovnostrannyTrojuhelnik1(zofka, 150.0);

    }

}






