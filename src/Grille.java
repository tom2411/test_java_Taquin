import java.util.ArrayList;
import java.util.List;

public class Grille {
    // 0: triangle, 1: carré, 2: losange, 3: vide
    private final List<Forme> list_formes;
    private final List<List<Forme>> grille;
    private final static int NB_LIG =3;
    private final static int NB_COL =3;

    public Grille(List<Forme> list_formes) {
        this.list_formes = list_formes;
        this.grille = new ArrayList<>();
        int nb_elem = 0;
        for (int i = 0; i < NB_LIG; i++) {
            List<Forme> lig = new ArrayList<>();
            for (int j = 0; j < NB_COL; j++) {
                lig.add(list_formes.get(nb_elem));
                nb_elem++;
            }
            grille.add(lig);
        }
    }

    public List<List<Forme>> getGrille() {
        return grille;
    }

    public Coordonnees getCaseVide(){
        Coordonnees res = new Coordonnees();
        for (int i = 0; i < NB_LIG; i++) {
            for (int j = 0; j < NB_COL; j++) {
                if (this.grille.get(i).get(j).getForme()==3){
                    res.setLig(i);
                    res.setCol(j);
                    return res;
                }
            }
        }
        return res;
    }

    public List<Coordonnees> getCaseVoisine(){
        Coordonnees caseVide = getCaseVide();
        List<Coordonnees> liste_case_voisine = new ArrayList<>();
        if (caseVide.getLig()==0 && caseVide.getCol()==0){
            liste_case_voisine.add(new Coordonnees(0,1));
            liste_case_voisine.add(new Coordonnees(1,0));
        }
        if (caseVide.getLig()==0 && caseVide.getCol()==1){
            liste_case_voisine.add(new Coordonnees(0,0));
            liste_case_voisine.add(new Coordonnees(1,1));
            liste_case_voisine.add(new Coordonnees(0,2));
        }
        if (caseVide.getLig()==0 && caseVide.getCol()==2){
            liste_case_voisine.add(new Coordonnees(1,2));
            liste_case_voisine.add(new Coordonnees(0,1));
        }
        if (caseVide.getLig()==1 && caseVide.getCol()==0){
            liste_case_voisine.add(new Coordonnees(0,0));
            liste_case_voisine.add(new Coordonnees(1,1));
            liste_case_voisine.add(new Coordonnees(2,0));
        }
        if (caseVide.getLig()==1 && caseVide.getCol()==1){
            liste_case_voisine.add(new Coordonnees(1,0));
            liste_case_voisine.add(new Coordonnees(0,1));
            liste_case_voisine.add(new Coordonnees(1,2));
            liste_case_voisine.add(new Coordonnees(2,0));
        }
        if (caseVide.getLig()==1 && caseVide.getCol()==2){
            liste_case_voisine.add(new Coordonnees(1,1));
            liste_case_voisine.add(new Coordonnees(0,2));
            liste_case_voisine.add(new Coordonnees(2,2));
        }
        if (caseVide.getLig()==2 && caseVide.getCol()==0){
            liste_case_voisine.add(new Coordonnees(1,0));
            liste_case_voisine.add(new Coordonnees(2,1));
        }
        if (caseVide.getLig()==2 && caseVide.getCol()==1){
            liste_case_voisine.add(new Coordonnees(1,1));
            liste_case_voisine.add(new Coordonnees(2,2));
            liste_case_voisine.add(new Coordonnees(2,0));
        }
        if (caseVide.getLig()==2 && caseVide.getCol()==2){
            liste_case_voisine.add(new Coordonnees(1,2));
            liste_case_voisine.add(new Coordonnees(2,1));
        }
        return liste_case_voisine;
    }

    public boolean isFinal(){
        //TODO savoir si la grille est finale ou pas
        return false;
    }

}
