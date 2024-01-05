/**
*   @author Elia Renzoni
*   @date 05/01/2023
*   @brief Java Stream ex.
*/

import java.util.stream.*;
import java.util.List;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.Optional;

public class Stream5 {
    public static void main(String ...args) {
        final List<String> words = new LinkedList<>();
        words.add("Programmazione ad Oggetti");
        words.add("Sistemi Distribuiti");
        words.add("Cloud Computing");
        words.add("Programmazione Concorrente");
        words.add("Basi di Dati");
        words.add("Algoritmi Fault Tollerance nei Sistemi Distribuiti");
        
        // operations
        words.stream()
            .forEachOrdered(n -> System.out.println(n));
        
        final String minElement = words.stream()
                    .min(Comparator.comparing(n -> n.length()))
                    .get();
      
        final long total = words.stream()
                    .count();
        
        final boolean prova = words.stream()
                    .anyMatch(n -> n.length() < 5);
        
        final boolean provaTutte = words.stream()
                    .allMatch(n -> n.length() < 3);
        
        System.out.println(total + " " + prova + " " + provaTutte + " " + minElement);
    
    }
}
