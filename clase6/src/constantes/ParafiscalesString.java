package constantes;

public enum ParafiscalesString {

    SOLICITUD_NOMBRE("ingresa el nombre del empleado "),
    SOLICITUD_SALARIO("ingresa el salario "),
   EMPLEADO("Empleado: "),
    SALARIO_BASE("su salario base es $"),
    DESCUENTO_PEN("su descuento de pensiones es $ "),
    DESCUENTO_SAL("su descuento de salud es $ "),
    SALARIO_FINAL("su salario final es $ ");

    private String mensaje;

    ParafiscalesString(String s) {

        this.mensaje = s;

    }

    public String getMensaje() {
        return mensaje;
    }
}
