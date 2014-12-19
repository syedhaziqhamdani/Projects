import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

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

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;

public class Main extends JFrame {

	private static JPanel contentPane;
//	2D Array of JTestFields.
	private static JTextField[][] grid = new JTextField[6][7];
// 2D Integer array for scoring.
	private static int[][] scoreBoard = new int[6][7];
// Disk drop buttons for seven columns.
	static JButton columnOneButton = new JButton("Drop");
	static JButton columnTwoButton = new JButton("Drop");
	static JButton columnThreeButton = new JButton("Drop");
	static JButton columnFourButton = new JButton("Drop");
	static JButton columnFiveButton = new JButton("Drop");
	static JButton columnSixButton = new JButton("Drop");
	static JButton columnSevenButton = new JButton("Drop");
	private final JMenu mnHelp = new JMenu("Help");
	private final JMenuItem mntmHowToPlay = new JMenuItem("How To Play");
	private final JMenuItem mntmAbout = new JMenuItem("About");
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
		setResizable(false);
//		ScoreBoard initialization with -1 to represent the unfilled board.
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
// Initializing 2D JTextField Array with TextFields.		
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
		setBounds(100, 100, 720, 283);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2
				- getSize().height / 2);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		
		JMenuItem mntmNewGame = new JMenuItem("New Game");
		mntmNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearBoard();
			}
		});
		mnGame.add(mntmNewGame);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnGame.add(mntmExit);
		
		menuBar.add(mnHelp);
		mntmHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contentPane, "Click on Drop button to drop a brick in that column.");
			}
		});
		
		mnHelp.add(mntmHowToPlay);
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About about = new About();
				about.about();
			}
		});
		
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		columnOneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				humanMove(0);
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

		grid[0][0].setEnabled(false);
		grid[0][0].setBounds(10, 45, 86, 20);
		contentPane.add(grid[0][0]);
		grid[0][0].setColumns(10);

		grid[0][1].setEnabled(false);
		grid[0][1].setColumns(10);
		grid[0][1].setBounds(109, 45, 86, 20);
		contentPane.add(grid[0][1]);

		grid[0][2].setEnabled(false);
		grid[0][2].setColumns(10);
		grid[0][2].setBounds(211, 45, 86, 20);
		contentPane.add(grid[0][2]);

		grid[0][3].setEnabled(false);
		grid[0][3].setColumns(10);
		grid[0][3].setBounds(310, 45, 86, 20);
		contentPane.add(grid[0][3]);

		grid[0][4].setEnabled(false);
		grid[0][4].setColumns(10);
		grid[0][4].setBounds(406, 45, 86, 20);
		contentPane.add(grid[0][4]);

		grid[0][5].setEnabled(false);
		grid[0][5].setColumns(10);
		grid[0][5].setBounds(508, 45, 86, 20);
		contentPane.add(grid[0][5]);

		grid[0][6].setEnabled(false);
		grid[0][6].setColumns(10);
		grid[0][6].setBounds(607, 45, 86, 20);
		contentPane.add(grid[0][6]);

		grid[1][0].setEnabled(false);
		grid[1][0].setColumns(10);
		grid[1][0].setBounds(10, 76, 86, 20);
		contentPane.add(grid[1][0]);

		grid[1][1].setEnabled(false);
		grid[1][1].setColumns(10);
		grid[1][1].setBounds(109, 76, 86, 20);
		contentPane.add(grid[1][1]);

		grid[1][2].setEnabled(false);
		grid[1][2].setColumns(10);
		grid[1][2].setBounds(211, 76, 86, 20);
		contentPane.add(grid[1][2]);

		grid[1][3].setEnabled(false);
		grid[1][3].setColumns(10);
		grid[1][3].setBounds(310, 76, 86, 20);
		contentPane.add(grid[1][3]);

		grid[1][4].setEnabled(false);
		grid[1][4].setColumns(10);
		grid[1][4].setBounds(406, 76, 86, 20);
		contentPane.add(grid[1][4]);

		grid[1][5].setEnabled(false);
		grid[1][5].setColumns(10);
		grid[1][5].setBounds(508, 76, 86, 20);
		contentPane.add(grid[1][5]);

		grid[1][6].setEnabled(false);
		grid[1][6].setColumns(10);
		grid[1][6].setBounds(607, 76, 86, 20);
		contentPane.add(grid[1][6]);

		grid[2][0].setEnabled(false);
		grid[2][0].setColumns(10);
		grid[2][0].setBounds(10, 107, 86, 20);
		contentPane.add(grid[2][0]);

		grid[2][1].setEnabled(false);
		grid[2][1].setColumns(10);
		grid[2][1].setBounds(109, 107, 86, 20);
		contentPane.add(grid[2][1]);

		grid[2][2].setEnabled(false);
		grid[2][2].setColumns(10);
		grid[2][2].setBounds(211, 107, 86, 20);
		contentPane.add(grid[2][2]);

		grid[2][3].setEnabled(false);
		grid[2][3].setColumns(10);
		grid[2][3].setBounds(310, 107, 86, 20);
		contentPane.add(grid[2][3]);

		grid[2][4].setEnabled(false);
		grid[2][4].setColumns(10);
		grid[2][4].setBounds(406, 107, 86, 20);
		contentPane.add(grid[2][4]);

		grid[2][5].setEnabled(false);
		grid[2][5].setColumns(10);
		grid[2][5].setBounds(508, 107, 86, 20);
		contentPane.add(grid[2][5]);

		grid[2][6].setEnabled(false);
		grid[2][6].setColumns(10);
		grid[2][6].setBounds(607, 107, 86, 20);
		contentPane.add(grid[2][6]);

		grid[3][0].setEnabled(false);
		grid[3][0].setColumns(10);
		grid[3][0].setBounds(10, 138, 86, 20);
		contentPane.add(grid[3][0]);

		grid[3][1].setEnabled(false);
		grid[3][1].setColumns(10);
		grid[3][1].setBounds(109, 138, 86, 20);
		contentPane.add(grid[3][1]);

		grid[3][2].setEnabled(false);
		grid[3][2].setColumns(10);
		grid[3][2].setBounds(211, 138, 86, 20);
		contentPane.add(grid[3][2]);

		grid[3][3].setEnabled(false);
		grid[3][3].setColumns(10);
		grid[3][3].setBounds(310, 138, 86, 20);
		contentPane.add(grid[3][3]);

		grid[3][4].setEnabled(false);
		grid[3][4].setColumns(10);
		grid[3][4].setBounds(406, 138, 86, 20);
		contentPane.add(grid[3][4]);

		grid[3][5].setEnabled(false);
		grid[3][5].setColumns(10);
		grid[3][5].setBounds(508, 138, 86, 20);
		contentPane.add(grid[3][5]);

		grid[3][6].setEnabled(false);
		grid[3][6].setColumns(10);
		grid[3][6].setBounds(607, 138, 86, 20);
		contentPane.add(grid[3][6]);

		grid[4][0].setEnabled(false);
		grid[4][0].setColumns(10);
		grid[4][0].setBounds(10, 169, 86, 20);
		contentPane.add(grid[4][0]);

		grid[4][1].setEnabled(false);
		grid[4][1].setColumns(10);
		grid[4][1].setBounds(109, 169, 86, 20);
		contentPane.add(grid[4][1]);

		grid[4][2].setEnabled(false);
		grid[4][2].setColumns(10);
		grid[4][2].setBounds(211, 169, 86, 20);
		contentPane.add(grid[4][2]);

		grid[4][3].setEnabled(false);
		grid[4][3].setColumns(10);
		grid[4][3].setBounds(310, 169, 86, 20);
		contentPane.add(grid[4][3]);

		grid[4][4].setEnabled(false);
		grid[4][4].setColumns(10);
		grid[4][4].setBounds(406, 169, 86, 20);
		contentPane.add(grid[4][4]);

		grid[4][5].setEnabled(false);
		grid[4][5].setColumns(10);
		grid[4][5].setBounds(508, 169, 86, 20);
		contentPane.add(grid[4][5]);

		grid[4][6].setEnabled(false);
		grid[4][6].setColumns(10);
		grid[4][6].setBounds(607, 169, 86, 20);
		contentPane.add(grid[4][6]);

		grid[5][0].setEnabled(false);
		grid[5][0].setColumns(10);
		grid[5][0].setBounds(10, 200, 86, 20);
		contentPane.add(grid[5][0]);

		grid[5][1].setEnabled(false);
		grid[5][1].setColumns(10);
		grid[5][1].setBounds(109, 200, 86, 20);
		contentPane.add(grid[5][1]);

		grid[5][2].setEnabled(false);
		grid[5][2].setColumns(10);
		grid[5][2].setBounds(211, 200, 86, 20);
		contentPane.add(grid[5][2]);

		grid[5][3].setEnabled(false);
		grid[5][3].setColumns(10);
		grid[5][3].setBounds(310, 200, 86, 20);
		contentPane.add(grid[5][3]);

		grid[5][4].setEnabled(false);
		grid[5][4].setColumns(10);
		grid[5][4].setBounds(406, 200, 86, 20);
		contentPane.add(grid[5][4]);

		grid[5][5].setEnabled(false);
		grid[5][5].setColumns(10);
		grid[5][5].setBounds(508, 200, 86, 20);
		contentPane.add(grid[5][5]);

		grid[5][6].setEnabled(false);
		grid[5][6].setColumns(10);
		grid[5][6].setBounds(607, 200, 86, 20);
		contentPane.add(grid[5][6]);
	}

// Human move Method
	static void humanMove(int columnNumber) {
		int emptyCell = 0;
		for (int i = 0; i < 6; i++) {
			if (grid[i][columnNumber].getText().isEmpty()) {
				emptyCell = i;
			}
		}
		grid[emptyCell][columnNumber].setBackground(Color.BLUE);
		grid[emptyCell][columnNumber].setText(" ");
		scoreBoard[emptyCell][columnNumber] = 1;
		if (verticalCheck() || horizontalCheck() || diagonalCheck()) {
			JOptionPane.showMessageDialog(contentPane, "You Win.");
			clearBoard();
		} else {
			if (!grid[0][columnNumber].getText().isEmpty()) {
				if (columnNumber == 0) {
					columnOneButton.setEnabled(false);
				} else if (columnNumber == 1) {
					columnTwoButton.setEnabled(false);
				} else if (columnNumber == 2) {
					columnThreeButton.setEnabled(false);
				} else if (columnNumber == 3) {
					columnFourButton.setEnabled(false);
				} else if (columnNumber == 4) {
					columnFiveButton.setEnabled(false);
				} else if (columnNumber == 5) {
					columnSixButton.setEnabled(false);
				} else if (columnNumber == 6) {
					columnSevenButton.setEnabled(false);
				}
			}
			computerMove();
		}
	}
// Generate a random number between 0-6 and check the cell's availability
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
// Computer Move Method
	static void computerMove() {
		Random rand = new Random();
		int randomNum = 0;
		int emptyCell = 0;
		boolean a = true;
		while (a) {
			randomNum = rand.nextInt((6 - 0) + 1) + 0;
			for (int i = 0; i < 6; i++) {
				if (grid[i][randomNum].getText().isEmpty()) {
					emptyCell = i;
					a = false;
				}
			}
		}
		grid[emptyCell][randomNum].setBackground(Color.RED);
		grid[emptyCell][randomNum].setText(" ");
		scoreBoard[emptyCell][randomNum] = 2;
		if (verticalCheck() || horizontalCheck() || diagonalCheck()) {
			JOptionPane.showMessageDialog(contentPane, "Computer Win.");
			clearBoard();
		} else {
			if (!grid[0][randomNum].getText().isEmpty()) {
				if (randomNum == 0) {
					columnOneButton.setEnabled(false);
				} else if (randomNum == 1) {
					columnTwoButton.setEnabled(false);
				} else if (randomNum == 2) {
					columnThreeButton.setEnabled(false);
				} else if (randomNum == 3) {
					columnFourButton.setEnabled(false);
				} else if (randomNum == 4) {
					columnFiveButton.setEnabled(false);
				} else if (randomNum == 5) {
					columnSixButton.setEnabled(false);
				} else if (randomNum == 6) {
					columnSevenButton.setEnabled(false);
				}

			}
		}
	}
// Board Reset Method
	static void clearBoard() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				grid[i][j].setBackground(Color.WHITE);
				grid[i][j].setText(null);
				scoreBoard[i][j] = -1;
			}
		}
		columnOneButton.setEnabled(true);
		columnTwoButton.setEnabled(true);
		columnThreeButton.setEnabled(true);
		columnFourButton.setEnabled(true);
		columnFiveButton.setEnabled(true);
		columnSixButton.setEnabled(true);
		columnSevenButton.setEnabled(true);
	}
// Winner Checking Methods
	static boolean horizontalCheck() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				if (scoreBoard[i][j] != -1
						&& scoreBoard[i][j] == scoreBoard[i][j + 1]
						&& scoreBoard[i][j] == scoreBoard[i][j + 2]
						&& scoreBoard[i][j] == scoreBoard[i][j + 3]) {
					return true;
				}
			}
		}
		return false;
	}

	static boolean verticalCheck() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (scoreBoard[i][j] != -1
						&& scoreBoard[i][j] == scoreBoard[i + 1][j]
						&& scoreBoard[i][j] == scoreBoard[i + 2][j]
						&& scoreBoard[i][j] == scoreBoard[i + 3][j]) {
					return true;

				}
			}
		}
		return false;
	}

	static boolean diagonalCheck() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (scoreBoard[i][j] != -1
						&& scoreBoard[i][j] == scoreBoard[i + 1][j + 1]
						&& scoreBoard[i][j] == scoreBoard[i + 2][j + 2]
						&& scoreBoard[i][j] == scoreBoard[i + 3][j + 3]) {
					return true;

				}

			}
		}
		for (int i = 3; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				if (scoreBoard[i][j] != -1
						&& scoreBoard[i][j] == scoreBoard[i - 1][j + 1]
						&& scoreBoard[i][j] == scoreBoard[i - 2][j + 2]
						&& scoreBoard[i][j] == scoreBoard[i - 3][j + 3]) {
					return true;
				}

			}
		}
		return false;
	}
}
