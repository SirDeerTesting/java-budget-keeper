package homeScreen;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class PanelAdd extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelAdd() {
		setBackground(Color.PINK);
		
		setBounds(0, 0, 604, 558);
		setLayout(null);
		setVisible(true);
		
		JLabel lblWydadkiIPrzychodu = new JLabel("WYDADKI I PRZYCH\u00D3D");
		lblWydadkiIPrzychodu.setFont(new Font("Verdana", Font.BOLD, 24));
		lblWydadkiIPrzychodu.setBounds(117, 239, 364, 60);
		add(lblWydadkiIPrzychodu);
	}

}
