import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*switch (dato){
            case 1: INstrucciones1;
                    break;
            case 2: Intstrucciones2;
                    break;
        }

         */

        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 y 5: "));

        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "Digite el número 2: ");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Digite el número 3: ");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "Digite el numero 4: ");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "digite el numero 5: ");
                    break;
            default: JOptionPane.showMessageDialog(null, "Digite un numero en el rango dado");
                    break;

        }
    }
}