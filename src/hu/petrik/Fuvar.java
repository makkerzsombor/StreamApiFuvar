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

    public int getTaxiAzonosito() {
        return taxiAzonosito;
    }

    public int getUtazas() {
        return utazas;
    }

    public String getIndulas() {
        return indulas;
    }

    public String getFizetesModja() {
        return fizetesModja;
    }

    public double getMegtettTavolsag() {
        return megtettTavolsag;
    }

    public double getVitelDij() {
        return vitelDij;
    }

    public double getBorraValo() {
        return borraValo;
    }

    @Override
    public String toString() {
        return String.format("Taxi: %d Indulas: %s UtazásIdeje: %d(s) Megtett távolság: %f Viteldíj: %.2f($) Borravaló: %.2f($) Fizetés módja: %s" ,
                this.taxiAzonosito, this.indulas, this.utazas, this.megtettTavolsag, this.vitelDij, this.borraValo, this.fizetesModja);
    }
}
