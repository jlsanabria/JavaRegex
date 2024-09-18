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
             *  \d --->  Dígitos [0-9]
             *  \D --->  No dígitos [0-9]
             *  \w --->  [A-Za-z0-9_]
             *  \W --->  No cumple [A-Za-z0-9_]
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
             * Válidos  -->  76899934  2-3465778
             * No válidos  -->  --7465564   2-3874554-
             * ^(validacion1|validacion2)$
             */
            boolean resultadoValidacion = texto.matches("^(?!0\\d)$"); // ^[1-9]\\d{7,10}$
            System.out.println("Validación --> " + resultadoValidacion);

            /**
             * Realizar una expresión regular para la fecha de nacimiento (dd-mm-aaaa)
             * Ejemplo: 04-05-1990   4-5-1990   Válido (01 <-> 31) (1 <-> 31)
             *          15-09-2001  15-9-2001   Válido
             */
//            boolean resultadoValidacion = texto.matches("^(0?[1-9]|[1-2]\\d|3[0-1])-(0?[1-9]|1[0-2])-[1-2]\\d{3}$");
//            System.out.println("Validación --> " + resultadoValidacion);

            /**
             * Aqui le dejamos las expresiones    mc''graw --> mc'graw
             *
             * Corto: /\S+@\S+\.\S+/
             *
             * Medio: /^(([^<>()\[\]\.,;:\s@\”]+(\.[^<>()\[\]\.,;:\s@\”]+)*)|(\”.+\”))@(([^<>()[\]\.,;:\s@\”]+\.)+[^<>()[\]\.,;:\s@\”]{2,})$/
             *
             * Largo: /^(([^<>()\[\]\\.,;:\s@”]+(\.[^<>()\[\]\\.,;:\s@”]+)*)|(“.+”))@((\[[0–9]{1,3}\.[0–9]{1,3}\.[0–9]{1,3}\.[0–9]{1,3}])|(([a-zA-Z\-0–9]+\.)+[a-zA-Z]{2,}))$/
             */
        }
    }
}
