import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaExpression {
    public static void main(String[] args) {
        String textoOrigin = "Java is a object oriented programming language.";
        Pattern patron = Pattern.compile("^Java", Pattern.CASE_INSENSITIVE); // Criterio búsqueda
        Matcher matcher = patron.matcher(textoOrigin);
        if (matcher.find()) {
            System.out.println("Criterio encontrado :)");
        } else System.out.println("No se encontraron resultados :(");

        // ============================================================
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.print("Intro texto: ");
            String texto = teclado.nextLine();

            /** Expresiones Regulares
             *  [A-Z]  -->     Representa las letras de la A a la Z (en alfabeto inglés)
             *  [a-z]  -->     Representa las letras de la a hasta la z (en alfabeto inglés)
             *  [A-ZÑÁÉÍÓÚ]  -->   Representa letras mayúsculas en español
             *  [a-zñáéíóú]  -->   Representa letras minúsculas en español
             *  [0-9]    -->   Representa números del 0 al 9
             *  \s --->  Representa espacio
             *  \S --->  Sin espacios
            */
            //boolean resultadoValidacion = texto.matches("^[A-Za-z0-9ÑÁÉÍÓÚñáéíóú]*$");
            // ? + *
            // boolean resultadoValidacion = texto.matches("^[A-ZÑÁÉÍÓÚ][a-zñáéíóú]*$");

            /*
                Validar más de un nombre
                Ejemplo: José Luis
                \s  -->  \\s
             */
            //boolean resultadoValidacion = texto.matches("^([A-ZÑÁÉÍÓÚ][a-zñáéíóú]*\\s)*([A-ZÑÁÉÍÓÚ][a-zñáéíóú]*)$");


            /**
             * Ejercicio. (3 puntos) (10 minutos)
             * Validar que el texto solo contenga números (que no empiece con 0) y guiones
             * Válidos  -->  76899934  2-346577
             * No válidos  -->  --7465564   2-3874554-
             */
            boolean resultadoValidacion = texto.matches("^[0-9]{8,10}$");
            System.out.println("Validación --> " + resultadoValidacion);
        }
    }
}
