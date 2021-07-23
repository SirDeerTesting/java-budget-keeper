package homeScreen;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelAdd extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelAdd() {
		
		setSize(604, 558);
		setLayout(null);
		
		JLabel lblWydadkiIPrzychodu = new JLabel("WYDADKI I PRZYCH\u00D3D");
		lblWydadkiIPrzychodu.setFont(new Font("Verdana", Font.BOLD, 24));
		lblWydadkiIPrzychodu.setBounds(117, 239, 364, 60);
		add(lblWydadkiIPrzychodu);
	}

}
