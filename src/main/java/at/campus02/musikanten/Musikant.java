package at.campus02.musikanten;

public abstract class Musikant {
    private int anzahlBeine;
    private Instrument instrument;

    public Musikant(int anzahlBeine, Instrument instrument) {
        this.anzahlBeine = anzahlBeine;
        this.instrument = instrument;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return  " Verscheut : " + verscheucheRaeuber() +
                " Musiziert : " + spieleMusik();
    }

    public abstract int verscheucheRaeuber();
    public abstract double spieleMusik();
}
