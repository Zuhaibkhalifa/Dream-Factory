package jFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel head = new JLabel("Calculator");
		head.setVerticalAlignment(SwingConstants.TOP);
		head.setBackground(Color.YELLOW);
		head.setFont(new Font("Snap ITC", Font.BOLD, 16));
		head.setBounds(178, 11, 99, 22);
		contentPane.add(head);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(70, 60, 46, 14);
		contentPane.add(lblNewLabel);
	}

}
