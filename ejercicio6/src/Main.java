import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Hacer un programa que tome dos numeros y diga si ambos son pares o impares
         */

        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2: "));

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero 1 y el numero 2 son pares");
        } else if (num1 % 2 != 0 && num2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero 1 es impar y el numero 2 es par");
        } else if (num1 % 2 == 0 && num2 % 2 != 0) {
            JOptionPane.showMessageDialog(null, "El numero 1 es par y el numero 2 es impar");
        } else {
            JOptionPane.showMessageDialog(null, "El numero 1 y el numero 2 son impares");
        }
    }
}