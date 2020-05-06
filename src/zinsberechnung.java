// Progrmmbeginn
public class zinsberechnung { // Deklaration der Klasse
    public static void main(String[] args) {
        double zinsen, zinssatz, anfangskapital, kapital, gesamtzinsen; // Variablendeklaration -> Datentyp Double
        int jahr; // Datentyp Integer
        jahr = 1; // Initialisierung der Variablen ...
        zinsen = 0;
        gesamtzinsen = 0;
        // Beginn Eingabeteil
        anfangskapital = IO.getDouble("Eingabe des Anfangskapitals: "); // Zuweisung der Eingabewerte
        zinssatz = IO.getDouble("Eingabe des Zinssatzes in Prozent: "); // zu den Variablen
        zinssatz = 0.01 * zinssatz; // Berechnung des Zinssatzes als Dezimalzahl Integer -> Double
        kapital = anfangskapital; // Initialisierung der Variablen
        // Schleife mit 10 Durchläufen
        while (jahr <= 10) {
            zinsen = kapital * zinssatz; // Berechnung und Wertzuweisung
            gesamtzinsen = gesamtzinsen + zinsen; // ...
            kapital = kapital + zinsen; // ...
            // Beginn Ausgabe in der Schleife
            IO.show("Nach " + jahr + " Jahr(en) beträgt ihr Kapital " + kapital + " Euro. Die Zinsen haben eine Höhe von " + zinsen + " Euro");
            jahr++; // Zähler für Schleife
        }
        // Ausgabe am Programmende
        IO.show("Die Zinsen sind insgesamt " + gesamtzinsen + " €");
    }
}
// Programmende