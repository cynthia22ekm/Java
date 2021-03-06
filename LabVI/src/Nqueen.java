import acm.program.ConsoleProgram;

//https://www.journaldev.com/44082/n-queens-problem-java-c-plus-plus
public class Nqueen extends ConsoleProgram {
	private int boardSize = 4;
	private int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
			{ 0, 0, 0, 0 } };

	public void run() {
		placeQueen(board, 0);
		chess(board);

	}

	public void chess(int board[][]) {
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++)
				System.out.print(" " + board[i][j] + " ");
			System.out.println();
		}
	}

	public boolean canPlace(int board[][], int row, int col) {
		int i, j;
		for (i = 0; i < col; i++)
			// checking the columns
			if (board[row][i] == 1)
				return false;

		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
			// checking the left upper diagonal
			if (board[i][j] == 1)
				return false;

		for (i = row, j = col; j >= 0 && i < boardSize; i++, j--)
			// checking the left lower diagonal
			if (board[i][j] == 1)
				return false;

		return true;
	}

	public boolean placeQueen(int board[][], int col) {
		int i;
		if (col >= boardSize)
			return true;
		for (i = 0; i < boardSize; i++) { // loop for incrementing through the
											// rows
			if (canPlace(board, i, col)) {
				board[i][col] = 1;

				if (placeQueen(board, col + 1)) // loop for incrementing through
												// the columns
				{
					return true;
				} else {
					board[i][col] = 0;
				}
			}
		}

		return false;
	}

}