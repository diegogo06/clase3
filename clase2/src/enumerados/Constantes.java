package enumerados;

public enum Constantes {


    MENSAJE_CUADRO("esto es un mensaje"),
    MENSAJE_TITULO("esto es un titulo"),
    MENSAJE_DOLAR_ALTO("EL DOLAR ESTA MUY CARO"),
    MENSAJE_DOLAR_BAJO("EL DOLAR ESTA BAJO");

    private String mensaje;

    Constantes(String s) {
        this.mensaje = s;

    }

    public String getMensaje() {
        return mensaje;
    }
}
