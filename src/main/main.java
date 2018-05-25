/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import GUI.ventana;
import javax.swing.JFrame;

/**
 *
 * @author LN710Q
 */
public class main {
      public static void main(String[] args) {
          JFrame ventana = new JFrame("CALCU CHIDORI V1.0");
          ventana.setContentPane(new ventana());
          ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          ventana.setResizable(false);
          ventana.pack();
          ventana.setVisible(true);
        
    }
    
}
