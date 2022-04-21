package wsb.po.prom.obiekty;

public class Oplaty {

    private Bramka [] bramki = new Bramka[3];

    public Oplaty() {
        bramki[0] = new Bramka("Bramka 1sza");
        bramki[1] = new Bramka("Bramka 2ga");
        bramki[2] = new Bramka("Bramka 3cia");

    }

    public void pobierzOplaty() {
        for (Bramka b : bramki) {
            b.pobierzOplaty();
        }
    }

    public Bramka getBramka(int i) {
        //nie sprawdzam indeksu !!!
        return bramki[i];
    }

    public Bramka getBramkaDoWyjazdu() {

        int maxDlugosc = 0;
        int maxIndex = 0;
        for (int i = 0; i < bramki.length; i++) {
            if (bramki[i].dlugoscKolejki() > maxDlugosc) {
                maxDlugosc = bramki[i].dlugoscKolejki();
                maxIndex = i;
            }
        }
        return bramki[maxIndex];
    }

    @Override
    public String toString() {
        String raport = "";

        for (Bramka b : bramki) {
            raport += b.toString();
        }

        return raport;
    }
}
