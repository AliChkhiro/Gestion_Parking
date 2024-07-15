package classes;

public class Moto extends Véhicule{
    
    private int vitesseMax;
    public Moto(String marque, String modèle, String immatriculation, int vitesseMax) {
        super(marque, modèle, immatriculation);
        this.vitesseMax = vitesseMax;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
    @Override
    public String toString() {
        String affichage = "La Moto "+ getMarque()+" "+getModèle()+" d'immatriculation "+getImmatriculation()+" a une vitesse maximale "+getVitesseMax();
        return affichage;
    }
}
