package it.epicode.be.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GestioneStream {
    public static void main(String[] args) {

        // Sorgente per uno Stream di dati
        // da Array
        String[] arrStr = new String[] {"Bianco", "Nero", "Giallo", "Blu", "Verde"};
        Stream<String> sArr =  Arrays.stream(arrStr);

        // da Collection
        Collection<String> sCol = Arrays.asList(arrStr);
        Stream<String> cStr = sCol.stream();

        // da singoli valori
        Stream<String> StrOf = Stream.of("Bianco", "Nero", "Giallo", "Blu", "Verde");

        // da generatore di valori
        Stream<Integer> strInt = Stream.iterate(0, num -> num+2).limit(10);

        // da random
        Stream<Double> strRand = Stream.generate(new Random()::nextDouble).limit(10);

        // tramite un costruttore di Stream
        Stream<String> strBuild = Stream.<String>builder()
                                        .add("Bianco")
                                        .add("Nero")
                                        .add("Giallo")
                                        .build();


        // Posso operare su uno stream in due modi
        // Tramite operazioni intermedie
        // Tramite operazioni finali

        // Operazioni intermedie
        // Sono tutte quelle operazioni che trasformano lo stream
        // e mi restituiscono uno stream modificato
        // La concatenazione di operazioni intermedie viene chiamato pipeline

        // iteration
        // filtering
        // mapping

        Stream<String> stream = Stream.of("Bianco", "Nero", "Giallo", "Nero", "Blu", "Verde");

        stream.distinct()
                .sorted()
                .filter(ele -> ele.length() > 3)
                .map(ele -> ele + "!")
                .limit(3)
                .forEach(ele -> System.out.println(ele));

        // Operazioni finali
        // Le operazioni finali generano un risultato finale.
        // Terminando la manipolazione dello Stream

        // Matching
        // Reduction
        // Collection

        // Reduction
        Stream<Integer> streamInt = Stream.iterate(0, num -> num+2).limit(10);
        //streamInt.forEach(ele -> System.out.println(ele));
        int result = streamInt.reduce(0, (acc, val) -> acc + val);
        System.out.println("La somma di tutti i valori dello Stream è " + result);

        // Collection
        stream = Stream.of("Bianco", "Nero", "Giallo", "Nero", "Blu", "Verde");
        Stream<String> streamMod =  stream.distinct()
                .sorted()
                .filter(ele -> ele.length() > 3)
                .map(ele -> ele + "!");

        List<String> listaColori = streamMod.collect(Collectors.toList());
        listaColori.forEach(ele -> System.out.println(ele));

        stream = Stream.of("Bianco", "Nero", "Giallo", "Nero", "Blu", "Verde");
        Stream<String> streamModSet =  stream
                .sorted()
                .filter(ele -> ele.length() > 3);

        Set<String> setColori = streamModSet.collect(Collectors.toSet());
        setColori.forEach(ele -> System.out.println(ele));

        // Matching
        Stream<Integer> intStream = Stream.iterate(0, num -> num+2).limit(10);
        intStream.anyMatch(ele -> ele > 5); // true
        intStream.allMatch(ele -> ele > 5); // false
        intStream.noneMatch(ele -> ele > 5); // false
    }

}
