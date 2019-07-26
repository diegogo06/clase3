package main;

import static entidades.Mensajes.*;
import entidades.empleados.Salario;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

   public static void main(String[] args)
   {
      DecimalFormat formateador = new DecimalFormat("###,###.##");
      Salario  salario = new Salario();

      String horas = JOptionPane.showInputDialog(null,MENSAJE_PETICION_HORAS.getMensajes());


      String valorHora = JOptionPane.showInputDialog(null,MENSAJE_PETICION_VALOR_HORA.getMensajes());

      salario.setHorasTrabajadas(Double.parseDouble(horas));
      salario.setValorHora(Double.parseDouble(valorHora));
      JOptionPane.showMessageDialog(null,MENSAJE_RESPUESTA.getMensajes() + formateador.format(salario.calcularSalario()));

   }

}
