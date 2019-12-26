import javax.swing.JFrame;

public class GUIPROJECT  extends JFrame{
    public static void main(String[]args){
        GUIPROJECT gui= new GUIPROJECT();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(100,100);
        gui.setTitle("First GUI");
        
    }
    
}
