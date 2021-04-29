public class Forme {
    private int forme;
    private String couleur;


    public Forme(int forme, String couleur) {
        this.forme = forme;
        this.couleur = couleur;
    }

    public int getForme() {
        return forme;
    }

    public void setForme(int forme) {
        this.forme = forme;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        if (getForme()==0){
            return "(Forme: triangle, Couleur: "+getCouleur()+")";
        }
        if (getForme()==1){
            return "(Forme: carree, Couleur: "+getCouleur()+")";
        }
        if (getForme()==2){
            return "(Forme: losange, Couleur: "+getCouleur()+")";
        }
        if (getForme()==3){
            return "(Forme: vide"+")";
        }
        return "";
    }
}
