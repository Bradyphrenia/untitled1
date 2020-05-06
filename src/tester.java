public class tester {
    public static void main(String[] args) {
// Test der iteratorpaket-Klasse...
        iteratorpaket zins = new iteratorpaket(10, 0.01, 1000);
        while (zins.runIteratorpaket()) {
            System.out.print(paket.toString(zins.returnZaehler()));
            System.out.print("  ");
            System.out.print(paket.toString(zins.returnGewinn()));
            System.out.print("  ");
            System.out.print(zins.returnGewinnsumme());
            System.out.print("  ");
            System.out.println(zins.returnInhalt());
        }
        System.out.println(zins.returnInhalt());
// Test der paket-Klasse...
        paket shop = new paket(10, -0.01);
        if (shop.runPaket()) {
            System.out.println(paket.toString(shop.inhalt));
        }
    }
}