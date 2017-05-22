

import java.util.*;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionPanel extends JPanel{
  
  private JLabel saying, sliders;
  private JCheckBox bold, italic;
 // private JTextField fontSize;
  private JSlider slide;
  //private final int start, finish, initial;
  public int size;
  
  public StyleOptionPanel(){
    saying = new JLabel("Say it with style!");
    saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
    bold = new JCheckBox("Bold");
    bold.setBackground(Color.cyan);
    italic = new JCheckBox("Italic");
    italic.setBackground(Color.cyan);
    sliders = new JLabel("Adjust font size.");
     slide = new JSlider(JSlider.HORIZONTAL, 0, 72, 30);
    
    SliderListener listen = new SliderListener();
    slide.addChangeListener((ChangeListener) listen);
    
    StyleListener listener = new StyleListener();
    bold.addItemListener(listener);
    italic.addItemListener(listener);
    add(saying);
    add(bold);
    add(italic);
    add(sliders);
    add(slide);
    slide.setMajorTickSpacing(50);
    
    slide.setMinorTickSpacing(10);
    slide.setPaintTicks(true);
    slide.setPaintLabels(true);
    setBackground(Color.cyan);
    setPreferredSize(new Dimension(5000, 1500));
  }
  private class SliderListener implements ChangeListener{
     
    public void stateChanged(ChangeEvent event){
      size = slide.getValue();
      sliders.setText("Font size: " + size);
      saying.setFont(new Font("Helvetica", Font.PLAIN, size));
    }
  }
  private class StyleListener implements ItemListener{
    public void itemStateChanged(ItemEvent event){
      int style = Font.PLAIN;
      if (bold.isSelected()){
        style = Font.BOLD;
      }
      if (italic.isSelected()){
        style += Font.ITALIC;
      }    
      saying.setFont(new Font("Helvetica", style, size));
    }
  } 
} 


