/**
*   @author Elia Renzoni
*   @date 03/01/2024
*   @brief Java Stream Ex2
* 
*/

import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class Stream2 {
    public static void main(String ...args) {
        final List<Integer> listToUse = Arrays.asList(12, 34, 55, 2, 6, 3, 23, 57, 7);
        
        final Stream<Integer> listAfterStream = listToUse.stream()
            .filter(n -> n % 3 == 0)
            .map(n -> n * 2)
            .distinct()
            .sorted((n1, n2) -> n2 - n1)
            .peek(n -> System.out.println(n))
            .limit(5)
            .skip(3);
            
        listAfterStream.forEachOrdered(n -> System.out.println(n + "  "));
    }
}