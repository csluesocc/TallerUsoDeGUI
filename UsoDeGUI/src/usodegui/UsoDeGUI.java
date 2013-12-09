
package usodegui;

import javax.swing.JFrame;

/**
 *
 * @author nilson
 */
public class UsoDeGUI {

    
    public static void main(String[] args) {
        
        frmGUI nuevoForm = new frmGUI();
        nuevoForm.setLocationRelativeTo(null);
        nuevoForm.setVisible(true);
        nuevoForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
