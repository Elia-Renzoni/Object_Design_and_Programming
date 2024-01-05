/**
*   @author Elia Renzoni
*   @date 05/01/2024
*   @brief Java Stream Ex.
*/

import java.util.stream.*;
import java.util.Random;

public class Stream3 {
    public static void main(String ...args) {
        Stream<Integer> firstStream = Stream.generate(new Random()::nextInt)
                                    .limit(20);
                                    
        Stream<Integer> secondStream = Stream.iterate(10, new Random()::nextInt)
                                    .skip(10)
                                    .limit(20);
        
        Stream<Integer> thirdStream = Stream.concat(firstStream, secondStream)
                                    .filter(n -> n % 2 == 0)
                                    .limit(10);
        
        thirdStream.forEachOrdered(n -> System.out.println(n));
    }
}
