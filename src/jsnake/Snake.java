package jsnake;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author joomlah
 */
public class Snake extends JFrame {

    public Snake() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("JSnake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                JFrame snek = new Snake();
                snek.setVisible(true);
            }
        });
    }
    
}
