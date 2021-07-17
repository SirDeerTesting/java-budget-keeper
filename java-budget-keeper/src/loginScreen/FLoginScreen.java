package loginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class FLoginScreen extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FLoginScreen frame = new FLoginScreen();
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
	public FLoginScreen() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(43, 122, 91));
		contentPane.setBorder(new LineBorder(new Color(1, 50, 32), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlUsername = new JPanel();
		pnlUsername.setBounds(300, 80, 237, 39);
		contentPane.add(pnlUsername);
		pnlUsername.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(69, 11, 158, 20);
		pnlUsername.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Login : ");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Arial", Font.BOLD, 12));
		lblUsername.setBounds(13, 14, 46, 14);
		pnlUsername.add(lblUsername);
		
		JPanel pnlPassword = new JPanel();
		pnlPassword.setBounds(300, 130, 237, 39);
		contentPane.add(pnlPassword);
		pnlPassword.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(68, 11, 159, 20);
		pnlPassword.add(pwdPassword);
		
		JLabel lblHaso = new JLabel("Has\u0142o : ");
		lblHaso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHaso.setFont(new Font("Arial", Font.BOLD, 12));
		lblHaso.setBounds(12, 14, 46, 14);
		pnlPassword.add(lblHaso);
		
		JPanel pnlLogin = new JPanel();
		pnlLogin.setBackground(new Color(13, 60, 42));
		pnlLogin.setBounds(366, 180, 104, 35);
		contentPane.add(pnlLogin);
		pnlLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("Zaloguj");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setBounds(30, 11, 41, 14);
		pnlLogin.add(lblLogin);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		setLocationRelativeTo(null);
	}
}
