package alura;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Clase11 {

    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now().minusMonths(10).plusDays(11);

        LocalDate fechaMundialFutbol = LocalDate.of(2022, 9, 15);

        System.out.println(ChronoUnit.MONTHS.between(fechaActual, fechaMundialFutbol));
    }
}

