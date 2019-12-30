package application;

import java.util.Arrays;

public class createBoard {
	
	
	public static void displayBoard(int[][] board) {
		int count = 0;
		for (int[] i : board)
			for (int j : i) {
				System.out.print(j + " ");
				count += 1;
				if (count % 3 == 0)
					System.out.print("  ");
				if (count % 9 == 0)
					System.out.println("");
				if (count % 27 == 0)
					System.out.println("");
			}
	}
	
	
	public static int randomInt(int Min, int Max) {
		return (int) (Math.random()*(Max-Min))+Min;
	}
	
	
	public static int[][] generateValidBoard(){
		int[][] currentBoard = generateBoard();
		int[][] testBoard = copy(currentBoard);
		while (!(solvingAlgorithm.backTrackAlgorithm(testBoard))) {
			currentBoard = generateBoard();
			testBoard = copy(currentBoard);
		}
		return currentBoard;
	}
	
	public static int[][] generateBoard() {
		int[][] board = new int[9][9];
		int i = 0;
		int j = 0;
		int randomValue = 0;
		//Access each 3x3 square
		for (i = 0; i < board.length; i++) {
			//Access each value in the 3x3 square
			for(j = 0; j < board[i].length; j++) {
				//A number will be placed in the box each time the random value is greater than 0.75.
				//Therefore only 25% of the time will a value be placed causing the game to have representative of a real board.
				double checkRandom = Math.random();
				if (checkRandom > 0.75) {
					boolean legalValue = false;
					while (!(legalValue)) {
						randomValue = randomInt(1, 9);
						legalValue = true;
						//Check if the random value is already in the horizontal
						for (int x: board[i]) {
							if(randomValue == x)
								legalValue = false;
						} 
						//Check if the random value is already in the vertical
						for (int k = 0; k < 9; k++) {
							if (k == i)
								continue;
							else if (randomValue == board[k][j])
								legalValue = false;
						}
						//Check if the random value is already in the 3x3 square
						if ((j == 0 || j == 3 || j == 6) && (i == 0 || i == 3 || i == 6)) {
							if (randomValue == board[i + 1][j + 1] || randomValue == board[i + 1][j +2] || 
									randomValue == board[i + 2][j + 1] || randomValue == board[i + 2][j + 2]) 
								legalValue = false;
						}if ((j == 1 || j == 4 || j == 7) && (i == 0 || i == 3 || i == 6)) {
							if (randomValue == board[i + 1][j - 1] || randomValue == board[i + 1][j + 1] ||
									randomValue == board[i + 2][j-1] || randomValue == board[i + 2][j + 1])
								legalValue = false;
						}if ((j == 2 || j == 5 || j == 8) && (i == 0 || i == 3 || i == 6)) {
							if (randomValue == board[i + 1][j - 2] || randomValue == board[i + 1][j - 1] ||
									randomValue == board[i + 2][j - 2] || randomValue == board[i + 2][j - 1])
								legalValue = false;
						}if ((j == 0 || j == 3 || j == 6) && (i == 1 || i == 4 || i == 7)) {
							if (randomValue == board[i - 1][j + 1] || randomValue == board[i - 1][j + 2] ||
									randomValue == board[i + 1][j + 1] || randomValue == board[i + 1][j + 2])
								legalValue = false;
						}if ((j == 1 || j == 4 || j == 7) && (i == 1 || i == 4 || i == 7)) {
							if (randomValue == board[i - 1][j - 1] || randomValue == board[i - 1][j + 1] ||
									randomValue == board[i + 1][j - 1] || randomValue == board[i + 1][j + 1])
								legalValue = false;
						}if ((j == 2 || j == 5 || j == 8) && (i == 1 || i == 4 || i == 7)) {
							if (randomValue == board[i - 1][j - 2] || randomValue == board[i - 1][j - 1] ||
									randomValue == board[i + 1][j - 2] || randomValue == board[i + 1][j - 1])
								legalValue = false;
						}if ((j == 0 || j == 3 || j == 6) && (i == 2 || i == 5 || i == 8)) {
							if (randomValue == board[i - 2][j + 1] || randomValue == board[i - 1][j + 2] ||
									randomValue == board[i - 1][j + 1] || randomValue == board[i - 1][j + 2])
								legalValue = false;
						}if ((j == 1 || j == 4 || j == 7) && (i == 2 || i == 5 || i == 8)) {
							if (randomValue == board[i - 2][j - 1] || randomValue == board[i - 2][j + 1] ||
									randomValue == board[i - 1][j - 1] || randomValue == board[i - 1][j + 1])
								legalValue = false;
						}if ((j == 2 || j == 5 || j == 8) && (i == 2 || i == 5 || i == 8)) {
							if (randomValue == board[i - 2][j - 2] || randomValue == board[i - 2][j - 1] ||
									randomValue == board[i - 1][j - 2] || randomValue == board[i - 1][j - 1])
								legalValue = false;
						}
						board[i][j] = randomValue;

					}
				} else
					board[i][j] = 0;
			}
		}
		return board;
	}
	
	public static int[][] copy(int[][] src) {
	    int[][] dst = new int[src.length][];
	    for (int i = 0; i < src.length; i++) {
	        dst[i] = Arrays.copyOf(src[i], src[i].length);
	    }
	    return dst;
	}
	
	
}

