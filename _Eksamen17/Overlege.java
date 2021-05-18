public class Overlege extends Lege {
    
    final String spesialiseringsType;

    public Overlege(String ansattId, String navn, int legeNummer, String spesialiseringsType) {
        super(ansattId, navn, legeNummer);
        this.spesialiseringsType = spesialiseringsType;
    }

}
