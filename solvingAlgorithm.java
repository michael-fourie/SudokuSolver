package application;

public class solvingAlgorithm {
	
	public static void main(String[] args) {
		int[][] board = new int[9][9];
		createBoard.generateBoard();
		System.out.println("Original Sodoku Board: ");
		createBoard.displayBoard(board);
		System.out.println("Solving board....");

		if (backTrackAlgorithm(board))
			createBoard.displayBoard(board);
		else
			System.out.println("Unsolvable board.");
	}
	
	public static boolean backTrackAlgorithm(int[][] board) {
		int i, j;
		for (i = 0; i < board.length; i++) {
			for(j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0){
					for (int num = 1; num <= 9; num++) {
						if (checkValidity(board, num, i, j)) {
							board[i][j] = num;
							if(backTrackAlgorithm(board))
								return true;
							else 
								board[i][j] = 0;
						}
					}
					return false;
				}
			}
		}
		System.out.println("The board has been solved.\n");
		return true;
	}
	
	public static boolean checkValidity(int[][] board, int testValue, int i, int j) {

		boolean legalValue = true;
		//for (int i = 0; i < 9; i++) {
		//for (int j = 0; j < 9; j++) {
		//Check if the test value is already in the horizontal
		for (int element: board[i]) {
			if(testValue == element)
				legalValue = false;
		} 
		//Check if the test value is already in the vertical
		for (int k = 0; k < 9; k++) {
			if (k == i)
				continue;
			else if (testValue == board[k][j])
				legalValue = false;
		}
		//Check if the random value is already in the 3x3 square
		if ((j == 0 || j == 3 || j == 6) && (i == 0 || i == 3 || i == 6)) {
			if (testValue == board[i + 1][j + 1] || testValue == board[i + 1][j +2] || 
					testValue == board[i + 2][j + 1] || testValue == board[i + 2][j + 2]) 
				legalValue = false;
		}else if ((j == 1 || j == 4 || j == 7) && (i == 0 || i == 3 || i == 6)) {
			if (testValue == board[i + 1][j - 1] || testValue == board[i + 1][j + 1] ||
					testValue == board[i + 2][j-1] || testValue == board[i + 2][j + 1])
				legalValue = false;
		}else if ((j == 2 || j == 5 || j == 8) && (i == 0 || i == 3 || i == 6)) {
			if (testValue == board[i + 1][j - 2] || testValue == board[i + 1][j - 1] ||
					testValue == board[i + 2][j - 2] || testValue == board[i + 2][j - 1])
				legalValue = false;
		}else if ((j == 0 || j == 3 || j == 6) && (i == 1 || i == 4 || i == 7)) {
			if (testValue == board[i - 1][j + 1] || testValue == board[i - 1][j + 2] ||
					testValue == board[i + 1][j + 1] || testValue == board[i + 1][j + 2])
				legalValue = false;
		}else if ((j == 1 || j == 4 || j == 7) && (i == 1 || i == 4 || i == 7)) {
			if (testValue == board[i - 1][j - 1] || testValue == board[i - 1][j + 1] ||
					testValue == board[i + 1][j - 1] || testValue == board[i + 1][j + 1])
				legalValue = false;
		}else if ((j == 2 || j == 5 || j == 8) && (i == 1 || i == 4 || i == 7)) {
			if (testValue == board[i - 1][j - 2] || testValue == board[i - 1][j - 1] ||
					testValue == board[i + 1][j - 2] || testValue == board[i + 1][j - 1])
				legalValue = false;
		}else if ((j == 0 || j == 3 || j == 6) && (i == 2 || i == 5 || i == 8)) {
			if (testValue == board[i - 2][j + 1] || testValue == board[i - 1][j + 2] ||
					testValue == board[i - 1][j + 1] || testValue == board[i - 1][j + 2])
				legalValue = false;
		}else if ((j == 1 || j == 4 || j == 7) && (i == 2 || i == 5 || i == 8)) {
			if (testValue == board[i - 2][j - 1] || testValue == board[i - 2][j + 1] ||
					testValue == board[i - 1][j - 1] || testValue == board[i - 1][j + 1])
				legalValue = false;
		}else if ((j == 2 || j == 5 || j == 8) && (i == 2 || i == 5 || i == 8)) {
			if (testValue == board[i - 2][j - 2] || testValue == board[i - 2][j - 1] ||
					testValue == board[i - 1][j - 2] || testValue == board[i - 1][j - 1])
				legalValue = false;
		}
		return legalValue;
	}
}