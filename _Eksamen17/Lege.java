public class Lege extends Ansatt {
    
    final int legeNummer;

    public Lege(String ansattId, String navn, int legeNummer) {
        super(ansattId,navn);
        this.legeNummer = legeNummer;
    }
}
