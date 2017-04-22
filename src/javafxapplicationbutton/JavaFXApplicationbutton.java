/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationbutton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 *
 * @author Jorgesys
 */
public class JavaFXApplicationbutton extends Application {
  static JFrame frame;

  public static void main(String[] args)
  {
    // schedule this for the event dispatch thread (edt)
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        displayJFrame();
      }
    });
  }

  static void displayJFrame()
  {
    frame = new JFrame("Rounded button example");

    // create our jbutton
    JButton myButton = new JButton("my button");
    myButton.setBorder(new RoundedBorder(40)); //Define radius of 40
    myButton.setForeground(Color.BLUE);

    // put the button on the frame
    frame.getContentPane().setLayout(new FlowLayout());
    frame.add(myButton);

    // set up the jframe, then display it
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(300, 200));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}