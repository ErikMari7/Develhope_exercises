package JavaAdvanced.esercizio9;

//Scrivere una funzione che restituisca un hashset riempito
//        Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//        Scorrere il set, per ogni elemento verificare se è
//        uguale all'oggetto creato ed eliminarlo
//        Svuotare l'hashset, verificarlo e stampare il risultato


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> lista = hashSet();
        System.out.println("Hashset: " + lista);

        String numero = new String("5");
        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            if(element.equals(numero)) {
                iterator.remove();
            }
        }
        System.out.println("Hashset dopo rimozione: " + lista);

        lista.clear();
        System.out.println("Hashset svuotato_: " + lista);
    }

    public static Set<String> hashSet()  {
        Set<String> lista = new HashSet<>(Arrays.asList("1","2","3","4","5"));
        return lista;
    }
}
