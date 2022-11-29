import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene
         */

        int num, aux=1;
        num = Integer.parseInt((JOptionPane.showInputDialog("Digite un numero entre 0 y 99 999")));

        if ((aux*10)>num){
            JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
        } else if ((aux*100)>num) {
            JOptionPane.showMessageDialog(null,"El numero tiene 2 cifras");
        }else if ((aux*1000)>num) {
            JOptionPane.showMessageDialog(null,"El numero tiene 3 cifras");
        }else if ((aux*10000)>num) {
            JOptionPane.showMessageDialog(null,"El numero tiene 4 cifras");
        }else if ((aux*100000)>num) {
            JOptionPane.showMessageDialog(null,"El numero tiene 5 cifras");
        }else{
            JOptionPane.showMessageDialog(null,"El numero está fuera de rango");
        }
    }
}