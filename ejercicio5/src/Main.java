import javax.swing.*;
import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {
        /*
        un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
        --> si trabaja 40 horas o menos se le paga $16/h
        --> si trabaja mas de 40horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora adicional
        */

        int horasTrabajadas, pagoTotal;
        horasTrabajadas = Integer.parseInt((JOptionPane.showInputDialog("Cuantas horas trabaja a la semana: ")));

        if (horasTrabajadas <= 40){
            pagoTotal = horasTrabajadas*16;
            JOptionPane.showMessageDialog(null,"El pago es: " + pagoTotal);
        }
        else{
            pagoTotal = (40*16) + ((horasTrabajadas-40)*20);
            JOptionPane.showMessageDialog(null,"El pago es: " + pagoTotal);
        }


    }

}