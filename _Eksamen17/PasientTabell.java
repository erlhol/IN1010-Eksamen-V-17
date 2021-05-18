public class PasientTabell extends PasientAdm {
    Pasient[] pasientListe;
    int forrigeKall = 0;

    public PasientTabell(int stoerrelse) {
        pasientListe = new Pasient[stoerrelse];
    }

    public void settInnPasient(Pasient p) {
        for (int i = forrigeKall; i < pasientListe.length; i++) {
            if (pasientListe[i] == null) {
                pasientListe[i] = p;
                forrigeKall = i;
                p.sengNr = i;
                return;
            }
        }
    }

    public Pasient hentUt(int i) {
        for (int i = 0; i < pasientListe.length; i++) {
            if (pasientListe[i] != null) {
                if (pasientListe[i].prioritet == i) {
                    Pasient pasientSomHentes = pasientListe[i];
                    pasientListe[i] = null;
                    pasientSomHentes.sengNr = -1;
                    return pasientSomHentes;
                }
            }
            
        }
        return null;
    }

    public Pasient hentUt(Pasient p) {
        if (p.sengNr != -1) {
            Pasient pasientSomHentes = pasientListe[p.sengNr];
            pasientListe[p.sengNr] = null;
            pasientSomHentes.sengNr = -1;
            return pasientSomHentes;
        }
        else {
            System.out.println("Ikke lov å hente ut en pasient som ikke er der!");
            return null;
        }
        
    }


}
