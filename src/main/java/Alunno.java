import java.util.LinkedList;
import java.util.List;

public class Alunno extends Persona {

    private List<Integer> voti;
    private boolean lode;


    public Alunno(String nome, String cognome) {
        super(nome, cognome);
        this.voti= new LinkedList<>();
        this.lode=false;
    }

    public void addVoto(int voto){
        voti.add(voto);
    }

    public double getMediaVoti() {
        double mediaVoti= 0;

        for(Integer i: voti) {
            mediaVoti=mediaVoti+i;
        }

        return mediaVoti/voti.size();
    }

    public void setLode(boolean b){
        this.lode=b;
    }

    public String dettagli(){
        String dett= super.getDettagli();
        dett += "La sua pagella è: ";
        for(Integer i: voti) {
           dett+= "\nVoto: "+ i;
        }
        dett+= "\nLa media è: "+ getMediaVoti();
        dett+= lode ? "\nCon lode.\n" : "\nSenza lode.\n";
        return dett;
    }
}
