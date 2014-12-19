import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dialog.ModalityType;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class About extends JDialog {

	private final JPanel contentPanel = new JPanel();
	static About dialog = new About();
	/**
	 * Launch the application.
	 */
	public void about() {
		try {
//			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setModal(true);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setTitle("About");
		setResizable(false);
		setAlwaysOnTop(true);
		setModalityType(ModalityType.DOCUMENT_MODAL);
		setBounds(100, 100, 450, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2
				- getSize().height / 2);
		setIconImage(Toolkit.getDefaultToolkit().getImage("res/logo.png"));
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Artificial Intelligence Project");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(10, 11, 424, 79);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblGroupMembers = new JLabel("Group Members");
			lblGroupMembers.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblGroupMembers.setBounds(10, 116, 140, 28);
			contentPanel.add(lblGroupMembers);
		}
		{
			JLabel lblSyedMuhammadHaziq = new JLabel("Syed Muhammad Haziq Ali Shah 18290");
			lblSyedMuhammadHaziq.setBounds(10, 155, 230, 14);
			contentPanel.add(lblSyedMuhammadHaziq);
		}
		{
			JLabel lblSyedAsadMurtaza = new JLabel("Syed Asad Murtaza18294");
			lblSyedAsadMurtaza.setBounds(10, 180, 205, 14);
			contentPanel.add(lblSyedAsadMurtaza);
		}
		{
			JLabel lblSyedWaqasAli = new JLabel("Syed Waqas Ali 18412");
			lblSyedWaqasAli.setBounds(10, 205, 205, 14);
			contentPanel.add(lblSyedWaqasAli);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 103, 424, 2);
			contentPanel.add(separator);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Close");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dialog.dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
