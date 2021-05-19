public abstract class Avdeling {

    PasientAdm pasientAdm;
    
    public final void settInn(Pasient p) {
        pasientAdm.settInnPasient(p);
    }

    public final Pasient hentUt(Pasient p) {
        return pasientAdm.hentUt(p);
    }

    public final Pasient hentUt(int i) {
        return pasientAdm.hentUt(i);
    }
}
