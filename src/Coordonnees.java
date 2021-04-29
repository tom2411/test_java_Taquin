public class Coordonnees {
    private int lig;
    private int col;

    public Coordonnees() {
        this.lig = -1;
        this.col = -1;
    }

    public Coordonnees(int lig, int col) {
        this.lig = lig;
        this.col = col;
    }

    public int getLig() {
        return lig;
    }

    public void setLig(int lig) {
        this.lig = lig;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public String toString() {
        return "(lig: "+this.getLig()+", col: "+this.getCol()+")";
    }
}
