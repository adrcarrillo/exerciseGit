package com.arn.hellojava;


import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;

public class HelloJava {
    public static void main( String[] args ) {

        //Add L&F
        try {
            //Original line
//          UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel( new FlatDarkLaf() );

        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }


        JFrame frame = new JFrame( "Hello, Java!" );
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
        frame.add(label);

        //Added
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}
