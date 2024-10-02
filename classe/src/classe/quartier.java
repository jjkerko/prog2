package classe;

import java.util.ArrayList;
import java.util.List;

// Classe représentant un quartier (hérite de Location)
public class quartier extends location {
    private List<immeuble> immeubles;
    
    public quartier(String id, String name) {
        super(id, name);
        this.immeubles = new ArrayList<>();
    }
    
    public void ajouterImmeuble(immeuble immeuble) {
        immeubles.add(immeuble);
    }
    
    public boolean contientAppartement(Appartement appartement) {
        for (immeuble immeuble : immeubles) {
            if (immeuble.getAppartements().contains(appartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int countAppartements() {
        int total = 0;
        for (immeuble immeuble : immeubles) {
            total += immeuble.countAppartements();
        }
        return total;
    }
}
