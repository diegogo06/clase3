package constantes;

public enum TemperaturaStrings {

    MENSAJE_PETICION_GRADOS("ingrese temperatura en centigrados a convertir en farenheit"),
    MENSAJE_CONVERSION("la conversion de "),
    MENSAJE_CENTIGRADOR_FARENHEIT("°c a farenheit es "),
    MENSAJE_FARENHEIT("°F");

    private String mensaje;

    TemperaturaStrings(String i) {
        this.mensaje = i;
    }
    public String getMensaje() {
        return mensaje;

}
}