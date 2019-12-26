import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class GuessinGame2 extends JFrame {
   int Randomnum,Guess;
   private JLabel promptlabel;
   private JLabel resultlabel;
   private JLabel randomlabel;
   private JLabel label;
   private JButton button;
   private JTextField textfield;
   
   public GuessinGame2(){
       
   setLayout(new FlowLayout());
    promptlabel=new JLabel("enter a number from 1-50");
    add(promptlabel);
    
    textfield=new JTextField(7);
    add(textfield);
    
    button=new JButton("guess");
    add(button);
    
    resultlabel=new JLabel();
    add(resultlabel);
    
    randomlabel=new JLabel();
    add(randomlabel);
    
    Million m = new Million();
    button.addActionListener(m);
   }
  public class Million implements ActionListener{
      public void actionPerformed (ActionEvent m){
        Randomnum=(int)(Math.random()*50+1);
        try{
           Guess= (int)(Double.parseDouble(textfield.getText()));
           if(Randomnum==Guess){
            resultlabel.setText("yess!!you won the game!!");}
            else if(Randomnum!=Guess){
               resultlabel.setText("AM SORRY BUT YOU LOST!!!");
                    }
           randomlabel.setText("THE RANDOMNUMBER GENERATED was "+Randomnum);
           }
        catch(Exception e){
            randomlabel.setText("enter numbers only,thanks");
      }
  }
  }   
  public static void main(String args[]){
     GuessinGame2 gg = new GuessinGame2();
     gg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gg.setTitle("guessing game 2");
     gg.setVisible(true);
     gg.setSize(300,200);
    
     
     
  }     

}  
   
   

