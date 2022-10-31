package hu.petrik;

public class Fuvar {

    private int taxiAzonosito, utazas;
    private String indulas, fizetesModja;
    private double megtettTavolsag, vitelDij, borraValo;

    public Fuvar(int taxiAzonosito,  String indulas, int utazas, double megtettTavolsag, double vitelDij, double borraValo, String fizetesModja) {
        this.taxiAzonosito = taxiAzonosito;
        this.utazas = utazas;
        this.indulas = indulas;
        this.fizetesModja = fizetesModja;
        this.megtettTavolsag = megtettTavolsag;
        this.vitelDij = vitelDij;
        this.borraValo = borraValo;
    }

    @Override
    public String toString() {
        return String.format("Taxi: %d Indulas: %s UtazásIdeje: %d Megtett távolság: %f Viteldíj: %f Borravaló: %f Fizetés módja: %s" ,
                this.taxiAzonosito, this.indulas, this.utazas, this.megtettTavolsag, this.vitelDij, this.borraValo, this.fizetesModja);
    }
}
