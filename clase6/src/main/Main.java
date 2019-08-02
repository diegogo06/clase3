package main;
import static constantes.ParafiscalesString.*;
import impuestos.ParafiscalesLogica;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        ParafiscalesLogica parafiscalesLogica = new ParafiscalesLogica();
        String nombre = JOptionPane.showInputDialog(null,SOLICITUD_NOMBRE.getMensaje());
        String salario =JOptionPane.showInputDialog(null,SOLICITUD_SALARIO.getMensaje());

          parafiscalesLogica.setNombre(nombre);

          parafiscalesLogica.setSalario(Double.parseDouble(salario));

          JOptionPane.showMessageDialog(null,EMPLEADO.getMensaje() + parafiscalesLogica.getNombre()+"\n" + SALARIO_BASE.getMensaje() + parafiscalesLogica.getSalario()+"\n"+DESCUENTO_PEN.getMensaje()+parafiscalesLogica.calcularPension()+"\n"+DESCUENTO_SAL.getMensaje() +parafiscalesLogica.calcularsalud()+"\n"+SALARIO_FINAL.getMensaje()+parafiscalesLogica.totalSalario());

    }

}
