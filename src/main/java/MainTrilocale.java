import java.util.LinkedList;

public class MainTrilocale {

    public static void main(String[] args) {


        Villetta villetta = new Villetta(3, 2003, "piazza Unabomba 4", 2, 600.0);

        Inquilino gigi= new Inquilino("Gigi", "Gattini", 900);
        Inquilino oscar= new Inquilino("Oscar", "Alberini", 800);
        Inquilino precario= new Inquilino("Alice", "Rossi", 500);

        LinkedList<Inquilino> inquiliniPossibili = new LinkedList<>();
        inquiliniPossibili.add(gigi);
        inquiliniPossibili.add(oscar);
        inquiliniPossibili.add(precario);

        System.out.println("Nel trilocale abitano: " + villetta.getNumeroInquilini() + " inquilini.");
        abitareQui(inquiliniPossibili, villetta);


        System.out.println("\nSi propone come inquilino un signore distinto ....\n");


        Inquilino riccastro= new Inquilino("Alice", "Rossi", 5000);
        inquiliniPossibili.add(riccastro);
        abitareQui(inquiliniPossibili, villetta);

        villetta.setNumeroInquilini(3);

        System.out.println("\nOra nel trilocale abitano: " + villetta.getNumeroInquilini() + " inquilini.");
    }

    public static void abitareQui(LinkedList<Inquilino> inquilini, Villetta casa){
        for(Inquilino i : inquilini){
            String puo= i.puoAbitare(casa) ? " può " : " non può ";
            System.out.println(i.getDettagli() + puo + "abitare nel trilocale");
        }
    }
}
