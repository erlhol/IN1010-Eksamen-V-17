public class Analyse implements Runnable{

    private AnalyseBuffer analyseBuffer;

    public Analyse(AnalyseBuffer analyseBuffer) {
        this.analyseBuffer = analyseBuffer;
    }

    @Override
    public void run() {
        while (true) {
            Pasient pas = analyseBuffer.hentUt();
            if (pas != null) {
                if (pas instanceof MannligPasient) {
                    Sykehus.kanHaSykdomMann(pas);
                }
                else {
                    Sykehus.kanHaSykdomKvinne(pas);
                }
            }
        }
    }
}
