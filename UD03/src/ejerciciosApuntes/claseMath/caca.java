package ejerciciosApuntes.claseMath;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static ejerciciosApuntes.claseMath.ClaseAuxiliar.aumentarFecha;

public class caca {
    public static void main(String[] args) {
        System.out.println(aumentarFecha(5, ClaseAuxiliar.Unidades.YEARS).getYear());


    }
    public  static  int yearsBetween(LocalDateTime momento1, LocalDateTime momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.YEARS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.YEARS);
        } else if (momento1.until(momento2, ChronoUnit.YEARS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.YEARS);
        }
        return (int)diferencia;
    }

    public  static  int yearsBetween(LocalDate momento1, LocalDate momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.YEARS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.YEARS);
        } else if (momento1.until(momento2, ChronoUnit.YEARS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.YEARS);
        }
        return (int)diferencia;
    }
}
