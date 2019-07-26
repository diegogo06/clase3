package main;


import javax.swing.*;

import static enumerados.Constantes.*;
import static enumerados.Valores.DOLAR;

public class Main {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog(null, "ingresa un valor");
        int val = Integer.parseInt(valor);
        if(val >= DOLAR.getValor())
        {JOptionPane.showMessageDialog(null,MENSAJE_DOLAR_ALTO.getMensaje());     }

        else {JOptionPane.showMessageDialog(null,MENSAJE_DOLAR_BAJO.getMensaje()); }



        JOptionPane.showMessageDialog(null, MENSAJE_CUADRO.getMensaje(), MENSAJE_TITULO.getMensaje(), JOptionPane.INFORMATION_MESSAGE);

    }


}
