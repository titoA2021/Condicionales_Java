import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        En megaplaza se hace un 20% de descuento a los clientes cuya compra supere los $300.
        ¿cual será la cantidad que pagara una persona por su compra?
         */

        int valorCompra;
        valorCompra = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la compra: "));

        if (valorCompra > 300){
            valorCompra -= valorCompra*0.2;
            JOptionPane.showMessageDialog(null,"el valor a pagar es: " + valorCompra);
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor a pagar es: " + valorCompra);
        }
    }
}