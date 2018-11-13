package Example;

import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;

public class JFrameExample {
		static GraphicsConfiguration gc;
	public static void main(String[] args){
		JFrame frame= new JFrame(gc);	
               JPanel main = new JPanel();
               JLabel myLabel = new JLabel();
               myLabel.setText("Java in the Future ");
               main.add(notifyline1);
               frame.add(main)
		frame.setTitle("Basic Demo");
		frame.setSize(600, 400);
		frame.setLocation(200, 200);
		frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}

}
