package homeScreen;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelRecurring extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelRecurring() {
		
		setSize(604, 558);
		setLayout(null);
		
		JLabel lblTransakcjeCykliczne = new JLabel("TRANSAKCJE CYKLICZNE");
		lblTransakcjeCykliczne.setFont(new Font("Verdana", Font.BOLD, 24));
		lblTransakcjeCykliczne.setBounds(141, 233, 367, 60);
		add(lblTransakcjeCykliczne);

	}

}
