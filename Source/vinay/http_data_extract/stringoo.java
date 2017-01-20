//package com.robustest.plugin;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by krishnav1 on 30-09-2016.
 */
public class stringoo  {
   private static String longMessage = "asfasfd";
    public static void main(String[] args)
    {
            // create a JTextArea
            JTextArea textArea = new JTextArea(30, 50);
            textArea.setText(longMessage);
            textArea.setEditable(false);
            textArea.setFont(new Font("Serif",Font.PLAIN,30));
            // wrap a scrollpane around it
            JScrollPane scrollPane = new JScrollPane(textArea);

            // display them in a message dialog
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog( frame,scrollPane);
        }

}
