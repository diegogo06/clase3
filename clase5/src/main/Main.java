package main;


import conversion.LogicaTemperatura;
import conversion.Temperatura;
import static constantes.TemperaturaStrings.*;
import javax.swing.*;

public class Main {

public static void main(String[] args)
{

    LogicaTemperatura temperaturalogica = new LogicaTemperatura();

    String valorTemperatura = JOptionPane.showInputDialog(null,MENSAJE_PETICION_GRADOS.getMensaje());



 temperaturalogica.setCentigrados(Double.parseDouble(valorTemperatura));

 JOptionPane.showMessageDialog(null,MENSAJE_CONVERSION.getMensaje() +temperaturalogica.getCentigrados()+MENSAJE_CENTIGRADOR_FARENHEIT.getMensaje()+temperaturalogica.calcularTemperaturaFarenheit()+MENSAJE_FARENHEIT.getMensaje());

}


}
