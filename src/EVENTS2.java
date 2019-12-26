import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EVENTS2 extends JFrame {
    private JButton button;
    private JLabel label;
     
    public EVENTS2(){
        
        setLayout(new FlowLayout());
        button=new JButton("click here for text");
        add(button);
        
        label=new JLabel("");
        add(label);
        
        events es = new events();
        button.addActionListener(es);
        
        
    }
    public class events implements ActionListener{
      public void actionPerformed (ActionEvent es){
         label.setText("now you can see words here");
        
      } 
        
    
    
}
   public static void main(String Args[]){
      EVENTS et= new EVENTS();
       et.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       et.setVisible(true);
       et.setSize(300,200);
       et.setTitle("events programme");
       
       
   }
    
}
