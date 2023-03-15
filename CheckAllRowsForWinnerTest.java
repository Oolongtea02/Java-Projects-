import static org.junit.Assert.*;

import org.junit.Test;

public class CheckAllRowsForWinnerTest {

	@Test
	public void row1() {
		String[][] board = {{"X", "X", "X"},
				            {"X", "O", "O"}, 
				            {"O", null,"X"}};
		assertEquals( "X", TicTacToe.checkAllRowsForWinner(board));
	}
	@Test
	public void row2() {
		String[][] board = {
				{"O", "X", null},
				{"O", "O", "O"},
				{"X", "X", null}
		};
		assertEquals("O", TicTacToe.checkAllRowsForWinner(board));
	}
	@Test
	public void row3() {
		String[][] board = {
				{"O", "O", "X"},
				{"O", "X", null},
				{null,   null,   "X"}
		};
		assertEquals(null, TicTacToe.checkAllRowsForWinner(board));
	}
	@Test
	public void rows4() {
		String[][] board = {
				{"X", "X", "O"},
				{"X", "O", "X"},
				{"O", "O", "O"}
		};
		assertEquals("O", TicTacToe.checkAllRowsForWinner(board));
	}
	@Test
	public void rows5() {
		String[][] board = {
				{"X", "X", null},
				{"X", "X", null},
				{null,   null,   null}
		};
		assertEquals(null, TicTacToe.checkAllRowsForWinner(board));
	}
	@Test
	public void testRowsLarge() {
		String board[][] = {{"X", null, "X", null}, 
				            {"+", null, "+", null}, 
				            {"X", "X", "X", "X"}, 
				            {"+", null, "+", null}};
		
		assertEquals("X", TicTacToe.checkAllRowsForWinner(board));
		
		String board2[][] = {{"X", "+", "X", "+"}, 
				             {"X", "+", "X", "+"}, 
				             {"X", "+", "X", "+"}, 
				             {"+", "+", "X", "+"}};

		assertEquals(null, TicTacToe.checkAllRowsForWinner(board2));
		
	}
	

	@Test
	public void testRowsSmall() {
		String board[][] = {{"X", null}, 
				            {"+", null}};
		
		assertEquals(null, TicTacToe.checkAllRowsForWinner(board));
		
		board[0][1] = "+";
		board[1][1] = "X";

		assertEquals(null, TicTacToe.checkAllRowsForWinner(board));
		
		board[1][1] = "+";

		assertEquals("+", TicTacToe.checkAllRowsForWinner(board));
		
	}
}

