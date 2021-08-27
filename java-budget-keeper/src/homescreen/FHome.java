package homescreen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

import loginscreen.FLoginScreen;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import java.awt.event.MouseMotionAdapter;

@SuppressWarnings("serial")
public class FHome extends JFrame {
	
	//TEST BRANCH
	
	private Image img_balanceIcon = new ImageIcon(FLoginScreen.class.getResource("/design/balanceIcon.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);
	private Image img_addIcon = new ImageIcon(FLoginScreen.class.getResource("/design/addIcon.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);
	private Image img_historyIcon = new ImageIcon(FLoginScreen.class.getResource("/design/historyIcon.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);
	private Image img_recurringIcon = new ImageIcon(FLoginScreen.class.getResource("/design/recurringIcon.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	
	private PanelBalance panelBalance;
	private PanelAdd panelAdd;
	private PanelHistory panelHistory;
	private PanelRecurring panelRecurring;
	
	private int mouseX, mouseY;

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
		setBounds(100, 100, 890, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(43, 122, 91));
		contentPane.setBorder(new LineBorder(new Color(1, 50, 32), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelBalance = new PanelBalance();
		panelBalance.setBounds(0, 0, 614, 558);
		panelAdd = new PanelAdd();
		panelAdd.setBounds(0, 0, 614, 558);
		panelHistory = new PanelHistory();
		panelHistory.setBounds(0, 0, 614, 558);
		panelRecurring = new PanelRecurring();
		panelRecurring.setBounds(0, 0, 614, 558);
		
		JPanel PnlMenu = new JPanel();
		PnlMenu.setBounds(2, 29, 254, 549);
		PnlMenu.setBackground(new Color(37, 107, 80));
		contentPane.add(PnlMenu);
		PnlMenu.setLayout(null);
		
		JPanel PnlBalance = new JPanel();
		PnlBalance.addMouseListener(new PanelButtonMouseAdapter(PnlBalance) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelBalance);
			}
		});
		PnlBalance.setBounds(0, 65, 256, 64);
		PnlMenu.add(PnlBalance);
		PnlBalance.setBackground(new Color(47, 79, 79));
		PnlBalance.setLayout(null);
		
		JLabel lblBalance = new JLabel("Bilans");
		lblBalance.setForeground(new Color(255, 255, 255));
		lblBalance.setHorizontalAlignment(SwingConstants.LEFT);
		lblBalance.setBounds(78, 11, 168, 42);
		PnlBalance.add(lblBalance);
		lblBalance.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lbliconBalance = new JLabel("");
		lbliconBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lbliconBalance.setBounds(10, 11, 58, 42);
		PnlBalance.add(lbliconBalance);
		lbliconBalance.setIcon(new ImageIcon(img_balanceIcon));
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setBounds(0, 140, 256, 20);
		PnlMenu.add(rigidArea);
		
		JPanel PnlAdd = new JPanel();
		PnlAdd.addMouseListener(new PanelButtonMouseAdapter(PnlAdd) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAdd);
			}
		});
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
		lbliconAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lbliconAdd.setBounds(10, 11, 58, 42);
		PnlAdd.add(lbliconAdd);
		lbliconAdd.setIcon(new ImageIcon(img_addIcon));
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1.setBounds(0, 246, 256, 20);
		PnlMenu.add(rigidArea_1);
		
		JPanel PnlHistory = new JPanel();
		PnlHistory.addMouseListener(new PanelButtonMouseAdapter(PnlHistory) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHistory);
			}
		});
		PnlHistory.setBounds(0, 277, 256, 64);
		PnlMenu.add(PnlHistory);
		PnlHistory.setBackground(new Color(47, 79, 79));
		PnlHistory.setLayout(null);
		
		JLabel lblHistory = new JLabel("Historia");
		lblHistory.setForeground(new Color(255, 255, 255));
		lblHistory.setHorizontalAlignment(SwingConstants.LEFT);
		lblHistory.setFont(new Font("Arial", Font.BOLD, 14));
		lblHistory.setBounds(78, 11, 168, 42);
		PnlHistory.add(lblHistory);
		
		JLabel lbliconHistory = new JLabel("");
		lbliconHistory.setHorizontalAlignment(SwingConstants.CENTER);
		lbliconHistory.setBounds(10, 11, 58, 42);
		PnlHistory.add(lbliconHistory);
		lbliconHistory.setIcon(new ImageIcon(img_historyIcon));
		
		Component rigidArea_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1_1.setBounds(0, 352, 256, 20);
		PnlMenu.add(rigidArea_1_1);
		
		JPanel PnlRecurringTransactions = new JPanel();
		PnlRecurringTransactions.addMouseListener(new PanelButtonMouseAdapter(PnlRecurringTransactions) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelRecurring);
			}
		});
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
		lbliconRecurring.setHorizontalAlignment(SwingConstants.CENTER);
		lbliconRecurring.setBounds(10, 11, 58, 42);
		PnlRecurringTransactions.add(lbliconRecurring);
		lbliconRecurring.setIcon(new ImageIcon(img_recurringIcon));
		
		Component rigidArea_1_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1_1_1.setBounds(0, 458, 256, 30);
		PnlMenu.add(rigidArea_1_1_1);
		
		JPanel PnlSignOut = new JPanel();
		PnlSignOut.addMouseListener(
				new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(JOptionPane.showConfirmDialog(null, "Czy na pewno chcesz si\u0119 wylogowa\u0107?") == 0) {
							FLoginScreen fLoginScreen = new FLoginScreen();
							fLoginScreen.setVisible(true);
							FHome.this.dispose();
						}
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						PnlSignOut.setBackground(new Color(0, 204, 204));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						PnlSignOut.setBackground(new Color(0, 139, 139));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						PnlSignOut.setBackground(new Color(131, 233, 232));
					}
					@Override
					public void mouseReleased(MouseEvent e) {
						PnlSignOut.setBackground(new Color(0, 204, 204));
					}
					
			});
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
		
		JLabel lblX_close = new JLabel("X");
		lblX_close.addMouseListener(
			new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(JOptionPane.showConfirmDialog(null, "Czy na pewno chcesz zamkn\u0105\u0107 t\u0105 aplikacj\u0119?", "Potwierdzenie", JOptionPane.YES_NO_OPTION) == 0)
						FHome.this.dispose();
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
		lblX_close.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_close.setForeground(new Color(139, 0, 0));
		lblX_close.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblX_close.setBorder(null);
		lblX_close.setBounds(870, 2, 20, 20);
		contentPane.add(lblX_close);
		
		JPanel PanelMainContent = new JPanel();
		PanelMainContent.setBounds(266, 29, 614, 540);
		contentPane.add(PanelMainContent);
		PanelMainContent.setLayout(null);
		
		PanelMainContent.add(panelBalance);
		PanelMainContent.add(panelAdd);
		PanelMainContent.add(panelHistory);
		PanelMainContent.add(panelRecurring);
		
		menuClicked(panelBalance);
		
		JPanel PnlDraggable = new JPanel();
		PnlDraggable.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				FHome.this.setLocation(FHome.this.getX() + e.getX() - mouseX, FHome.this.getY() + e.getY() - mouseY);
			}
		});
		PnlDraggable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		
		PnlDraggable.setBounds(2, 2, 888, 22);
		PnlDraggable.setBackground(new Color(1, 50, 32));
		contentPane.add(PnlDraggable);
	}
	
	public void menuClicked(JPanel panel) {
		panelBalance.setVisible(false);
		panelAdd.setVisible(false);
		panelHistory.setVisible(false);
		panelRecurring.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(47, 79, 79));
		}
		
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(115, 171, 171));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
		
	}
}
