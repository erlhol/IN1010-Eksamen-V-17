public class MannligPasient extends Pasient {
    public MannligPasient(String navn, String fnr, int prio) {
        super(navn,fnr,prio);
    }

    @Override
    public void iFaresonen(Pasient p) {
        Sykehus.iFaresonenMann(p);
    }

    @Override
    public void kanHaSykdom(Pasient p) {
        Sykehus.iFaresonenMann(p);
    }

}
