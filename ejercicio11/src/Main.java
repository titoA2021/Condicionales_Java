import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       /*
       Construir un programa que simule el funcionamiento de una calculadora ue puede realizar las cuatro operaciones
       aritmeticas basicas, (suma, resta, producto y división

       El usuario debe especificar la operacion con el primer caracter  del primer parametro de la linea de comandos:
       S o s --> suma
       R o r --> resta
       M o m --> multiplicación
       D o d --> división
        */

        int n1, n2, suma, resta, mult, div;
        char operacion;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2: "));
        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar: ").charAt(0);

        switch (operacion){
            case 's':
            case 'S': suma = n1 + n2;
                      JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                      break;
            case 'r':
            case 'R': resta = n1 - n2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'm':
            case 'M': mult = n1 * n2;
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + mult);
                break;
            case 'd':
            case 'D': if (n2 != 0){
                div = n1 / n2;
                JOptionPane.showMessageDialog(null, "La división es: " + div);
            }else{
                JOptionPane.showMessageDialog(null, "El denominador debe ser diferente de 0");
            }
                break;
            default: JOptionPane.showMessageDialog(null, "Ingrese una operación valida");
        }
    }
}