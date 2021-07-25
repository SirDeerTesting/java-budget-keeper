package loginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import homeScreen.FHome;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FLoginScreen extends JFrame {
	
	private Image img_loginLogo = new ImageIcon(FLoginScreen.class.getResource("/design/iconLogin.png")).getImage().getScaledInstance(180, 135, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	private JLabel lblLoginMessage = new JLabel("");

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
		pnlUsername.setBounds(300, 97, 237, 39);
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
		pnlPassword.setBounds(300, 147, 237, 39);
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
		pnlLogin.addMouseListener(
			new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(txtUsername.getText().equals("admin") && pwdPassword.getText().equals("admin")) {
						lblLoginMessage.setText("");
						JOptionPane.showMessageDialog(null, "Witaj!");
						FHome fHome = new FHome();
						fHome.setVisible(true);
						FLoginScreen.this.dispose();
					}
					else if(txtUsername.getText().equals("") || pwdPassword.getText().equals("")){
						lblLoginMessage.setText("Prosz\u0119 uzupe\u0142ni\u0107 wszystkie pola.");
					}
					else {
						lblLoginMessage.setText("Niepoprawny login lub has\u0142o.");
					}
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					pnlLogin.setBackground(new Color(27, 77, 58));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					pnlLogin.setBackground(new Color(13, 60, 42));
				}
				@Override
				public void mousePressed(MouseEvent e) {
					pnlLogin.setBackground(new Color(13, 60, 42));
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					pnlLogin.setBackground(new Color(27, 77, 58));
				}
		});
		pnlLogin.setBackground(new Color(13, 60, 42));
		pnlLogin.setBounds(366, 197, 104, 35);
		contentPane.add(pnlLogin);
		pnlLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("Zaloguj");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setBounds(30, 11, 41, 14);
		pnlLogin.add(lblLogin);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblLoginIcon = new JLabel("");
		lblLoginIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginIcon.setBounds(76, 52, 180, 180);
		contentPane.add(lblLoginIcon);
		lblLoginIcon.setIcon(new ImageIcon(img_loginLogo));
		
		JLabel lblX_close = new JLabel("X");
		lblX_close.addMouseListener(
			new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(JOptionPane.showConfirmDialog(null, "Czy na pewno chcesz zamkn\u0105\u0107 t\u0105 aplikacj\u0119?", "Potwierdzenie", JOptionPane.YES_NO_OPTION) == 0)
						FLoginScreen.this.dispose();
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					lblX_close.setForeground(Color.RED);
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					lblX_close.setForeground(new Color(139, 0, 0));
				}
		});
		lblX_close.setBorder(null);
		lblX_close.setForeground(new Color(139, 0, 0));
		lblX_close.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblX_close.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_close.setBounds(570, 10, 20, 20);
		contentPane.add(lblX_close);
		
		lblLoginMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginMessage.setForeground(new Color(139, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.BOLD, 13));
		lblLoginMessage.setBounds(300, 67, 237, 20);
		contentPane.add(lblLoginMessage);
		setLocationRelativeTo(null);
	}
}
