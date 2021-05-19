public class PasientPrio extends PasientAdm {
    Pasient[] startPekere = new Pasient[Pasient.MAXPASPRIO+1]; // viktig å huske at statiske metoder kalles statisk!
    Pasient[] sluttPekere = new Pasient[Pasient.MAXPASPRIO+1];

    // henter ut på slutten og setter inn på starten
    @Override
    public void settInnPasient(Pasient p) {
        if (startPekere[p.prioritet] == null) {
            startPekere[p.prioritet] = p;
            sluttPekere[p.prioritet] = p;
        }
        else {
            p.neste = startPekere[p.prioritet];
            startPekere[p.prioritet] = p;
        }
    }

    public Pasient hentUt(Pasient p) {
        Pasient peker = startPekere[p.prioritet];
        if (peker == p) {
            startPekere[p.prioritet] = peker.neste;
            if (peker.neste == null) {
                sluttPekere[p.prioritet] = null;
            }
            return p;
        }
        while (peker.neste != null) {
            if (peker.neste == p) {
                peker.neste = peker.neste.neste;
                return p;
            }
            peker = peker.neste;
        }
        if (peker.neste != p) {
            return null;
        }
        else {
            sluttPekere[p.prioritet] = peker;
            peker.neste = null;
            return p;
        }
    }

    public Pasient hentUt(int i) {
        return hentUt(sluttPekere[i]);
    }

}
