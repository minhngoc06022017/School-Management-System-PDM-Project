/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testframe;

import javax.swing.JFrame;

/**
 *
 * @author TripleB
 */
public class TestFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        test t = new test();
        t.setVisible(true);
        t.setResizable(false);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
