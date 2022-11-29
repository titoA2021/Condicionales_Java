import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
         */

        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra es mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null, "La letra es minuscula");
        }
    }
}