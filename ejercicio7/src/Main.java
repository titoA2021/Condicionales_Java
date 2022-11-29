import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir 3 numeros y mostrarlos ordenados de mayor a menor
         */

        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 2: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 3: "));

        if ((num1 > num2) && (num2 > num3)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + num1 + " -- " + num2 + "-- " + num3);
        } else if ((num1 > num3) && (num3 > num2)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + num1 + " -- " + num3 + "-- " + num2);
        } else if ((num2 > num1) && (num1 > num3)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + num2 + " -- " + num1 + "-- " + num3);
        } else if ((num2 > num3) && (num3 > num1)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + num2 + " -- " + num3 + "-- " + num1);
        } else if ((num3 > num2) && (num2 > num1)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + num3 + " -- " + num2 + "-- " + num1);
        } else if ((num3 > num1) && (num1 > num2)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + num3 + " -- " + num1 + "-- " + num2);
        }
    }
}