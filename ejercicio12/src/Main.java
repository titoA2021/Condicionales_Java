import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir una nota de 0 a 10 y mostrarla de la forma, Insuficiente, Sufieciente, Bien, Notable y Sobresaliente
         */

        float nota;

        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota de 0 - 10: "));

        if (nota >= 0f && nota <= 2) {
            JOptionPane.showMessageDialog(null, "La nota es Insuficiente");
        } else if (nota > 2 && nota <= 4) {
            JOptionPane.showMessageDialog(null, "La nota es Suficiente");
        } else if (nota > 4 && nota <= 6) {
            JOptionPane.showMessageDialog(null, "La nota es Bien");
        } else if (nota > 6 && nota <= 8) {
            JOptionPane.showMessageDialog(null, "La nota es Notable");
        } else if (nota > 8 && nota <= 10) {
            JOptionPane.showMessageDialog(null, "La nota es Sobresaliente");
        }else {
            JOptionPane.showMessageDialog(null, "Digite una nota en el rango 0-10");
        }
    }
}