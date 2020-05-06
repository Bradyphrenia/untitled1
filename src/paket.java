public class paket {
    double inhalt;
    double prozent;
    double gewinn;
    double gewinnsumme;

    public paket(double inhalt, double prozent) {
        this.inhalt = inhalt;
        this.prozent = prozent;
        this.gewinnsumme = 0;
        this.gewinn = 0;
    }

    public static String toString(double zahl) {
        return Double.toString(zahl);
    }

    public static String toString(int zahl) {
        return Integer.toString(zahl);
    }

    public boolean runPaket() {
        if (this.inhalt > 0) {
            this.gewinn = this.inhalt * this.prozent;
            this.gewinnsumme += this.gewinn;
            this.inhalt += this.gewinn;
            return true;
        } else return false;
    }

    public double returnInhalt() {
        return this.inhalt;
    }

    public double returnGewinnsumme() {
        return this.gewinnsumme;
    }

    public double returnGewinn() {
        return this.gewinn;
    }
}

class iteratorpaket extends paket {
    int iterator;
    int zaehler;

    public iteratorpaket(double inhalt, double prozent, int iterator) {
        super(inhalt, prozent);
        this.iterator = iterator - 1;
        this.zaehler = 0;
    }

    public boolean runIteratorpaket() {
        if (this.zaehler <= this.iterator) {
            runPaket();
            this.zaehler++;
            return true;
        } else return false;
    }

    public int returnZaehler() {
        return this.zaehler;
    }
}