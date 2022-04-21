package wsb.po.prom.testy;

import wsb.po.prom.obiekty.Oplaty;
import wsb.po.prom.obiekty.Samochod;
import wsb.po.prom.obiekty.Waga;

import java.util.ArrayList;
import java.util.Random;

public class Symulacja {

    public static void main(String[] args) {

        System.out.println("Symulacja");

        ArrayList<Samochod> samochody = new ArrayList<Samochod>();

        samochody.add(new Samochod("Asz",3, Waga.Pow3T5));
        samochody.add(new Samochod("Bsz",4, Waga.Do1T));
        samochody.add(new Samochod("Csz",5, Waga.Pow3T5));
        samochody.add(new Samochod("Dsz",6, Waga.Od1Tdo3T5));
        samochody.add(new Samochod("Esz",2, Waga.Do1T));
        samochody.add(new Samochod("Fsz",3, Waga.Pow3T5));
        samochody.add(new Samochod("Gsz",5, Waga.Pow3T5));
        samochody.add(new Samochod("Hsz",4, Waga.Do1T));
        samochody.add(new Samochod("Isz",3, Waga.Od1Tdo3T5));
        samochody.add(new Samochod("Jsz",5, Waga.Pow3T5));
        samochody.add(new Samochod("Ksz",5, Waga.Od1Tdo3T5));

        Oplaty oplaty = new Oplaty();

        System.out.println("Mamy samochody: "+samochody);

        System.out.println("Wjzad samochodów do punktu opłat");

        Random random = new Random();
        for (Samochod s : samochody) {
            int index = random.nextInt(3);
            oplaty.getBramka(index).wjzad(s);
        }

        oplaty.pobierzOplaty();

        Samochod samochod;
        do {
            samochod = oplaty.getBramkaDoWyjazdu().wyjazd();
            if (samochod != null) {
                System.out.println("Wyjazd "+samochod);
            }
        } while (samochod != null);

        System.out.println("Wszytkie wyjechały");
        System.out.println("Raport z opłat");
        System.out.println(oplaty);
    }

}
