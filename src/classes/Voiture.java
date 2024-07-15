
package classes;

public class Voiture extends Véhicule{
    
    private int nombrePortes;
    public Voiture(String marque, String modèle, String immatriculation, int nombrePortes) {
        super(marque, modèle, immatriculation);
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    @Override
    public String toString() {
        String affichage = "La voiture "+ getMarque()+" "+getModèle()+" d'immatriculation "+getImmatriculation()+" contient "+getNombrePortes()+" de portes";
        return affichage;
    }
    
}
