package wsb.po.prom.obiekty;

import java.util.ArrayList;

public class KolejkaAut {

    private ArrayList<Samochod> kolejka = new ArrayList<Samochod>();

    public Samochod getSamochod(int i) {
        if (kolejka.size() <= i) {
            return null;
        }
        return kolejka.get(i);
    }

    public void wjazd(Samochod samochod) {
        kolejka.add(samochod);
    }

    public Samochod wyjazd () {
//        if (kolejka.size() == 0) {
        if (kolejka.isEmpty()) {
            return null;
        }
        return kolejka.remove(0);
    }

    public int dlugoscKolejki () {
        return kolejka.size();
    }

    @Override
    public String toString() {
        return "KolejkaAut{" +
                "kolejka=" + kolejka +
                " długość = " + dlugoscKolejki() +
                '}';
    }
}
