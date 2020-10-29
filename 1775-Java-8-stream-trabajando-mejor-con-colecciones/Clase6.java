package alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clase6 {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();
        cursos.add("curso de fisica");
        cursos.add("curso de java 8");
        cursos.add("curso de geometria del espacio");
        cursos.add("curso de historia universal");

        cursos.sort(Comparator.comparing(String::length).reversed());

        cursos.forEach(System.out::println);


    }
}

