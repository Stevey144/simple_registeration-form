import javax.swing.*;
import java.awt.*;
public class Window extends JFrame {
   private JLabel label;
   private JButton button;
   private JTextField textfield;
   
   
   public Window(){
      setLayout(new FlowLayout());
    label= new JLabel("HI!!!i am a label");
    add(label);
    textfield=new JTextField(5);
    add(textfield);
    button = new JButton("click here to login");
    add(button);
   
   }
 public static void main (String args[]){
    Window ww = new Window();
    //ww.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ww.setVisible(true);
    ww.setSize(200,150);
    ww.pack();
    
    
    
    
    
    
     
 }
   
}
