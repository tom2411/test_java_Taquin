import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Forme triangle_rouge = new Forme(0,"rouge");
        Forme carree_rouge = new Forme(1,"rouge");
        Forme losange_rouge = new Forme(2,"rouge");

        Forme triangle_vert = new Forme(0,"vert");
        Forme carree_vert = new Forme(1,"vert");
        Forme losange_vert = new Forme(2,"vert");

        Forme triangle_bleu = new Forme(0,"bleu");
        Forme carree_bleu = new Forme(1,"bleu");
        Forme vide = new Forme(3,"");

        List<Forme> liste_forme = new ArrayList<Forme>(Arrays.asList(triangle_rouge,carree_rouge,losange_rouge,
                triangle_vert,carree_vert,losange_vert,triangle_bleu,carree_bleu,vide)) ;

        Grille grille = new Grille(liste_forme);

        System.out.println(grille.getGrille());
        System.out.println(grille.getCaseVide());
        System.out.println(grille.getCaseVoisine());
    }
}
