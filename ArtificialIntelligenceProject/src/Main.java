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
	private JTextField[][] grid = new JTextField[6][7];
//	private JTextField b00;
//	private JTextField b01;
//	private JTextField b02;
//	private JTextField b03;
//	private JTextField b05;
//	private JTextField b06;
//	private JTextField b04;
//	private JTextField b10;
//	private JTextField b11;
//	private JTextField b12;
//	private JTextField b13;
//	private JTextField b14;
//	private JTextField b15;
//	private JTextField b16;
//	private JTextField b30;
//	private JTextField b31;
//	private JTextField b32;
//	private JTextField b33;
//	private JTextField b34;
//	private JTextField b35;
//	private JTextField b36;
//	private JTextField b20;
//	private JTextField b21;
//	private JTextField b22;
//	private JTextField b23;
//	private JTextField b24;
//	private JTextField b25;
//	private JTextField b26;
//	private JTextField b50;
//	private JTextField b51;
//	private JTextField b52;
//	private JTextField b53;
//	private JTextField b54;
//	private JTextField b55;
//	private JTextField b56;
//	private JTextField b40;
//	private JTextField b41;
//	private JTextField b42;
//	private JTextField b43;
//	private JTextField b44;
//	private JTextField b45;
//	private JTextField b46;

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
		grid[0][0] = new JTextField();
		grid[0][1] = new JTextField();
		grid[0][2] = new JTextField();
		grid[0][3] = new JTextField();
		grid[0][4] = new JTextField();
		grid[0][5] = new JTextField();
		grid[0][6] = new JTextField();
		grid[1][0] = new JTextField();
		grid[1][1] = new JTextField();
		grid[1][2] = new JTextField();
		grid[1][3] = new JTextField();
		grid[1][4] = new JTextField();
		grid[1][5] = new JTextField();
		grid[1][6] = new JTextField();
		grid[2][0] = new JTextField();
		grid[2][1] = new JTextField();
		grid[2][2] = new JTextField();
		grid[2][3] = new JTextField();
		grid[2][4] = new JTextField();
		grid[2][5] = new JTextField();
		grid[2][6] = new JTextField();
		grid[3][0] = new JTextField();
		grid[3][1] = new JTextField();
		grid[3][2] = new JTextField();
		grid[3][3] = new JTextField();
		grid[3][4] = new JTextField();
		grid[3][5] = new JTextField();
		grid[3][6] = new JTextField();
		grid[4][0] = new JTextField();
		grid[4][1] = new JTextField();
		grid[4][2] = new JTextField();
		grid[4][3] = new JTextField();
		grid[4][4] = new JTextField();
		grid[4][5] = new JTextField();
		grid[4][6] = new JTextField();
		grid[5][0] = new JTextField();
		grid[5][1] = new JTextField();
		grid[5][2] = new JTextField();
		grid[5][3] = new JTextField();
		grid[5][4] = new JTextField();
		grid[5][5] = new JTextField();
		grid[5][6] = new JTextField();
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
				
		grid[0][0] = new JTextField();
		grid[0][0].setEnabled(false);
		grid[0][0].setBounds(10, 45, 86, 20);
		contentPane.add(grid[0][0]);
		grid[0][0].setColumns(10);
		
		grid[0][1] = new JTextField();
		grid[0][1].setEnabled(false);
		grid[0][1].setColumns(10);
		grid[0][1].setBounds(109, 45, 86, 20);
		contentPane.add(grid[0][1]);
		
		grid[0][2] = new JTextField();
		grid[0][2].setEnabled(false);
		grid[0][2].setColumns(10);
		grid[0][2].setBounds(211, 45, 86, 20);
		contentPane.add(grid[0][2]);
		
		grid[0][3] = new JTextField();
		grid[0][3].setEnabled(false);
		grid[0][3].setColumns(10);
		grid[0][3].setBounds(310, 45, 86, 20);
		contentPane.add(grid[0][3]);
		
		grid[0][4] = new JTextField();
		grid[0][4].setEnabled(false);
		grid[0][4].setColumns(10);
		grid[0][4].setBounds(406, 45, 86, 20);
		contentPane.add(grid[0][4]);
		
		grid[0][5] = new JTextField();
		grid[0][5].setEnabled(false);
		grid[0][5].setColumns(10);
		grid[0][5].setBounds(508, 45, 86, 20);
		contentPane.add(grid[0][5]);
		
		grid[0][6] = new JTextField();
		grid[0][6].setEnabled(false);
		grid[0][6].setColumns(10);
		grid[0][6].setBounds(607, 45, 86, 20);
		contentPane.add(grid[0][6]);
		
		grid[1][0] = new JTextField();
		grid[1][0].setEnabled(false);
		grid[1][0].setColumns(10);
		grid[1][0].setBounds(10, 76, 86, 20);
		contentPane.add(grid[1][0]);
		
		grid[1][1] = new JTextField();
		grid[1][1].setEnabled(false);
		grid[1][1].setColumns(10);
		grid[1][1].setBounds(109, 76, 86, 20);
		contentPane.add(grid[1][1]);
		
		grid[1][2] = new JTextField();
		grid[1][2].setEnabled(false);
		grid[1][2].setColumns(10);
		grid[1][2].setBounds(211, 76, 86, 20);
		contentPane.add(grid[1][2]);
		
		grid[1][3] = new JTextField();
		grid[1][3].setEnabled(false);
		grid[1][3].setColumns(10);
		grid[1][3].setBounds(310, 76, 86, 20);
		contentPane.add(grid[1][3]);
		
		grid[1][4] = new JTextField();
		grid[1][4].setEnabled(false);
		grid[1][4].setColumns(10);
		grid[1][4].setBounds(406, 76, 86, 20);
		contentPane.add(grid[1][4]);
		
		grid[1][5] = new JTextField();
		grid[1][5].setEnabled(false);
		grid[1][5].setColumns(10);
		grid[1][5].setBounds(508, 76, 86, 20);
		contentPane.add(grid[1][5]);
		
		grid[1][6] = new JTextField();
		grid[1][6].setEnabled(false);
		grid[1][6].setColumns(10);
		grid[1][6].setBounds(607, 76, 86, 20);
		contentPane.add(grid[1][6]);

		grid[2][0] = new JTextField();
		grid[2][0].setEnabled(false);
		grid[2][0].setColumns(10);
		grid[2][0].setBounds(10, 107, 86, 20);
		contentPane.add(grid[2][0]);
		
		grid[2][1] = new JTextField();
		grid[2][1].setEnabled(false);
		grid[2][1].setColumns(10);
		grid[2][1].setBounds(109, 107, 86, 20);
		contentPane.add(grid[2][1]);
		
		grid[2][2] = new JTextField();
		grid[2][2].setEnabled(false);
		grid[2][2].setColumns(10);
		grid[2][2].setBounds(211, 107, 86, 20);
		contentPane.add(grid[2][2]);
		
		grid[2][3] = new JTextField();
		grid[2][3].setEnabled(false);
		grid[2][3].setColumns(10);
		grid[2][3].setBounds(310, 107, 86, 20);
		contentPane.add(grid[2][3]);
		
		grid[2][4] = new JTextField();
		grid[2][4].setEnabled(false);
		grid[2][4].setColumns(10);
		grid[2][4].setBounds(406, 107, 86, 20);
		contentPane.add(grid[2][4]);
		
		grid[2][5] = new JTextField();
		grid[2][5].setEnabled(false);
		grid[2][5].setColumns(10);
		grid[2][5].setBounds(508, 107, 86, 20);
		contentPane.add(grid[2][5]);
		
		grid[2][6] = new JTextField();
		grid[2][6].setEnabled(false);
		grid[2][6].setColumns(10);
		grid[2][6].setBounds(607, 107, 86, 20);
		contentPane.add(grid[2][6]);
		
		grid[3][0] = new JTextField();
		grid[3][0].setEnabled(false);
		grid[3][0].setColumns(10);
		grid[3][0].setBounds(10, 138, 86, 20);
		contentPane.add(grid[3][0]);
		
		grid[3][1] = new JTextField();
		grid[3][1].setEnabled(false);
		grid[3][1].setColumns(10);
		grid[3][1].setBounds(109, 138, 86, 20);
		contentPane.add(grid[3][1]);
		
		grid[3][2] = new JTextField();
		grid[3][2].setEnabled(false);
		grid[3][2].setColumns(10);
		grid[3][2].setBounds(211, 138, 86, 20);
		contentPane.add(grid[3][2]);
		
		grid[3][3] = new JTextField();
		grid[3][3].setEnabled(false);
		grid[3][3].setColumns(10);
		grid[3][3].setBounds(310, 138, 86, 20);
		contentPane.add(grid[3][3]);
		
		grid[3][4] = new JTextField();
		grid[3][4].setEnabled(false);
		grid[3][4].setColumns(10);
		grid[3][4].setBounds(406, 138, 86, 20);
		contentPane.add(grid[3][4]);
		
		grid[3][5] = new JTextField();
		grid[3][5].setEnabled(false);
		grid[3][5].setColumns(10);
		grid[3][5].setBounds(508, 138, 86, 20);
		contentPane.add(grid[3][5]);
		
		grid[3][6] = new JTextField();
		grid[3][6].setEnabled(false);
		grid[3][6].setColumns(10);
		grid[3][6].setBounds(607, 138, 86, 20);
		contentPane.add(grid[3][6]);
		
		grid[4][0] = new JTextField();
		grid[4][0].setEnabled(false);
		grid[4][0].setColumns(10);
		grid[4][0].setBounds(10, 169, 86, 20);
		contentPane.add(grid[4][0]);
		
		grid[4][1] = new JTextField();
		grid[4][1].setEnabled(false);
		grid[4][1].setColumns(10);
		grid[4][1].setBounds(109, 169, 86, 20);
		contentPane.add(grid[4][1]);
		
		grid[4][2] = new JTextField();
		grid[4][2].setEnabled(false);
		grid[4][2].setColumns(10);
		grid[4][2].setBounds(211, 169, 86, 20);
		contentPane.add(grid[4][2]);
		
		grid[4][3] = new JTextField();
		grid[4][3].setEnabled(false);
		grid[4][3].setColumns(10);
		grid[4][3].setBounds(310, 169, 86, 20);
		contentPane.add(grid[4][3]);
		
		grid[4][4] = new JTextField();
		grid[4][4].setEnabled(false);
		grid[4][4].setColumns(10);
		grid[4][4].setBounds(406, 169, 86, 20);
		contentPane.add(grid[4][4]);
		
		grid[4][5] = new JTextField();
		grid[4][5].setEnabled(false);
		grid[4][5].setColumns(10);
		grid[4][5].setBounds(508, 169, 86, 20);
		contentPane.add(grid[4][5]);
		
		grid[4][6] = new JTextField();
		grid[4][6].setEnabled(false);
		grid[4][6].setColumns(10);
		grid[4][6].setBounds(607, 169, 86, 20);
		contentPane.add(grid[4][6]);
		
		
		grid[5][0] = new JTextField();
		grid[5][0].setEnabled(false);
		grid[5][0].setColumns(10);
		grid[5][0].setBounds(10, 200, 86, 20);
		contentPane.add(grid[5][0]);
		
		grid[5][1] = new JTextField();
		grid[5][1].setEnabled(false);
		grid[5][1].setColumns(10);
		grid[5][1].setBounds(109, 200, 86, 20);
		contentPane.add(grid[5][1]);
		
		grid[5][2] = new JTextField();
		grid[5][2].setEnabled(false);
		grid[5][2].setColumns(10);
		grid[5][2].setBounds(211, 200, 86, 20);
		contentPane.add(grid[5][2]);
		
		grid[5][3] = new JTextField();
		grid[5][3].setEnabled(false);
		grid[5][3].setColumns(10);
		grid[5][3].setBounds(310, 200, 86, 20);
		contentPane.add(grid[5][3]);
		
		grid[5][4] = new JTextField();
		grid[5][4].setEnabled(false);
		grid[5][4].setColumns(10);
		grid[5][4].setBounds(406, 200, 86, 20);
		contentPane.add(grid[5][4]);
		
		grid[5][5] = new JTextField();
		grid[5][5].setEnabled(false);
		grid[5][5].setColumns(10);
		grid[5][5].setBounds(508, 200, 86, 20);
		contentPane.add(grid[5][5]);
		
		grid[5][6] = new JTextField();
		grid[5][6].setEnabled(false);
		grid[5][6].setColumns(10);
		grid[5][6].setBounds(607, 200, 86, 20);
		contentPane.add(grid[5][6]);
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j].setText("Test.");
			}
		}
	}
	static void humanMove(int columnNumber){
		for (int i = 0; i < 6; i++) {
		}
	}
}
