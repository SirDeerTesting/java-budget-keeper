package homeScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class FHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FHome frame = new FHome();
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
	public FHome() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(43, 122, 91));
		contentPane.setBorder(new LineBorder(new Color(1, 50, 32), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PnlMenu = new JPanel();
		PnlMenu.setBounds(0, 0, 256, 580);
		PnlMenu.setBackground(new Color(37, 107, 80));
		contentPane.add(PnlMenu);
		PnlMenu.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(10, 373, 236, 64);
		PnlMenu.add(panel_1_2);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1.setBounds(10, 309, 236, 64);
		PnlMenu.add(rigidArea_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 244, 236, 64);
		PnlMenu.add(panel_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setBounds(10, 180, 236, 64);
		PnlMenu.add(rigidArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 116, 236, 64);
		PnlMenu.add(panel);
	}
}
