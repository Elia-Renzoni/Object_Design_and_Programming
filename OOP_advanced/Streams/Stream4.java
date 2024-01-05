/**
*   @author Elia Renzoni
*   @date 05/01/2024
*   @brief Java Stream ex.
* 
*/

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Arrays;

public class Stream4 {
    public static void main(String ...args)  {
        final List<String> names = Arrays.asList("Elia", "Sara", "Giada", "Mattia", "Rocco", "Lorenzo");
        
        final List<String> correctList = names.stream()
                            .distinct()
                            .filter(n -> n.length() <= 5)
                            .sorted((n1, n2) -> n1.length() - n1.length())
                            .collect(Collectors.toList());                      // return a List with all the stream elements
        
        correctList.stream()
                .forEachOrdered(n -> System.out.println(n));
    }
}
