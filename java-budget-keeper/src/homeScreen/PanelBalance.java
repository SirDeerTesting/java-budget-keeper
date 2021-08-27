package homeScreen;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class PanelBalance extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelBalance() {
		setBackground(Color.ORANGE);
		
		setBounds(0, 0, 604, 558);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BILANS");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		lblNewLabel.setBounds(184, 225, 183, 60);
		add(lblNewLabel);

	}

}
