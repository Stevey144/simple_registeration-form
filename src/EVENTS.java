import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EVENTS extends JFrame {
  private JButton button1;
  private JButton button2;
  private JLabel label1;
  private JLabel  label2;
  private int x=0,y=0;

    public EVENTS(){
        setLayout(new FlowLayout());
        button1=new JButton("click here for text");
         add(button1);
         
        label1=new JLabel("");
        add(label1);
        
        button2=new JButton("for more text click me!!!");
        add(button2);
        
        label2=new JLabel("");
        add(label2);
        
        event e=new event();
        button1.addActionListener(e);
        
        event2 et = new event2();
        button2.addActionListener(et);
        
    }
   public class event implements ActionListener{
       public void actionPerformed(ActionEvent e){
           if (x==0){
            label1.setText("now you can see words here");
          x=1;}
           else if(x==1){
           label1.setText("");  
          x=0;
           }
       }
   }
public class event2 implements ActionListener{
    public void actionPerformed(ActionEvent et){
       if(y==0){ 
           label2.setText("i am label 2");
           y=1;}
       else if(y==1){
           label2.setText("");
           y=0;
       }
    }
}   
    public static void main (String args[]){
    EVENTS ev = new EVENTS();
    ev.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ev.setVisible(true);
    ev.setSize(300,200);
    ev.setTitle("events programe");
            
   }
       
    
   }
