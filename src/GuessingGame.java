import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessingGame extends JFrame{
   int Randomnum,guess;
   private JButton button;
   private JLabel label;
   private JTextField textfield;
   private JLabel promptlabel;
   private JLabel resultlabel;
   private JLabel randomlabel;
   
   public GuessingGame(){
     setLayout(new FlowLayout()); 
     
       promptlabel=new JLabel("enter a random number from 1-100");
       add(promptlabel);
       
       textfield=new JTextField(5);
       add(textfield);
       
       button=new JButton ("guess!!!");
       add(button);
       
       resultlabel=new JLabel("");
       add(resultlabel);
       
       randomlabel=new JLabel("");
       add(randomlabel);
       
       events s =new events();
       button.addActionListener(s);
       
       
   }
 public class events implements ActionListener{
    public void actionPerformed(ActionEvent s){
       Randomnum=(int)(Math.random()*100+1);
       try{
        guess=(int)(Double.parseDouble(textfield.getText()));
        if(guess==Randomnum){
          resultlabel.setText("CONGRATULATIONS!!!you won the game!!!");
        }
        else if(guess!=Randomnum){
           resultlabel.setText("am sorry AZUBUIKE SOPURUCHUKWU,but you lost the game");
        }
         randomlabel.setText("the random number generated was"+Randomnum);
       }
        catch(Exception ex){
            randomlabel.setText("please enter numbers only");
        }  
       
    }  
 }    
   public static void main (String args[]){
     GuessingGame gg= new GuessingGame();
     gg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gg.setVisible(true);
     gg.setSize(300,200);
     gg.setTitle("guessing game programme");
     
   }
       
        
    
}
