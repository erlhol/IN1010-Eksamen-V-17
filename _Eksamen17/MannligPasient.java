public class MannligPasient extends Pasient {
    public MannligPasient(String navn, String fnr, int prio) {
        super(navn,fnr,prio);
    }

    @Override
    public boolean iFaresonen() {
        Sykehus.iFaresonenMann(this);
    }

    @Override
    public void kanHaSykdom() {
        Sykehus.iFaresonenMann(this);
    }

}
