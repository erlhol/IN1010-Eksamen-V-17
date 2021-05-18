public class AdminOverlege extends Overlege implements Administrator {

    final String ansvarsKode;

    public AdminOverlege(String ansattId, String navn, int legeNummer, String spesialiseringsType, String ansvarskode) {
        super(ansattId,navn,legeNummer,spesialiseringsType);
        this.ansvarsKode = ansvarskode;
    }

    @Override
    public String hentAnsvarskode() {
        return ansvarsKode;
    }
}
