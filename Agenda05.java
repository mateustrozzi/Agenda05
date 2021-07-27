package agenda05;

import javax.swing.JOptionPane;

/**
 * 15/03/2021
 * @author Mateus
 */
public class Agenda05 {
    
    public static void main(String[] args) {
        String aux;
        int idade;
        aux = JOptionPane.showInputDialog("Entre com sua idade:");
        idade = Integer.parseInt(aux);

        if (idade >= 60){
            if(idade >79){
                JOptionPane.showMessageDialog(null, "Fila 80+");
            }else{
                JOptionPane.showMessageDialog(null, "Fila preferrencial");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Fila Comum");  
        }
}
}

