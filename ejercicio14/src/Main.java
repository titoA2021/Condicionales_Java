import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con ls opciones posibles
         */

        float num;
        int op;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero en kg a convertir: "));
        op = Integer.parseInt(JOptionPane.showInputDialog("seleccione a que unidad quiere convertir: " +
                "\n1. Hectograma" +
                "\n2. Decagramo" +
                "\n3. Gramo" +
                "\n4. Decigramo" +
                "\n5. Centigramo" +
                "\n6. Miligramo"));
        if (num > 0) {
            switch (op) {
                case 1:
                    num = num / 10;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + num + " Hectrogramos");
                    break;
                case 2:
                    num = num / 100;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + num + " Decagramos");
                    break;
                case 3:
                    num = num / 1000;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + num + " gramos");
                    break;
                case 4:
                    num = num / 10000;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + num + " centigramos");
                    break;
                case 5:
                    num = num / 100000;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + num + " decigramos");
                    break;
                case 6:
                    num = num / 1000000;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + num + " miligramos");
                    break;
                default: JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                break;
            }
        }else {
            JOptionPane.showMessageDialog(null, "ingrese un numero distinto de 0");
        }

    }
}