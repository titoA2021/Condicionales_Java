import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Hacer un programa que lea un número entero y muestre si el número es multiplo de 10
         */
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if ((num%10) == 0){
            JOptionPane.showMessageDialog(null, " EL numero es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10");
        }

    }
}