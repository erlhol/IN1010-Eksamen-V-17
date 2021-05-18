public class PasientPrio extends PasientAdm {
    Pasient[] startPekere = new Pasient[Pasient.MAXPASPRIO+1];
    Pasient[] sluttPekere = new Pasient[Pasient.MAXPASPRIO+1];

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
            return p;
        }
        while (peker.neste != null) {
            peker = peker.neste;
            if (peker.neste == p) {
                peker.neste = peker.neste.neste;
                return p;
            }
            
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
        Pasient peker = startPekere[i];
        Pasient pasientSomHentes = sluttPekere[i];
        // setter den nest siste pekeren til å bli sluttpeker
        while (peker.neste != null) {
            peker = peker.neste;
        }
        sluttPekere[i] = peker;
        peker.neste = null;

        return pasientSomHentes;

    }

}
