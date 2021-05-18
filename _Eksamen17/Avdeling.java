public abstract class Avdeling {

    PasientAdm pasientAdm;

    public Avdeling(PasientAdm pasientAdm) {
        this.pasientAdm = pasientAdm;
    }
    
    public void settInn(Pasient p) {
        pasientAdm.settInnPasient(p);
    }

    public Pasient hentUt(Pasient p) {
        return pasientAdm.hentUt(p);
    }

    public Pasient hentUt(int i) {
        return pasientAdm.hentUt(i);
    }
}
