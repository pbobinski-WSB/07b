package wsb.po.prom.obiekty;

public class Bramka {

    private String nazwa;

    private Kasa kasa = new Kasa();

    private KolejkaAut kolejkaAut = new KolejkaAut();

    public Bramka(String nazwa) {
        this.nazwa = nazwa;
    }

    public void wjzad (Samochod samochod) {
        kolejkaAut.wjazd(samochod);
    }

    public Samochod wyjazd () {
        return kolejkaAut.wyjazd();
    }

    public void pobierzOplaty () {
        for (int i = 0; i < kolejkaAut.dlugoscKolejki(); i++) {

            kasa.wplac(kolejkaAut.getSamochod(i));

        }
    }

    public int dlugoscKolejki () {
        return kolejkaAut.dlugoscKolejki();
    }

    @Override
    public String toString() {
        return "Bramka{" +
                "nazwa='" + nazwa + '\'' +
                ", kasa=\n" + kasa +
                '}';
    }
}
