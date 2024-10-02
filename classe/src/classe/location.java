package classe;

//Classe abstraite pour un endroit (soit un immeuble, soit un quartier)
public abstract class location {
 private String id;
 private String name;
 
 public location(String id, String name) {
     this.id = id;
     this.name = name;
 }
 
 public String getName() {
     return name;
 }
 
 // Méthode abstraite pour compter le nombre d'appartements dans l'endroit
 public abstract int countAppartements();
}
