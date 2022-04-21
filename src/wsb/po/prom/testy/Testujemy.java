package wsb.po.prom.testy;

import wsb.po.prom.obiekty.*;

public class Testujemy {

    public static void main(String[] args) {

        System.out.println("Testy start");

        Samochod samochod1 = new Samochod("Audi", 5, Waga.Od1Tdo3T5);
        Samochod samochod2 = new Samochod("BMW",3,Waga.Do1T);

        System.out.println(samochod1);
        System.out.println(samochod2.getNazwa());
        System.out.println(samochod2.getLiczbaPasazerow());
        System.out.println(samochod2.getWaga());

        Samochod samochod3 = new Samochod("Citroen", 7, Waga.Pow3T5);

        KolejkaAut kolejkaAut = new KolejkaAut();

        System.out.println(kolejkaAut);

        kolejkaAut.wjazd(samochod2);
        kolejkaAut.wjazd(samochod1);
        kolejkaAut.wjazd(samochod3);

        System.out.println(kolejkaAut);

        System.out.println(kolejkaAut.wyjazd());

        System.out.println(kolejkaAut);

        Kasa kasa = new Kasa();
/*
        System.out.println(kasa.obliczCenę(samochod1));
        System.out.println(kasa.obliczCenę(samochod2));
        System.out.println(kasa.obliczCenę(samochod3));
*/
        kasa.wplac(samochod1);
        kasa.wplac(samochod2);
        kasa.wplac(samochod3);

        System.out.println(kasa);

        Bramka bramka1 = new Bramka("Bramka 1");

        bramka1.wjzad(samochod1);
        bramka1.wjzad(samochod2);
        bramka1.wjzad(samochod3);

        System.out.println(bramka1);

        bramka1.pobierzOplaty();
        System.out.println(bramka1);

        System.out.println(bramka1.dlugoscKolejki());

        bramka1.wyjazd();bramka1.wyjazd();

        System.out.println(bramka1.dlugoscKolejki());

        Oplaty oplaty = new Oplaty();

        oplaty.getBramka(0).wjzad(samochod1);
        oplaty.getBramka(0).wjzad(samochod2);

        oplaty.getBramka(1).wjzad(samochod1);
        oplaty.getBramka(1).wjzad(samochod2);
        oplaty.getBramka(1).wjzad(samochod3);

        oplaty.getBramka(2).wjzad(samochod2);

        oplaty.pobierzOplaty();

        for (int i = 0; i < 3; i++) {
            System.out.println(oplaty.getBramka(i));
        }

        System.out.println(oplaty.getBramkaDoWyjazdu());

    }

}
