
TEST 09/03 PARZIALE DI PROGRAMMAZIONE JAVA SULL'EREDITARIETÀ

###ESERCIZIO 0    
- 0.1 
 >Creare una classe `Edificio`, che prende in input come parametri due interi
che rappresentano la capienza e l'anno di costruzione, e una stringa indirizzo.
Creare una classe `Persona` che ha come caratteristiche il nome e il cognome, e un metodo 
`dettagli` che restituisce una STRINGA.

************
###ESERCIZIO 1
- 1.1 
>Creare una classe `Villetta` che è anche un Edificio: oltre alle caratteristiche 
  della sua superclasse, ha anche un riferimento al numero di inquilini e un riferimento al   
  costo del canone di affitto. Alla creazione di una Villetta deve essere
  eseguito un controllo particolare:  
  il numero di inquilini in input NON PUÒ superare la capienza dell'edificio.
  Potrebbe essere utile implementare i setter e i getter.

- 1.2
 >Creare una classe `Inquilino` che estende Persona e ha anche un attributo stipendio.
Implementare un metodo `puoAbitare` che, prendendo in input un oggetto Villetta, calcola
> se l'inquilino in questione può abitarci. Un inquilino può abitare nella Villetta se 
>e solo se il suo stipendio incrementato di 300 euro (uno deve pur vivere...) è maggiore
> o uguale al canone di affitto diviso il numero di inquilini che ci vivrebbero, compreso lui.

************
###ESERCIZIO 2
- 2.1
>Creare una classe `Alunno` che estende Persona. Nei suoi attributi, deve eesserci una lista di
> Integer che rappresenta i voti dello studente e un valore che ci dice se l'annunno ha preso
> o meno una lode. Nella classe Alunno c'è un OVERRIDE del metodo dettagli, che aggiunge 
>le informazioni circa la pagella dello studente ovvero l'elenco dei voti, la sua media e se 
>ha preso o no la lode.

- 2.2 
>Creare una classe `Professore` che si spera sia anche una Persona. Il Professore può
>usare il metodo `valuta` che, prendendo come parametri un Alunno e un intero, 
>aggiunge un voto all'alunno e, se la sua media è superiore a 8, allora avrà anche la lode.