import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir 2 numeros y decir cual es mayor o si son iguales
         */
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2: "));

        if (num1 == num2){
            JOptionPane.showMessageDialog(null,"Los numeros son iguales");
        } else if (num1 > num2) {
            JOptionPane.showMessageDialog(null,"El numero 1 es mayor");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero 2 es mayor");
        }
    }
}