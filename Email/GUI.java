import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JButton btnClick;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 588, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnClick = new JButton("Dame Click");
		btnClick.addActionListener(new Listener());
		
		frame.getContentPane().add(btnClick, BorderLayout.WEST);
	}

	private class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Le di al boton");
		}
	}
}
