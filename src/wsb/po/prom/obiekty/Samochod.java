package wsb.po.prom.obiekty;

public class Samochod {

    private String nazwa;

    private int liczbaPasazerow;

    private Waga waga;

    public String getNazwa() {
        return nazwa;
    }

    public int getLiczbaPasazerow() {
        return liczbaPasazerow;
    }

    public Waga getWaga() {
        return waga;
    }

    public Samochod(String nazwa, int liczbaPasazerow, Waga waga) {
        this.nazwa = nazwa;
        this.liczbaPasazerow = liczbaPasazerow;
        this.waga = waga;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "nazwa='" + nazwa + '\'' +
                ", liczbaPasazerow=" + liczbaPasazerow +
                ", waga=" + waga +
                '}';
    }
}
