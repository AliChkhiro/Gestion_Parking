
package classes;


public abstract class Véhicule {
    protected String marque;
    protected String modèle;
    protected String immatriculation;

    public Véhicule(String marque, String modèle, String immatriculation) {
        this.marque = marque;
        this.modèle = modèle;
        this.immatriculation = immatriculation;
    }
    
    
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModèle() {
        return modèle;
    }

    public void setModèle(String modèle) {
        this.modèle = modèle;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
    
    
}
