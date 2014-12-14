import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;


public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField b00;
	private JTextField b01;
	private JTextField b02;
	private JTextField b03;
	private JTextField b05;
	private JTextField b06;
	private JTextField b04;
	private JTextField b10;
	private JTextField b11;
	private JTextField b12;
	private JTextField b13;
	private JTextField b14;
	private JTextField b15;
	private JTextField b16;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField b20;
	private JTextField b21;
	private JTextField b22;
	private JTextField b23;
	private JTextField b24;
	private JTextField b25;
	private JTextField b26;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Four In a Row - AI Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton columnOneButton = new JButton("Drop");
		columnOneButton.setBounds(10, 11, 89, 23);
		contentPane.add(columnOneButton);
		
		JButton columnTwoButton = new JButton("Drop");
		columnTwoButton.setBounds(109, 11, 89, 23);
		contentPane.add(columnTwoButton);
		
		JButton columnThreeButton = new JButton("Drop");
		columnThreeButton.setBounds(208, 11, 89, 23);
		contentPane.add(columnThreeButton);
		
		JButton columnFourButton = new JButton("Drop");
		columnFourButton.setBounds(307, 11, 89, 23);
		contentPane.add(columnFourButton);
		
		JButton columnFiveButton = new JButton("Drop");
		columnFiveButton.setBounds(406, 11, 89, 23);
		contentPane.add(columnFiveButton);
		
		JButton columnSixButton = new JButton("Drop");
		columnSixButton.setBounds(505, 11, 89, 23);
		contentPane.add(columnSixButton);
		
		JButton columnSevenButton = new JButton("Drop");
		columnSevenButton.setBounds(604, 11, 89, 23);
		contentPane.add(columnSevenButton);
		
		b00 = new JTextField();
		b00.setEnabled(false);
		b00.setBounds(10, 45, 86, 20);
		contentPane.add(b00);
		b00.setColumns(10);
		
		b01 = new JTextField();
		b01.setEnabled(false);
		b01.setColumns(10);
		b01.setBounds(109, 45, 86, 20);
		contentPane.add(b01);
		
		b02 = new JTextField();
		b02.setEnabled(false);
		b02.setColumns(10);
		b02.setBounds(211, 45, 86, 20);
		contentPane.add(b02);
		
		b03 = new JTextField();
		b03.setEnabled(false);
		b03.setColumns(10);
		b03.setBounds(310, 45, 86, 20);
		contentPane.add(b03);
		
		b05 = new JTextField();
		b05.setEnabled(false);
		b05.setColumns(10);
		b05.setBounds(508, 45, 86, 20);
		contentPane.add(b05);
		
		b06 = new JTextField();
		b06.setEnabled(false);
		b06.setColumns(10);
		b06.setBounds(607, 45, 86, 20);
		contentPane.add(b06);
		
		b04 = new JTextField();
		b04.setEnabled(false);
		b04.setColumns(10);
		b04.setBounds(406, 45, 86, 20);
		contentPane.add(b04);
		
		b10 = new JTextField();
		b10.setEnabled(false);
		b10.setColumns(10);
		b10.setBounds(10, 76, 86, 20);
		contentPane.add(b10);
		
		b11 = new JTextField();
		b11.setEnabled(false);
		b11.setColumns(10);
		b11.setBounds(109, 76, 86, 20);
		contentPane.add(b11);
		
		b12 = new JTextField();
		b12.setEnabled(false);
		b12.setColumns(10);
		b12.setBounds(211, 76, 86, 20);
		contentPane.add(b12);
		
		b13 = new JTextField();
		b13.setEnabled(false);
		b13.setColumns(10);
		b13.setBounds(310, 76, 86, 20);
		contentPane.add(b13);
		
		b14 = new JTextField();
		b14.setEnabled(false);
		b14.setColumns(10);
		b14.setBounds(406, 76, 86, 20);
		contentPane.add(b14);
		
		b15 = new JTextField();
		b15.setEnabled(false);
		b15.setColumns(10);
		b15.setBounds(508, 76, 86, 20);
		contentPane.add(b15);
		
		b16 = new JTextField();
		b16.setEnabled(false);
		b16.setColumns(10);
		b16.setBounds(607, 76, 86, 20);
		contentPane.add(b16);
		
		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setColumns(10);
		textField_14.setBounds(10, 138, 86, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setColumns(10);
		textField_15.setBounds(109, 138, 86, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		textField_16.setBounds(211, 138, 86, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setColumns(10);
		textField_17.setBounds(310, 138, 86, 20);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEnabled(false);
		textField_18.setColumns(10);
		textField_18.setBounds(406, 138, 86, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEnabled(false);
		textField_19.setColumns(10);
		textField_19.setBounds(508, 138, 86, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEnabled(false);
		textField_20.setColumns(10);
		textField_20.setBounds(607, 138, 86, 20);
		contentPane.add(textField_20);
		
		b20 = new JTextField();
		b20.setEnabled(false);
		b20.setColumns(10);
		b20.setBounds(10, 107, 86, 20);
		contentPane.add(b20);
		
		b21 = new JTextField();
		b21.setEnabled(false);
		b21.setColumns(10);
		b21.setBounds(109, 107, 86, 20);
		contentPane.add(b21);
		
		b22 = new JTextField();
		b22.setEnabled(false);
		b22.setColumns(10);
		b22.setBounds(211, 107, 86, 20);
		contentPane.add(b22);
		
		b23 = new JTextField();
		b23.setEnabled(false);
		b23.setColumns(10);
		b23.setBounds(310, 107, 86, 20);
		contentPane.add(b23);
		
		b24 = new JTextField();
		b24.setEnabled(false);
		b24.setColumns(10);
		b24.setBounds(406, 107, 86, 20);
		contentPane.add(b24);
		
		b25 = new JTextField();
		b25.setEnabled(false);
		b25.setColumns(10);
		b25.setBounds(508, 107, 86, 20);
		contentPane.add(b25);
		
		b26 = new JTextField();
		b26.setEnabled(false);
		b26.setColumns(10);
		b26.setBounds(607, 107, 86, 20);
		contentPane.add(b26);
		
		textField_28 = new JTextField();
		textField_28.setEnabled(false);
		textField_28.setColumns(10);
		textField_28.setBounds(10, 200, 86, 20);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setEnabled(false);
		textField_29.setColumns(10);
		textField_29.setBounds(109, 200, 86, 20);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setEnabled(false);
		textField_30.setColumns(10);
		textField_30.setBounds(211, 200, 86, 20);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setEnabled(false);
		textField_31.setColumns(10);
		textField_31.setBounds(310, 200, 86, 20);
		contentPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setEnabled(false);
		textField_32.setColumns(10);
		textField_32.setBounds(406, 200, 86, 20);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setEnabled(false);
		textField_33.setColumns(10);
		textField_33.setBounds(508, 200, 86, 20);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setEnabled(false);
		textField_34.setColumns(10);
		textField_34.setBounds(607, 200, 86, 20);
		contentPane.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setEnabled(false);
		textField_35.setColumns(10);
		textField_35.setBounds(10, 169, 86, 20);
		contentPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setEnabled(false);
		textField_36.setColumns(10);
		textField_36.setBounds(109, 169, 86, 20);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setEnabled(false);
		textField_37.setColumns(10);
		textField_37.setBounds(211, 169, 86, 20);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setEnabled(false);
		textField_38.setColumns(10);
		textField_38.setBounds(310, 169, 86, 20);
		contentPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setEnabled(false);
		textField_39.setColumns(10);
		textField_39.setBounds(406, 169, 86, 20);
		contentPane.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setEnabled(false);
		textField_40.setColumns(10);
		textField_40.setBounds(508, 169, 86, 20);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setEnabled(false);
		textField_41.setColumns(10);
		textField_41.setBounds(607, 169, 86, 20);
		contentPane.add(textField_41);
	}
}
