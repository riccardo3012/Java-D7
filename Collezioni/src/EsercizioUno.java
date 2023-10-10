
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class EsercizioUno {
public static void main (String[]args){
Scanner input = new Scanner(System.in);
    System.out.print("Inserisci il numero di parole che vuoi visualizzare:" + " ");
    int N = input.nextInt();

    Set<String> parole = new HashSet<String>();
    Set<String> paroleDoppie = new HashSet<String>();

    for (int i = 0 ; i < N ; i ++){
        System.out.print("Inserisci una parola"+(i+1));
        String parola = input.next();
        if (parole.add(parola)) {
            paroleDoppie.add(parola);

        }
    }
    System.out.print("Le parole duplicate sono:");
    for (String parola:paroleDoppie){
        System.out.print(parola);
    }
int numeroParoleDistinte = parole.size();
    System.out.print("Ci sono" + " " + numeroParoleDistinte + "parole diverse!");
   for (String parola : parole) {
       System.out.print(parola);
   }

}

}
