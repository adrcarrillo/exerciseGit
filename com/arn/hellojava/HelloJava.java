package com.arn.hellojava;

import javax.swing.*;

/**
 * A bare bones graphical version of Hello World.
 */
public class HelloJava {
    public static void main( String[] args ) {
        JFrame frame = new JFrame( "Hello, Java!" );
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
        frame.add(label);

        //Added
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}
