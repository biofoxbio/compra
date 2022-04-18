/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;
import javax.swing.JOptionPane;

/**
 *
 * @author logonpta
 */
public class Compras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtde_parcelas;
        float compras;
        
        compras = Float.parseFloat(JOptionPane.showInputDialog("entre com i valor das compras"));
        
        qtde_parcelas = Integer.parseInt(JOptionPane.showInputDialog("entre com o numero de parcelas"));
        
        switch(qtde_parcelas){
            case 1:
                JOptionPane.showMessageDialog(null, "valor da de uma parcela: " + compras);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "valor da parcela: " + ((compras * 1.03f)/2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "valor da parcela: " + ((compras * 1.07f)/4));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "opção invalida");
        }
        // TODO code application logic here
    }
    
}
