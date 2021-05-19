public class KvinneligPasient extends Pasient {
    public KvinneligPasient(String navn, String fnr, int prio) {
        super(navn,fnr,prio);
    }

    @Override
    public boolean iFaresonen() {
        Sykehus.iFaresonenKvinne(this);
    }

    @Override
    public void kanHaSykdom() {
        Sykehus.iFaresonenKvinne(this);
    }
}
