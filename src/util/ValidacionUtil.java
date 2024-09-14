package util;

public final class ValidacionUtil {
    //public static final String VALIDACION_NOMBRE_APELLIDO = "^([A-ZÑÁÉÍÓÚ][a-zñáéíóú]*\\s)*([A-ZÑÁÉÍÓÚ][a-zñáéíóú]*)$";

    public static boolean validarNombreApellidos(String nombreApellido) {

        //return nombreApellido.matches(VALIDACION_NOMBRE_APELLIDO);
        String regex = "^([A-ZÑÁÉÍÓÚ][a-zñáéíóú]*\\s)*([A-ZÑÁÉÍÓÚ][a-zñáéíóú]*)$";
        return nombreApellido.matches(regex);
    }
}
