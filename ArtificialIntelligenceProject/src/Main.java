import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import sun.org.mozilla.javascript.internal.ast.ForInLoop;
import sun.swing.MenuItemLayoutHelper.ColumnAlignment;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;
import com.sun.org.apache.xpath.internal.operations.Equals;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Main extends JFrame {

	private static JPanel contentPane;
	private static JTextField[][] grid = new JTextField[6][7];
	private static int[][] scoreBoard = new int[6][7];
	private static boolean firstMove = false;
	private static boolean humanWin = true;
	static JButton columnOneButton = new JButton("Drop");
	static JButton columnTwoButton = new JButton("Drop");
	static JButton columnThreeButton = new JButton("Drop");
	static JButton columnFourButton = new JButton("Drop");
	static JButton columnFiveButton = new JButton("Drop");
	static JButton columnSixButton = new JButton("Drop");
	static JButton columnSevenButton = new JButton("Drop");
	// private JTextField b00;
	// private JTextField b01;
	// private JTextField b02;
	// private JTextField b03;
	// private JTextField b05;
	// private JTextField b06;
	// private JTextField b04;
	// private JTextField b10;
	// private JTextField b11;
	// private JTextField b12;
	// private JTextField b13;
	// private JTextField b14;
	// private JTextField b15;
	// private JTextField b16;
	// private JTextField b30;
	// private JTextField b31;
	// private JTextField b32;
	// private JTextField b33;
	// private JTextField b34;
	// private JTextField b35;
	// private JTextField b36;
	// private JTextField b20;
	// private JTextField b21;
	// private JTextField b22;
	// private JTextField b23;
	// private JTextField b24;
	// private JTextField b25;
	// private JTextField b26;
	// private JTextField b50;
	// private JTextField b51;
	// private JTextField b52;
	// private JTextField b53;
	// private JTextField b54;
	// private JTextField b55;
	// private JTextField b56;
	// private JTextField b40;
	// private JTextField b41;
	// private JTextField b42;
	// private JTextField b43;
	// private JTextField b44;
	// private JTextField b45;
	// private JTextField b46;

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
		scoreBoard[0][0] = -1;
		scoreBoard[0][1] = -1;
		scoreBoard[0][2] = -1;
		scoreBoard[0][3] = -1;
		scoreBoard[0][4] = -1;
		scoreBoard[0][5] = -1;
		scoreBoard[0][6] = -1;
		scoreBoard[1][0] = -1;
		scoreBoard[1][1] = -1;
		scoreBoard[1][2] = -1;
		scoreBoard[1][3] = -1;
		scoreBoard[1][4] = -1;
		scoreBoard[1][5] = -1;
		scoreBoard[1][6] = -1;
		scoreBoard[2][0] = -1;
		scoreBoard[2][1] = -1;
		scoreBoard[2][2] = -1;
		scoreBoard[2][3] = -1;
		scoreBoard[2][4] = -1;
		scoreBoard[2][5] = -1;
		scoreBoard[2][6] = -1;
		scoreBoard[3][0] = -1;
		scoreBoard[3][1] = -1;
		scoreBoard[3][2] = -1;
		scoreBoard[3][3] = -1;
		scoreBoard[3][4] = -1;
		scoreBoard[3][5] = -1;
		scoreBoard[3][6] = -1;
		scoreBoard[4][0] = -1;
		scoreBoard[4][1] = -1;
		scoreBoard[4][2] = -1;
		scoreBoard[4][3] = -1;
		scoreBoard[4][4] = -1;
		scoreBoard[4][5] = -1;
		scoreBoard[4][6] = -1;
		scoreBoard[5][0] = -1;
		scoreBoard[5][1] = -1;
		scoreBoard[5][2] = -1;
		scoreBoard[5][3] = -1;
		scoreBoard[5][4] = -1;
		scoreBoard[5][5] = -1;
		scoreBoard[5][6] = -1;
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

		
		columnOneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// JOptionPane.showConfirmDialog(contentPane, "Clicked");
				humanMove(0);
				// computerMove(1);
			}
		});
		columnOneButton.setBounds(10, 11, 89, 23);
		contentPane.add(columnOneButton);

		
		columnTwoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				humanMove(1);
			}
		});
		columnTwoButton.setBounds(109, 11, 89, 23);
		contentPane.add(columnTwoButton);

		
		columnThreeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				humanMove(2);
			}
		});
		columnThreeButton.setBounds(208, 11, 89, 23);
		contentPane.add(columnThreeButton);

		
		columnFourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				humanMove(3);
			}
		});
		columnFourButton.setBounds(307, 11, 89, 23);
		contentPane.add(columnFourButton);

		
		columnFiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				humanMove(4);
			}
		});
		columnFiveButton.setBounds(406, 11, 89, 23);
		contentPane.add(columnFiveButton);

		
		columnSixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				humanMove(5);
			}
		});
		columnSixButton.setBounds(505, 11, 89, 23);
		contentPane.add(columnSixButton);

		columnSevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				humanMove(6);
			}
		});
		columnSevenButton.setBounds(604, 11, 89, 23);
		contentPane.add(columnSevenButton);

		// grid[0][0] = new JTextField();
		grid[0][0].setEnabled(false);
		grid[0][0].setBounds(10, 45, 86, 20);
		contentPane.add(grid[0][0]);
		grid[0][0].setColumns(10);

		// grid[0][1] = new JTextField();
		grid[0][1].setEnabled(false);
		grid[0][1].setColumns(10);
		grid[0][1].setBounds(109, 45, 86, 20);
		contentPane.add(grid[0][1]);

		// grid[0][2] = new JTextField();
		grid[0][2].setEnabled(false);
		grid[0][2].setColumns(10);
		grid[0][2].setBounds(211, 45, 86, 20);
		contentPane.add(grid[0][2]);

		// grid[0][3] = new JTextField();
		grid[0][3].setEnabled(false);
		grid[0][3].setColumns(10);
		grid[0][3].setBounds(310, 45, 86, 20);
		contentPane.add(grid[0][3]);

		// grid[0][4] = new JTextField();
		grid[0][4].setEnabled(false);
		grid[0][4].setColumns(10);
		grid[0][4].setBounds(406, 45, 86, 20);
		contentPane.add(grid[0][4]);

		// grid[0][5] = new JTextField();
		grid[0][5].setEnabled(false);
		grid[0][5].setColumns(10);
		grid[0][5].setBounds(508, 45, 86, 20);
		contentPane.add(grid[0][5]);

		// grid[0][6] = new JTextField(" ");
		grid[0][6].setEnabled(false);
		grid[0][6].setColumns(10);
		grid[0][6].setBounds(607, 45, 86, 20);
		contentPane.add(grid[0][6]);

		// grid[1][0] = new JTextField();
		grid[1][0].setEnabled(false);
		grid[1][0].setColumns(10);
		grid[1][0].setBounds(10, 76, 86, 20);
		contentPane.add(grid[1][0]);

		// grid[1][1] = new JTextField();
		grid[1][1].setEnabled(false);
		grid[1][1].setColumns(10);
		grid[1][1].setBounds(109, 76, 86, 20);
		contentPane.add(grid[1][1]);

		// grid[1][2] = new JTextField();
		grid[1][2].setEnabled(false);
		grid[1][2].setColumns(10);
		grid[1][2].setBounds(211, 76, 86, 20);
		contentPane.add(grid[1][2]);

		// grid[1][3] = new JTextField();
		grid[1][3].setEnabled(false);
		grid[1][3].setColumns(10);
		grid[1][3].setBounds(310, 76, 86, 20);
		contentPane.add(grid[1][3]);

		// grid[1][4] = new JTextField();
		grid[1][4].setEnabled(false);
		grid[1][4].setColumns(10);
		grid[1][4].setBounds(406, 76, 86, 20);
		contentPane.add(grid[1][4]);

		// grid[1][5] = new JTextField();
		grid[1][5].setEnabled(false);
		grid[1][5].setColumns(10);
		grid[1][5].setBounds(508, 76, 86, 20);
		contentPane.add(grid[1][5]);

		// grid[1][6] = new JTextField();
		grid[1][6].setEnabled(false);
		grid[1][6].setColumns(10);
		grid[1][6].setBounds(607, 76, 86, 20);
		contentPane.add(grid[1][6]);

		// grid[2][0] = new JTextField();
		grid[2][0].setEnabled(false);
		grid[2][0].setColumns(10);
		grid[2][0].setBounds(10, 107, 86, 20);
		contentPane.add(grid[2][0]);

		// grid[2][1] = new JTextField();
		grid[2][1].setEnabled(false);
		grid[2][1].setColumns(10);
		grid[2][1].setBounds(109, 107, 86, 20);
		contentPane.add(grid[2][1]);

		// grid[2][2] = new JTextField();
		grid[2][2].setEnabled(false);
		grid[2][2].setColumns(10);
		grid[2][2].setBounds(211, 107, 86, 20);
		contentPane.add(grid[2][2]);

		// grid[2][3] = new JTextField();
		grid[2][3].setEnabled(false);
		grid[2][3].setColumns(10);
		grid[2][3].setBounds(310, 107, 86, 20);
		contentPane.add(grid[2][3]);

		// grid[2][4] = new JTextField();
		grid[2][4].setEnabled(false);
		grid[2][4].setColumns(10);
		grid[2][4].setBounds(406, 107, 86, 20);
		contentPane.add(grid[2][4]);

		// grid[2][5] = new JTextField();
		grid[2][5].setEnabled(false);
		grid[2][5].setColumns(10);
		grid[2][5].setBounds(508, 107, 86, 20);
		contentPane.add(grid[2][5]);

		// grid[2][6] = new JTextField();
		grid[2][6].setEnabled(false);
		grid[2][6].setColumns(10);
		grid[2][6].setBounds(607, 107, 86, 20);
		contentPane.add(grid[2][6]);

		// grid[3][0] = new JTextField();
		grid[3][0].setEnabled(false);
		grid[3][0].setColumns(10);
		grid[3][0].setBounds(10, 138, 86, 20);
		contentPane.add(grid[3][0]);

		// grid[3][1] = new JTextField();
		grid[3][1].setEnabled(false);
		grid[3][1].setColumns(10);
		grid[3][1].setBounds(109, 138, 86, 20);
		contentPane.add(grid[3][1]);

		// grid[3][2] = new JTextField();
		grid[3][2].setEnabled(false);
		grid[3][2].setColumns(10);
		grid[3][2].setBounds(211, 138, 86, 20);
		contentPane.add(grid[3][2]);

		// grid[3][3] = new JTextField();
		grid[3][3].setEnabled(false);
		grid[3][3].setColumns(10);
		grid[3][3].setBounds(310, 138, 86, 20);
		contentPane.add(grid[3][3]);

		// grid[3][4] = new JTextField();
		grid[3][4].setEnabled(false);
		grid[3][4].setColumns(10);
		grid[3][4].setBounds(406, 138, 86, 20);
		contentPane.add(grid[3][4]);

		// grid[3][5] = new JTextField();
		grid[3][5].setEnabled(false);
		grid[3][5].setColumns(10);
		grid[3][5].setBounds(508, 138, 86, 20);
		contentPane.add(grid[3][5]);

		// grid[3][6] = new JTextField();
		grid[3][6].setEnabled(false);
		grid[3][6].setColumns(10);
		grid[3][6].setBounds(607, 138, 86, 20);
		contentPane.add(grid[3][6]);

		// grid[4][0] = new JTextField();
		grid[4][0].setEnabled(false);
		grid[4][0].setColumns(10);
		grid[4][0].setBounds(10, 169, 86, 20);
		contentPane.add(grid[4][0]);

		// grid[4][1] = new JTextField();
		grid[4][1].setEnabled(false);
		grid[4][1].setColumns(10);
		grid[4][1].setBounds(109, 169, 86, 20);
		contentPane.add(grid[4][1]);

		// grid[4][2] = new JTextField();
		grid[4][2].setEnabled(false);
		grid[4][2].setColumns(10);
		grid[4][2].setBounds(211, 169, 86, 20);
		contentPane.add(grid[4][2]);

		// grid[4][3] = new JTextField();
		grid[4][3].setEnabled(false);
		grid[4][3].setColumns(10);
		grid[4][3].setBounds(310, 169, 86, 20);
		contentPane.add(grid[4][3]);

		// grid[4][4] = new JTextField();
		grid[4][4].setEnabled(false);
		grid[4][4].setColumns(10);
		grid[4][4].setBounds(406, 169, 86, 20);
		contentPane.add(grid[4][4]);

		// grid[4][5] = new JTextField();
		grid[4][5].setEnabled(false);
		grid[4][5].setColumns(10);
		grid[4][5].setBounds(508, 169, 86, 20);
		contentPane.add(grid[4][5]);

		// grid[4][6] = new JTextField();
		grid[4][6].setEnabled(false);
		grid[4][6].setColumns(10);
		grid[4][6].setBounds(607, 169, 86, 20);
		contentPane.add(grid[4][6]);

		// grid[5][0] = new JTextField();
		grid[5][0].setEnabled(false);
		grid[5][0].setColumns(10);
		grid[5][0].setBounds(10, 200, 86, 20);
		contentPane.add(grid[5][0]);

		// grid[5][1] = new JTextField();
		grid[5][1].setEnabled(false);
		grid[5][1].setColumns(10);
		grid[5][1].setBounds(109, 200, 86, 20);
		contentPane.add(grid[5][1]);

		// grid[5][2] = new JTextField();
		grid[5][2].setEnabled(false);
		grid[5][2].setColumns(10);
		grid[5][2].setBounds(211, 200, 86, 20);
		contentPane.add(grid[5][2]);

		// grid[5][3] = new JTextField();
		grid[5][3].setEnabled(false);
		grid[5][3].setColumns(10);
		grid[5][3].setBounds(310, 200, 86, 20);
		contentPane.add(grid[5][3]);

		// grid[5][4] = new JTextField();
		grid[5][4].setEnabled(false);
		grid[5][4].setColumns(10);
		grid[5][4].setBounds(406, 200, 86, 20);
		contentPane.add(grid[5][4]);

		// grid[5][5] = new JTextField();
		grid[5][5].setEnabled(false);
		grid[5][5].setColumns(10);
		grid[5][5].setBounds(508, 200, 86, 20);
		contentPane.add(grid[5][5]);

		// grid[5][6] = new JTextField();
		grid[5][6].setEnabled(false);
		grid[5][6].setColumns(10);
		grid[5][6].setBounds(607, 200, 86, 20);
		contentPane.add(grid[5][6]);

		// Error Checking Code
		// for (int i = 0; i < 6; i++) {
		// for (int j = 0; j < 7; j++) {
		// grid[i][j].setText("Test.");
		// }
		// }
	}

	static void isFirstMove() {
		for (int i = 0; i < scoreBoard.length; i++) {
			for (int j = 0; j < scoreBoard.length; j++) {
				if (scoreBoard[i][j] == -1) {
					firstMove = true;
				} else {
					firstMove = false;
				}
			}
		}
	}

	static void humanMove(int columnNumber) {
		int emptyCell = 0;
		for (int i = 0; i < 6; i++) {
			if (grid[i][columnNumber].getText().isEmpty()) {
				emptyCell = i;
			}

			// if (grid.length - 6 == i
			// && grid[i][columnNumber].getText().isEmpty()) {
			// grid[i][columnNumber].setBackground(Color.BLUE);
			// grid[i][columnNumber].setText(" ");
			// break;
			// }
			// if (grid.length - 5 == i
			// && grid[i][columnNumber].getText().isEmpty()) {
			// grid[i][columnNumber].setBackground(Color.BLUE);
			// grid[i][columnNumber].setText(" ");
			// break;
			// }
			// if (grid.length - 4 == i
			// && grid[i][columnNumber].getText().isEmpty()) {
			// grid[i][columnNumber].setBackground(Color.BLUE);
			// grid[i][columnNumber].setText(" ");
			// break;
			// }
			// if (grid.length - 3 == i &&
			// grid[i][columnNumber].getText().isEmpty()) {
			// grid[i][columnNumber].setBackground(Color.BLUE);
			// grid[i][columnNumber].setText(" ");
			// break;
			// }
			// if (grid.length - 2 == i &&
			// grid[i][columnNumber].getText().isEmpty()) {
			// grid[i][columnNumber].setBackground(Color.BLUE);
			// grid[i][columnNumber].setText(" ");
			// break;
			// }
			// if (grid.length - 1 == i &&
			// grid[i][columnNumber].getText().isEmpty()) {
			// grid[i][columnNumber].setBackground(Color.BLUE);
			// grid[i][columnNumber].setText(" ");
			// break;
			// }
		}
		grid[emptyCell][columnNumber].setBackground(Color.BLUE);
		grid[emptyCell][columnNumber].setText(" ");
		scoreBoard[emptyCell][columnNumber] = 1;
		// humanWin = checkWinnerHuman();
		if (verticalCheck()||horizontalCheck()) {
			JOptionPane.showMessageDialog(contentPane, "You Win.");
		} else {
			computerMove();
		}
		// boolean flag = true;
		// isFirstMove();
		// while (flag) {
		// for (int i = 0; i <= 5; i++) {
		// if (grid.length - 1 == i && grid[i][columnNumber].getText().isEmpty()
		// && firstMove) {
		// grid[i][columnNumber].setBackground(Color.BLUE);
		// grid[i][columnNumber].setText(" ");
		// flag = false;
		// } else if ((grid.length - 1 != i) && !firstMove) {
		// if (grid[i + 1][columnNumber].getText().isEmpty()) {
		// grid[i][columnNumber].setBackground(Color.BLUE);
		// grid[i][columnNumber].setText(" ");
		// flag = false;
		// }
		// }
		//
		// }
		// }
	}

	static int[] generateRandom() {
		int[] computerMoveBox = new int[2];
		Random rand = new Random();
		int randomColumn = rand.nextInt((6 - 0) + 1) + 0;
		int emptyCell = 0;
		for (int i = 0; i < 6; i++) {
			if (grid[i][randomColumn].getText().isEmpty()) {
				emptyCell = i;
			}
		}
		if (grid[emptyCell][randomColumn].getText().isEmpty()) {
			computerMoveBox[0] = emptyCell;
			computerMoveBox[0] = randomColumn;
			return computerMoveBox;
		} else {
			generateRandom();
		}
		return null;
	}

	static void computerMove() {
		// if (!humanWin) {
		// int a[] = generateRandom();
		// JOptionPane.showMessageDialog(contentPane, grid.length);
		// JOptionPane.showMessageDialog(contentPane, a[0]+" "+a[1]);
		// grid[a[0]][a[1]].setBackground(Color.RED);
		// grid[a[0]][a[1]].setText(" ");

		Random rand = new Random();
		int randomNum = 0;
		int emptyCell = 0;
		boolean a = true;
		while (a) {
			randomNum = rand.nextInt((6 - 0) + 1) + 0;
			for (int i = 0; i < 6; i++) {
				if (grid[i][randomNum].getText().isEmpty()) {
					emptyCell = i;
//					if (scoreBoard[emptyCell++][randomNum]==2||scoreBoard[emptyCell++][randomNum++]==2||scoreBoard[emptyCell][randomNum++]==2) {
//						
//					}
//					if (ai(emptyCell, randomNum)) {
						a = false;
//					}
				}
			}
		}
		grid[emptyCell][randomNum].setBackground(Color.RED);
		grid[emptyCell][randomNum].setText(" ");
		scoreBoard[emptyCell][randomNum] = 2;
//		JOptionPane.showMessageDialog(contentPane, scoreBoard[emptyCell][randomNum]);
		if (!grid[0][randomNum].getText().isEmpty()) {
			if (randomNum==0) {
				columnOneButton.setEnabled(false);
			} else if (randomNum==1) {
				columnTwoButton.setEnabled(false);
			} else if (randomNum==2) {
				columnThreeButton.setEnabled(false);
			} else if (randomNum==3) {
				columnFourButton.setEnabled(false);
			} else if (randomNum==4) {
				columnFiveButton.setEnabled(false);
			} else if (randomNum==5) {
				columnSixButton.setEnabled(false);
			} else if (randomNum==6) {
				columnSevenButton.setEnabled(false);
			}
			
		}

		// }
		// checkWinnerHuman();
	}
	static boolean ai(int row, int column){
		if (scoreBoard[row++][column]==2||scoreBoard[row++][column++]==2||scoreBoard[row][column++]==2) {
			return true;
		}
		return false;
	}
	static void clearBoard() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				grid[i][j].setBackground(Color.WHITE);
				grid[i][j].setText(null);
				scoreBoard[i][j] = -1;
			}
		}
	}

	static boolean horizontalCheck() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				if (scoreBoard[i][j] != -1 &&
						scoreBoard[i][j] == scoreBoard[i][j+1] &&
								scoreBoard[i][j] == scoreBoard[i][j+2] &&
										scoreBoard[i][j] == scoreBoard[i][j+3]) {
					return true;
				}
			}
		}
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 7; j++) {
//				if (scoreBoard[i][j] == 1 && scoreBoard[i][j + 1] == 1
//						&& scoreBoard[i][j + 2] == 1
//						&& scoreBoard[i][j + 3] == 1) {
////					JOptionPane.showMessageDialog(null, "You Win");
//					clearBoard();
//					return true;
//				}
//			}
//		}
		return false;
	}

	static boolean verticalCheck() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (scoreBoard[i][j]!=-1&&scoreBoard[i][j] == scoreBoard[i+1][j]&&
						scoreBoard[i][j] == scoreBoard[i+2][j]&&
				        		   scoreBoard[i][j] == scoreBoard[i+3][j]) {
					clearBoard();
					return true;
					
				}
			}
		}
		return false;
	}

	static boolean checkWinnerHuman() {

		// for (int i = 0; i < 6; i++) {
		// for (int j = 0; j < 7; j++) {
		// if
		// (scoreBoard[i][j]==1&&scoreBoard[i][j+1]==1&&scoreBoard[i][j+2]==1&&scoreBoard[i][j+3]==1)
		// {
		// JOptionPane.showMessageDialog(null, "You Win");
		// clearBoard();
		// return true;
		// }
		// }
		//
		// }

		return (horizontalCheck()) ? true : false;

		// for (int i = 0; i < 6; i++) {
		// for (int j = 0; j < 7; j++) {
		// if
		// (scoreBoard[i][j]==1&&scoreBoard[i+1][j]==1&&scoreBoard[i+2][j]==1&&scoreBoard[i+3][j]==1)
		// {
		// JOptionPane.showMessageDialog(null, "WIner detected"+"Second loop");
		// return true;
		// }
		// }
		// }
	}
}
