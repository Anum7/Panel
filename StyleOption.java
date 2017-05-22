

import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOption{
  public static void main(String[] args){
    JFrame frame = new JFrame("Style Options");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new StyleOptionPanel());
    frame.pack();
    frame.setVisible(true);
  }
}