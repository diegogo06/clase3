package entidades;

public enum Mensajes {


    MENSAJE_PETICION_HORAS("ingresa las horas trabajadas."),
    MENSAJE_PETICION_VALOR_HORA("ingresa el valor por hora."),
    MENSAJE_RESPUESTA("el salario a pagar es: $");
    private String mensaje;
    Mensajes(String s) {


        this.mensaje = s;

    }

    public String getMensajes() {
        return mensaje;

    }

}

