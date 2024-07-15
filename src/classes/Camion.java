
package classes;

public class Camion extends Véhicule{
    
    private boolean remorque;
    public Camion(String marque, String modèle, String immatriculation, boolean remorque) {
        super(marque, modèle, immatriculation);
        this.remorque = remorque;
    }

    public boolean isRemorque() {
        return remorque;
    }

    public void setRemorque(boolean remorque) {
        this.remorque = remorque;
    }
    @Override
    public String toString() {
        String affichage;
        if(isRemorque())
        affichage = "Le  "+ getMarque()+" "+getModèle()+
                " d'immatriculation "+getImmatriculation()+" contient un remorque";
        else
            affichage = "Le  "+ getMarque()+" "+getModèle()+
                " d'immatriculation "+getImmatriculation()+" ne contient pas  un remorque ";
        return affichage;
    }
}
