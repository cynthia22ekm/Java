import java.awt.Point;

import acm.program.ConsoleProgram;


public class BackTracking extends ConsoleProgram {

	private int NR_OF_QUEENS=4;
	private Point[] queens = new Point[NR_OF_QUEENS];
	
	public void run()
	{
		placeQueen(0);
			
		}
	private boolean placeQueen(int n) {
		// stop condition, we placed all queens:
		if (n >= NR_OF_QUEENS) {
		return true;
		}
		boolean[][] tmp = markThreatenedFields();
		
		// every possible choice among the columns in this row
		for (int i = 0; i < NR_OF_QUEENS; i++) {
		// check if point is safe
		if (isSafe(i, n, tmp)) {
		queens[n] = new Point(i, n);
		
		if (placeQueen(n + 1)) {
		return true;
		} else {
		queens[n] = null;
		
		}
		
		}
		}
		
		return false;
		
	}
	
	private boolean isSafe(int x, int y, boolean[][] tmp) {
		return !tmp[x][y];
		}
	
	private boolean[][] markThreatenedFields() {
		boolean[][] tmp = new boolean[NR_OF_QUEENS][NR_OF_QUEENS];
		for (int i = 0; i < NR_OF_QUEENS; i++) {
		if (queens[i] != null) {
		markHorizontal(queens[i], tmp);
//		markVertical(queens[i], tmp);
//		markDiagonal1(queens[i], tmp);
//		markDiagonal2(queens[i], tmp);
		}
		}
		System.out.println(tmp);
		return tmp;
		}
	
//	private void markDiagonal2(Point queen, boolean[][] tmp) {
//	    	for (int x = 0; x < NR_OF_QUEENS; x++) {
//			tmp[queen.x][queen.y] = true;
//			}
//			}
//		
//	
//
//	private void markDiagonal1(Point queen, boolean[][] tmp) {
//			for (int x = NR_OF_QUEENS; x >=0; x--) {
//			tmp[queen.x][queen.y] = true;
//			}
//			}
		
	

	private void markHorizontal(Point queen, boolean[][] tmp) {
		for (int x = 0; x < NR_OF_QUEENS; x++) {
		tmp[x][queen.y] = true;
		}
		}
	
//	private void markVertical(Point queen, boolean[][] tmp) {
//		for (int y = 0; y < NR_OF_QUEENS; y++) {
//		tmp[queen.x][y] = true;
//		}
//		}
	
}
