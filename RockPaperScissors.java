/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package rock.paper.scissors;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Random;



/**
 *
 * @author Brandon
 */
public class RockPaperScissors extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    public static class ClickListener implements ActionListener
        {
       @Override public void actionPerformed(ActionEvent event)
            {
            System.out.println("You chose Rock");
            Random dice = new Random();
            int Number = 1 + dice.nextInt(3);
     
            if(Number==1)
            {
            System.out.println("Computer chose Rock.");
            System.out.println("Its a tie.");
            }
            else if(Number==2)
            {
                System.out.println("Computer chose Paper");
                System.out.println("You Lose!");
            }
            else
            {
                System.out.println("Computer chose Scissors.");
                System.out.println("You win!");
            }
            }
       
        }
    public static class ClickListener2 implements ActionListener
        {
       @Override public void actionPerformed(ActionEvent event)
            {
            System.out.println("You chose Paper");
            Random dice = new Random();
            int Number = 1 + dice.nextInt(3);
            if(Number==1)
            {
            System.out.println("Computer chose Rock.");
            System.out.println("You win.");
            }
            else if(Number==2)
            {
                System.out.println("Computer chose Paper");
                System.out.println("its a tie!");
            }
            else
            {
                System.out.println("Computer chose Scissors.");
                System.out.println("You lose!");
            }
            }
        }
    public static class ClickListener3 implements ActionListener
        {
       @Override public void actionPerformed(ActionEvent event)
            {
            System.out.println("You chose Scissors");
            Random dice = new Random();
            int Number = 1 + dice.nextInt(3);
            if(Number==1)
            {
            System.out.println("Computer chose Rock.");
            System.out.println("you lose.");
            }
            else if(Number==2)
            {
                System.out.println("Computer chose Paper");
                System.out.println("You win!");
            }
            else
            {
                System.out.println("Computer chose Scissors.");
                System.out.println("its a tie!");
            }
            }
        }


    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Enter Your Name.");
        //Scanner Input = new Scanner(System.in);  
  
         
            
          
        JFrame frame = new JFrame(); 
        
      
       
        
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Click for Rock");
   
        JButton button2 = new JButton("Click for Paper");
        JButton button3 = new JButton("Click for Scissors");
        
   
   
        button1.addActionListener(null);
        panel.setLayout(new GridLayout(3, 3));
        
        ClickListener MyListener = new ClickListener();
        ClickListener2 MySecondListener = new ClickListener2();
        ClickListener3 MyThirdListener = new ClickListener3();
       
        button1.addActionListener(MyListener);
        button2.addActionListener(MySecondListener);
        button3.addActionListener(MyThirdListener);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.add(panel);

        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400; 
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT); 
        frame.setTitle("ROCK PAPER SCISSORS"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 


        
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

 