import java.util.ArrayList;
public class Main {

    /**
     * creare una funzione con firma:
     *    public static double media(....){}
     * con parametri a piacimento, che calcola la media di una sequenza numerica.
     */
    
    public static double media(int[] macchine) {
        int somma = 0;
        for (int i = 0; i < macchine.length; i++)
        somma += macchine[i];
        double media = ((double) somma) / macchine.length;
        return media;
    }



    public static void main(String[] args) {


        /**
         * istanziare 10 veicoli con diverse velocità e diverso numero di ruote (max 4 LOL)
         */
        Veicle macchina = new Veicle(50, 4, "ford");
        Veicle macchina2 = new Veicle(30, 3, "mini");
        Veicle macchina3 = new Veicle(20, 3, "ferrari");
        Veicle macchina4 = new Veicle(10, 4, "lamborghini");
        Veicle macchina5 = new Veicle(50, 4, "panda");
        Veicle macchina6 = new Veicle(60, 4, "toyota");
        Veicle macchina7 = new Veicle(70, 4, "audi");
        Veicle macchina8 = new Veicle(80, 4, "peugeot");
        Veicle macchina9 = new Veicle(50, 3, "mini 2");
        Veicle macchina10 = new Veicle(20, 3, "ford 2");

       
        /**
         * creare una lista o un array che contenga gli oggetti creati.
         */

            ArrayList<Veicle> macchine = new ArrayList<Veicle>();
            macchine.add(macchina);
            macchine.add(macchina2);
            macchine.add(macchina3);
            macchine.add(macchina4);
            macchine.add(macchina5);
            macchine.add(macchina6);
            macchine.add(macchina7);
            macchine.add(macchina8);
            macchine.add(macchina9);
            macchine.add(macchina10);

            int listaVelocita[] = new int [10];


        /**
         *  Stamapre, attraverso un ciclo FOR che analizza TUTTI E DIECI gli oggetti,
         *  i dettagli dei soli veicoli con velocità superiorie
         *  alla media calcolata dalla funzione media().
         */

        for(int i = 0; i < macchine.size(); i++){
           
            // prendere velocità di tutti
            listaVelocita[i] = macchine.get(i).getVelocita();

            // Pushare dentro lista velocità e fare la media
        };

        double avg = media(listaVelocita);

        System.out.println("Veicoli con velocità superiore alla media: " + avg);


        for(int i = 0; i < macchine.size(); i++){
           
            if(macchine.get(i).getVelocita() > avg){
                // System.out.println("Questa macchina è una " + macchine.get(i).nome + " ed ha " + macchine.get(i).ruote + " ruote" );
                System.out.println(macchine.get(i).dettagli());

            }
        }


        System.out.println("Macchine con 4 ruote:");

        /**
         *  Stamapre, attraverso un ciclo WHILE che analizza TUTTI E DIECI gli oggetti,
         *  i dettagli dei soli veicoli con 4 ruote.
         */

        int i = 0;
        while(i < macchine.size()){
            if(macchine.get(i).getRuote() == 4){
                // System.out.println(macchine.get(i).nome + " ha 4 ruote");
                System.out.println(macchine.get(i).dettagli());

            }
            i++;
        }

    }

}


