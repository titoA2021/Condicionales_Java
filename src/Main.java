import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Condicional if
        /*if(condicion){
            Instrucción;
        }
        else{
            Instrucción2;
        }
         */
        int numero, dato = 5;
        //COn joptionpane
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }

    }
}