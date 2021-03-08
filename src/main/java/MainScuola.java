public class MainScuola {

    public static void main(String[] args) {

        /**
         * sono una prof semplice...
         */

        Professore proffe= new Professore("Andrea", "Gorletta");

        Alunno oscar = new Alunno("Oscar", "Alberini");
        Alunno gigi = new Alunno("Gigi", "Gattini");

        /**
         * ...valuto gli alunni da 1 a 10
         */

        proffe.valuta(oscar, 6);
        proffe.valuta(oscar, 10);
        proffe.valuta(oscar, 7);
        proffe.valuta(oscar, 9);
        proffe.valuta(oscar, 9);


        proffe.valuta(gigi, 9);
        proffe.valuta(gigi, 6);
        proffe.valuta(gigi, 4);
        proffe.valuta(gigi, 4);
        proffe.valuta(gigi, 6);

        System.out.println(oscar.dettagli());
        System.out.println(gigi.dettagli());

    }

}


