package alura;

import alura.model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clase7 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("curso de fisica", 200));
        cursos.add(new Curso("curso de java 8", 500));
        cursos.add(new Curso("curso de geometria del espacio", 400));
        cursos.add(new Curso("curso de historia universal", 300));

        cursos.sort(Comparator.comparing(Curso::getHoras));

        cursos.stream().filter(x -> x.getHoras() >= 300).forEach(x -> System.out.println(x.getNombre()));


        cursos.stream().filter(x -> x.getHoras() >= 300).forEach(System.out::println);
    }
}

