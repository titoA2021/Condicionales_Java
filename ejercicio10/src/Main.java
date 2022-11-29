import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta (formato)
        suponiendo que los meses son de 28, 30 y 31 días
         */

        int year, month, day;
        year = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        day = Integer.parseInt(JOptionPane.showInputDialog("Digite el día"));

        if (year != 0){
            if ((month>=1) && (month<13)){
                if (((day>=1) && (day<29)) || ((day>=30) && (day<32))){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }else {
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta por dia");
                }
            }else {
                JOptionPane.showMessageDialog(null,"Fecha incorrecta por mes");
            }
        }else {
            JOptionPane.showMessageDialog(null,"Fecha incorrecta por año");
        }
    }
}