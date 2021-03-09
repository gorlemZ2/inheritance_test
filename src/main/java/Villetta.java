public class Villetta extends Edificio{
    private int numeroInquilini;

    private double canoneAffitto;

    public Villetta(int capienza, int annoCostruzione, String indirizzo, int numeroInquilini, double canoneAffitto) {
        super(capienza, annoCostruzione, indirizzo);
        if(numeroInquilini <= capienza){
            this.numeroInquilini=numeroInquilini;
        }else this.numeroInquilini=capienza;
        this.canoneAffitto=canoneAffitto;
    }

    public int getNumeroInquilini() {
        return numeroInquilini;
    }

    public void setNumeroInquilini(int numeroInquilini) {
        this.numeroInquilini = numeroInquilini;
    }

    public double getCanoneAffitto() {
        return canoneAffitto;
    }

}
