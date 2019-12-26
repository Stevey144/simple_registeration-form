
import java.awt.*;
import javax.swing.*;

public class GUIPROJECT3 extends JFrame {
private ImageIcon image1;
private JLabel  Label1;
private ImageIcon image2;
private JLabel  Label2;

//this is where we manipulate the variables in the class
public GUIPROJECT3(){
  setLayout(new FlowLayout());
  image1=new ImageIcon(getClass().getResource("uche pics 009.JPG"));
  
  Label1= new JLabel(image1);
  add(Label1);
  
  image2= new ImageIcon(getClass().getResource("uche pics 315.JPG"));
  
  Label2= new JLabel(image2);
  add(Label2);
}
public static void main(String []args){
  GUIPROJECT3 gui=new GUIPROJECT3();
  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  gui.setVisible(true);
   gui.pack();
   gui.setTitle("FIRST GUI PROJECT");
 
}
 
    
    
}
