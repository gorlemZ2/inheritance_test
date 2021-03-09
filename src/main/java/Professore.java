public class Professore extends Persona {

    public Professore(String nome, String cognome) {
        super(nome, cognome);
    }

    public void valuta(Alunno a, int voto){
        a.addVoto(voto);
        a.setLode(a.getMediaVoti() > 8);

    }
}
