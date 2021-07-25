package homeScreen;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelHistory extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHistory() {
		
		setBounds(0, 0, 604, 558);
		setLayout(null);
		
		JLabel lblHistoria = new JLabel("HISTORIA");
		lblHistoria.setFont(new Font("Verdana", Font.BOLD, 24));
		lblHistoria.setBounds(182, 233, 183, 60);
		add(lblHistoria);

	}

}
