package classe;

import java.util.ArrayList;
import java.util.List;

// Classe représentant un immeuble (hérite de Location)
public class immeuble extends location {
    private int etages;
    private List<Appartement> appartements;
    
    public immeuble(String id, String name, int etages) {
        super(id, name);
        this.etages = etages;
        this.appartements = new ArrayList<>();
    }
    
    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }
    
    @Override
    public int countAppartements() {
        return appartements.size();
    }

    public List<Appartement> getAppartements() {
        return appartements;
    }
}
