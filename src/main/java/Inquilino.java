public class Inquilino extends Persona {

    private double stipendio;

    public Inquilino(String nome, String cognome, double stipendio) {
        super(nome, cognome);
        this.stipendio =stipendio;
    }

    public boolean puoAbitare(Villetta p){
        return stipendio > ((p.getCanoneAffitto()/p.getNumeroInquilini()+1)+300);
    }
}
