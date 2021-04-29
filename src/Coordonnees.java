public class Coordonnees {
    private int elem1;
    private int elem2;

    public Coordonnees() {
        this.elem1 = -1;
        this.elem2 = -1;
    }

    public Coordonnees(int elem1, int elem2) {
        this.elem1 = elem1;
        this.elem2 = elem2;
    }

    public int getElem1() {
        return elem1;
    }

    public void setElem1(int elem1) {
        this.elem1 = elem1;
    }

    public int getElem2() {
        return elem2;
    }

    public void setElem2(int elem2) {
        this.elem2 = elem2;
    }

    @Override
    public String toString() {
        return "(lig: "+this.getElem1()+", col: "+this.getElem2()+")";
    }
}
