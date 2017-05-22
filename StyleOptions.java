
import javax.swing.JFrame;
public class StyleOptions {
	public static void main(String[] args)
	{
	JFrame frame = new JFrame("StyleOptions");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.getContentPane().add(new StyleOptionsPanel());
	frame.pack();
	frame.setVisible(true);
	}
}
