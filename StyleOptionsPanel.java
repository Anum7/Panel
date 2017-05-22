
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel{
	private JLabel saying, input;
	private JCheckBox bold, italic;
	private JTextField FontSize;
	
	public StyleOptionsPanel(){
	input = new JLabel("What font size do you want? ");
	saying = new JLabel("Say it with style!");
	saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
	
	FontSize = new JTextField(5);
	FontSize.addActionListener(new TempListener());
	add(FontSize);
	add(input);
	setPreferredSize(new Dimension(300, 75));
	setBackground(Color.yellow);
	bold = new JCheckBox("Bold");
	bold.setBackground(Color.cyan);
	italic = new JCheckBox("Italic");
	italic.setBackground(Color.cyan);
	
	StyleListener listener = new StyleListener();
	bold.addItemListener(listener);
	italic.addItemListener(listener);
	
	add(saying);
	add(bold);
	add(italic);
	
	setBackground(Color.cyan);
	setPreferredSize(new Dimension(300, 100));
	
	
	}
	

	private class StyleListener implements ItemListener{
	
		public void itemStateChanged(ItemEvent event)
		{
		int style = Font.PLAIN;
		if (bold.isSelected())
		style = Font.BOLD;
		if (italic.isSelected())
		style += Font.ITALIC;
		saying.setFont(new Font("Helvetica", style, 36));
		}
		}	
	
	
	private class TempListener implements ActionListener{
	public void actionPerformed(ActionEvent event)
	{
	int FontSizeTemp;
	String text = FontSize.getText();
	FontSizeTemp= Integer.parseInt(text);
	saying.setFont(new Font("Helvetica", Font.PLAIN, FontSizeTemp));
	}
	}
	}





