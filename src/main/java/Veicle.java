public class Veicle{

    private int velocita;
    private int ruote;
    private String nome;

    public Veicle(int velocita, int ruote, String nome){
        this.velocita = velocita;
        this.ruote = ruote;
        this.nome = nome;
    }

    public int getVelocita() {
        return velocita;
    }

    public int getRuote() {
        return ruote;
    }

    public String dettagli(){
        return ("Questa macchina è una " + nome + " ha " + ruote + " ruote " + " e raggiunge " + velocita + " di velocità." );
    }


}

//Creare una classe Veicolo. Il costruttore della classe prende in input due numeri: la velocità e il numero di ruote. La classe mette a disposizione due getter e un metodo dettagli() che stampa a video una frase che descrive il Veicolo.