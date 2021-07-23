package homeScreen;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelBalance extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelBalance() {
		
		setSize(604, 558);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BILANS");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		lblNewLabel.setBounds(184, 225, 183, 60);
		add(lblNewLabel);

	}

}
