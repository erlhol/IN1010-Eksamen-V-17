public class KvinneligPasient extends Pasient {
    public KvinneligPasient(String navn, String fnr, int prio) {
        super(navn,fnr,prio);
    }

    @Override
    public static void iFaresonen(Pasient p) {
        Sykehus.iFaresonenKvinne(p);
    }

    @Override
    public void kanHaSykdom(Pasient p) {
        Sykehus.iFaresonenKvinne(p);
    }
}
