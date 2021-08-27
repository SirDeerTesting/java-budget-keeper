package homescreen;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class PanelHistory extends JPanel {
	
	private static JTable table;

	/**
	 * Create the panel.
	 */
	public PanelHistory() {
		setBackground(Color.CYAN);
		
		setBounds(0, 0, 604, 558);
		setLayout(null);
		
		JLabel lblHistoria = new JLabel("HISTORIA");
		lblHistoria.setFont(new Font("Verdana", Font.BOLD, 24));
		lblHistoria.setBounds(182, 233, 183, 60);
		add(lblHistoria);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 614, 558);
		add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 604, 558);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 614, 558);
		panel.add(scrollPane);
		scrollPane.setViewportView(table);
	}
	
	public static JTable returnTable() {
		JTable jTable = table;
		return jTable;
	}
}
