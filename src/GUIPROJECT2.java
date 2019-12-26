import javax.swing.*;
import java.awt.*;

public class GUIPROJECT2 extends JFrame {
    private JLabel Label;
    private JButton Button;
    private JTextField Textfield;
    public GUIPROJECT2(){
     setLayout(new FlowLayout());  
       Label= new JLabel("hi i am a label");
       add(Label);
       
       Textfield = new JTextField(10);
       add(Textfield);
       
       
         Button= new JButton("press enter");
       add(Button);
        
    }
 
   
        
    
 public static void main(String args[]){
    GUIPROJECT2 gui = new GUIPROJECT2();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setVisible(true);
    gui.setTitle("MY FIRST APP");
    gui.setSize(100,200);
    gui.setBackground(Color.BLACK);
    
  }
  
} 
  

    

