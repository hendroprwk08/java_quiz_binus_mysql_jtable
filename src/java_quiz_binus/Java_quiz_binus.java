
package java_quiz_binus;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Java_quiz_binus {

    public static void main(String[] args) {
        try {
            //tema
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, ex);
        }
        
        Invoice f = new Invoice();
        f.setVisible( true );  
    }
    
}
