/**
*   @author Elia Renzoni
*   @date 03/01/2024
*   @brief Java Stream ex1.
* 
*/

import java.util.stream.*;
import java.util.Random;

class Stream1 {
    public static void main(String[] args) {
        Stream<Integer> streamWithIntegers = Stream.empty();
        
        Stream.of("Java", "is", "not", "fun").forEachOrdered(i -> System.out.println(i));
        
        System.out.println();
        
        Stream<Integer> streamWithIterate = Stream.iterate(0, number -> number + 2).limit(10);
        
        System.out.println();
        
        Stream.generate(new Random()::nextDouble).limit(10).forEachOrdered(i -> System.out.println(i));
        
        System.out.println();
        
       Stream.concat(streamWithIntegers, streamWithIterate).forEachOrdered(i -> System.out.println(i));
    }
}