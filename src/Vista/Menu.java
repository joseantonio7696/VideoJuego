package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

	private JPanel contentPane;
	
	
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
		defineWindows();
		defineEvents();
	}


	private void defineEvents() {
		// TODO Auto-generated method stub
		
	}


	private void defineWindows() {
		// TODO Auto-generated method stub
		
	}

}
