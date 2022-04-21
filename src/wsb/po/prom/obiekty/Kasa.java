package wsb.po.prom.obiekty;

public class Kasa {

    //utargi dla kolejnych wag samochodów (kolejność jak w enumie)
    private double [] utargi = new double[3];

    /*
    Liczy cenę:
    20 za pasażera
    50, 100, 200 odpowiednio do kategorii wagowej
     */
    private double obliczCenę (Samochod samochod) {

        double wynik = 0;
        wynik += 20 * samochod.getLiczbaPasazerow();

        switch (samochod.getWaga()) {
            /*
            case Do1T:
                wynik+=50;
                break;
            case ...
                */
            case Do1T -> wynik+=50;
            case Od1Tdo3T5 -> wynik+=100;
            case Pow3T5 -> wynik+=200;
        }
        return wynik;

    }

    public void wplac (Samochod samochod) {

        int index = 0;
        switch (samochod.getWaga()) {
            case Do1T -> index = 0;
            case Od1Tdo3T5 -> index = 1;
            case Pow3T5 -> index = 2;
        }
        utargi[index] += obliczCenę(samochod);

    }

    @Override
    public String toString() {

        String raport = "Raport:\n";

        int i = 0;
        double calosc = 0;
        for (Waga w : Waga.values()) {
            calosc += utargi[i];
            raport += w.toString() + " = " + utargi[i++] + "\n";

        }
        raport += "Całość = " + calosc + "\n";
        return raport;
    }
}
