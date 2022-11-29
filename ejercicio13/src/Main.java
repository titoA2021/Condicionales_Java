import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Hacer un programa que simula un cajero automatico con un saldo inicial de 1000 dolares
        1- Ingresar dinero a la cuenta
        2- Retirar dinero de la cuenta
        3- Salir
         */

        final int sIni = 1000;
        float ingresar, retirar, saldoTtoal;
        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción: " +
                 "\n1. Ingresar dinero" +
                 "\n2. Retirar dinero" +
                 "\n3. Salir"));

        switch (opcion){
            case 1: ingresar = Float.parseFloat(JOptionPane.showInputDialog("Cuanto dinero desea ingresar: "));
                    saldoTtoal = sIni + ingresar;
                    JOptionPane.showMessageDialog(null, "El saldo total es de: " + saldoTtoal + " dolares");
                    break;
            case 2: retirar = Float.parseFloat(JOptionPane.showInputDialog("Cuanto dinero desea retirar: "));
                    if (retirar <= sIni) {
                        saldoTtoal = sIni - retirar;
                        JOptionPane.showMessageDialog(null, "El saldo total es de : " + saldoTtoal + " dolares");
                    }else {
                        JOptionPane.showMessageDialog(null, "No puedes retirar esta cantidad de dinero");
                    }
                    break;
            case 3: JOptionPane.showMessageDialog(null, "El saldo total es de: " + sIni + " dolares");
                    break;
            default: JOptionPane.showMessageDialog(null, "Ingrese una opción correcta");

        }

    }
}