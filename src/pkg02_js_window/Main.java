/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_js_window;

import javax.swing.*;

/**
 *
 * @author mhcrnl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Java Swing Frame");
        
        JButton click = new JButton("Click here!");
        
        click.setBounds(130,100,120,60);
        
        frame.add(click);
        
        frame.setSize(450,650);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
