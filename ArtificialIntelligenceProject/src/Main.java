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
	private JTextField b30;
	private JTextField b31;
	private JTextField b32;
	private JTextField b33;
	private JTextField b34;
	private JTextField b35;
	private JTextField b36;
	private JTextField b20;
	private JTextField b21;
	private JTextField b22;
	private JTextField b23;
	private JTextField b24;
	private JTextField b25;
	private JTextField b26;
	private JTextField b50;
	private JTextField b51;
	private JTextField b52;
	private JTextField b53;
	private JTextField b54;
	private JTextField b55;
	private JTextField b56;
	private JTextField b40;
	private JTextField b41;
	private JTextField b42;
	private JTextField b43;
	private JTextField b44;
	private JTextField b45;
	private JTextField b46;

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
		
		b30 = new JTextField();
		b30.setEnabled(false);
		b30.setColumns(10);
		b30.setBounds(10, 138, 86, 20);
		contentPane.add(b30);
		
		b31 = new JTextField();
		b31.setEnabled(false);
		b31.setColumns(10);
		b31.setBounds(109, 138, 86, 20);
		contentPane.add(b31);
		
		b32 = new JTextField();
		b32.setEnabled(false);
		b32.setColumns(10);
		b32.setBounds(211, 138, 86, 20);
		contentPane.add(b32);
		
		b33 = new JTextField();
		b33.setEnabled(false);
		b33.setColumns(10);
		b33.setBounds(310, 138, 86, 20);
		contentPane.add(b33);
		
		b34 = new JTextField();
		b34.setEnabled(false);
		b34.setColumns(10);
		b34.setBounds(406, 138, 86, 20);
		contentPane.add(b34);
		
		b35 = new JTextField();
		b35.setEnabled(false);
		b35.setColumns(10);
		b35.setBounds(508, 138, 86, 20);
		contentPane.add(b35);
		
		b36 = new JTextField();
		b36.setEnabled(false);
		b36.setColumns(10);
		b36.setBounds(607, 138, 86, 20);
		contentPane.add(b36);
		
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
		
		b50 = new JTextField();
		b50.setEnabled(false);
		b50.setColumns(10);
		b50.setBounds(10, 200, 86, 20);
		contentPane.add(b50);
		
		b51 = new JTextField();
		b51.setEnabled(false);
		b51.setColumns(10);
		b51.setBounds(109, 200, 86, 20);
		contentPane.add(b51);
		
		b52 = new JTextField();
		b52.setEnabled(false);
		b52.setColumns(10);
		b52.setBounds(211, 200, 86, 20);
		contentPane.add(b52);
		
		b53 = new JTextField();
		b53.setEnabled(false);
		b53.setColumns(10);
		b53.setBounds(310, 200, 86, 20);
		contentPane.add(b53);
		
		b54 = new JTextField();
		b54.setEnabled(false);
		b54.setColumns(10);
		b54.setBounds(406, 200, 86, 20);
		contentPane.add(b54);
		
		b55 = new JTextField();
		b55.setEnabled(false);
		b55.setColumns(10);
		b55.setBounds(508, 200, 86, 20);
		contentPane.add(b55);
		
		b56 = new JTextField();
		b56.setEnabled(false);
		b56.setColumns(10);
		b56.setBounds(607, 200, 86, 20);
		contentPane.add(b56);
		
		b40 = new JTextField();
		b40.setEnabled(false);
		b40.setColumns(10);
		b40.setBounds(10, 169, 86, 20);
		contentPane.add(b40);
		
		b41 = new JTextField();
		b41.setEnabled(false);
		b41.setColumns(10);
		b41.setBounds(109, 169, 86, 20);
		contentPane.add(b41);
		
		b42 = new JTextField();
		b42.setEnabled(false);
		b42.setColumns(10);
		b42.setBounds(211, 169, 86, 20);
		contentPane.add(b42);
		
		b43 = new JTextField();
		b43.setEnabled(false);
		b43.setColumns(10);
		b43.setBounds(310, 169, 86, 20);
		contentPane.add(b43);
		
		b44 = new JTextField();
		b44.setEnabled(false);
		b44.setColumns(10);
		b44.setBounds(406, 169, 86, 20);
		contentPane.add(b44);
		
		b45 = new JTextField();
		b45.setEnabled(false);
		b45.setColumns(10);
		b45.setBounds(508, 169, 86, 20);
		contentPane.add(b45);
		
		b46 = new JTextField();
		b46.setEnabled(false);
		b46.setColumns(10);
		b46.setBounds(607, 169, 86, 20);
		contentPane.add(b46);
	}
}
