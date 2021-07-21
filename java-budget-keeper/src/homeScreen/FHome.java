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
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

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
		
		JPanel PnlHome = new JPanel();
		PnlHome.setBounds(0, 65, 256, 64);
		PnlMenu.add(PnlHome);
		PnlHome.setBackground(new Color(47, 79, 79));
		PnlHome.setLayout(null);
		
		JLabel lblHome = new JLabel("Strona G\u0142\u00F3wna");
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblHome.setBounds(78, 11, 168, 42);
		PnlHome.add(lblHome);
		lblHome.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lbliconHome = new JLabel("");
		lbliconHome.setBounds(10, 11, 58, 42);
		PnlHome.add(lbliconHome);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setBounds(0, 140, 256, 20);
		PnlMenu.add(rigidArea);
		
		JPanel PnlAdd = new JPanel();
		PnlAdd.setBounds(0, 171, 256, 64);
		PnlMenu.add(PnlAdd);
		PnlAdd.setBackground(new Color(47, 79, 79));
		PnlAdd.setLayout(null);
		
		JLabel lblAdd = new JLabel("Wydatki i Przychody");
		lblAdd.setForeground(new Color(255, 255, 255));
		lblAdd.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdd.setFont(new Font("Arial", Font.BOLD, 14));
		lblAdd.setBounds(78, 11, 168, 42);
		PnlAdd.add(lblAdd);
		
		JLabel lbliconAdd = new JLabel("");
		lbliconAdd.setBounds(10, 11, 58, 42);
		PnlAdd.add(lbliconAdd);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1.setBounds(0, 246, 256, 20);
		PnlMenu.add(rigidArea_1);
		
		JPanel PnlHistory = new JPanel();
		PnlHistory.setBounds(0, 277, 256, 64);
		PnlMenu.add(PnlHistory);
		PnlHistory.setBackground(new Color(47, 79, 79));
		PnlHistory.setLayout(null);
		
		JLabel lblHistory = new JLabel("HIstoria");
		lblHistory.setForeground(new Color(255, 255, 255));
		lblHistory.setHorizontalAlignment(SwingConstants.LEFT);
		lblHistory.setFont(new Font("Arial", Font.BOLD, 14));
		lblHistory.setBounds(78, 11, 168, 42);
		PnlHistory.add(lblHistory);
		
		JLabel lbliconHistory = new JLabel("");
		lbliconHistory.setBounds(10, 11, 58, 42);
		PnlHistory.add(lbliconHistory);
		
		Component rigidArea_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1_1.setBounds(0, 352, 256, 20);
		PnlMenu.add(rigidArea_1_1);
		
		JPanel PnlRecurringTransactions = new JPanel();
		PnlRecurringTransactions.setBounds(0, 383, 256, 64);
		PnlMenu.add(PnlRecurringTransactions);
		PnlRecurringTransactions.setBackground(new Color(47, 79, 79));
		PnlRecurringTransactions.setLayout(null);
		
		JLabel lblRecurring = new JLabel("Transakcje Cykliczne");
		lblRecurring.setForeground(new Color(255, 255, 255));
		lblRecurring.setHorizontalAlignment(SwingConstants.LEFT);
		lblRecurring.setFont(new Font("Arial", Font.BOLD, 14));
		lblRecurring.setBounds(78, 11, 168, 42);
		PnlRecurringTransactions.add(lblRecurring);
		
		JLabel lbliconRecurring = new JLabel("");
		lbliconRecurring.setBounds(10, 11, 58, 42);
		PnlRecurringTransactions.add(lbliconRecurring);
		
		Component rigidArea_1_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1_1_1.setBounds(0, 458, 256, 30);
		PnlMenu.add(rigidArea_1_1_1);
		
		JPanel PnlSignOut = new JPanel();
		PnlSignOut.setBounds(0, 499, 256, 39);
		PnlMenu.add(PnlSignOut);
		PnlSignOut.setBackground(new Color(0, 139, 139));
		PnlSignOut.setLayout(null);
		
		JLabel lblSignOut = new JLabel("Wyloguj");
		lblSignOut.setForeground(new Color(255, 255, 255));
		lblSignOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignOut.setFont(new Font("Arial", Font.BOLD, 14));
		lblSignOut.setBounds(10, 0, 236, 39);
		PnlSignOut.add(lblSignOut);
		
		Component rigidArea_1_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1_2.setBounds(0, 549, 256, 20);
		PnlMenu.add(rigidArea_1_2);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
	}
		
		
		@Override
		public void mousePressed(MouseEvent e) {
	}
		
		@Override
		public void mouseReleased(MouseEvent e) {
	}
		
		
}
