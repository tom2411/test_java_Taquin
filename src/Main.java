import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste_forme = new ArrayList<Integer>(Arrays.asList(1,1,1,2,2,2,0,3,0)) ;

        Grille grille = new Grille(liste_forme);

        System.out.println(grille.getGrille());
        System.out.println(grille.getCaseVide());
        System.out.println(grille.getCaseVoisine());
    }
}
