public class Sil implements Runnable {

    private PasientPrio pasientPrio;
    private AnalyseBuffer analyseBuffer;
    private static int teller = 0;
    private int silNummer;

    public Sil(PasientPrio pasientPrio, AnalyseBuffer analyseBuffer) {
        this.pasientPrio = pasientPrio;
        this.analyseBuffer = analyseBuffer;
        silNummer = teller++;
    }

    @Override
    public void run() {
        Pasient pas = pasientPrio.hentUt(silNummer);
        settIBuffer(pas);
        while (pas != null) {
            pas = pasientPrio.hentUt(silNummer);
            settIBuffer(pas);
        }
    }

    private void settIBuffer(Pasient pas) {
        if (pas.iFaresonen()) {
            analyseBuffer.settInn(pas);
        }
    }
}
