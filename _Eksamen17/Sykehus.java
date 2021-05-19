public class Sykehus {
    
    public static void main(String[] args) {
        Akutten akutten = new Akutten();
        Sengepost sengepost = new Sengepost(100);

        Pasient ole = new Pasient("Ole", "0123456789", 0);
        Pasient per = new Pasient("Per", "987654321", 1);

        skrivInn(akutten, ole);
        skrivInn(akutten, per);

        overforPasient(akutten, sengepost, ole);

        skrivUtFraAvdeling(akutten, per);

    }

    public static void skrivInn(Avdeling avdeling, Pasient p) {
        avdeling.settInn(p);
    }

    public static void overforPasient(Avdeling forrigeAvdeling, Avdeling nyAvdeling, Pasient p) {
        Pasient overfores = forrigeAvdeling.hentUt(p);
        nyAvdeling.settInn(overfores);
    }

    public static void skrivUtFraAvdeling(Avdeling avdeling, Pasient p) {
        avdeling.hentUt(p);
    }

    public static void utforAnalyse(PasientPrio pasientPrio, int antAnalyser) {
        AnalyseBuffer buffer = new AnalyseBuffer();
        for (int i = 0; i < Pasient.MAXPASPRIO+1; i++) {
            new Thread(new Sil(pasientPrio,buffer)).start();
        }
        for (int i = 0; i < antAnalyser; i++) {
            new Thread(new Analyse(buffer)).start();
        }

    }
}
