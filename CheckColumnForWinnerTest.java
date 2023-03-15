import static org.junit.Assert.*;

import org.junit.Test;

public class CheckColumnForWinnerTest {

	@Test
	public void columns1() {
		String[][] board = {{"X", null, null},
				            {"X", "null", "null"},
				            {"X", null,  "X"}};
		assertEquals("X",  TicTacToe.checkColumnForWinner(board, 0));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 1));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 2));
	}
	@Test
	public void columns2() {
		String[][] board = {
				{"O", "X", null},
				{"O", "X", "O"},
				{"X", "X", null}
		};
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 0));
		assertEquals("X",  TicTacToe.checkColumnForWinner(board, 1));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 2));
	}
	@Test
	public void columns3() {
		String[][] board = {
				{"O", "O", "X"},
				{"O", "X", null},
				{null,   null,   "X"}
		};
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 0));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 1));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 2));
	}

	
	@Test
	public void columns4() {
		String[][] board = {
				{"X", "X",  "O"},
				{"X", "O",  "O"},
				{null, null,"O"}
		};
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 0));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 1));
		assertEquals("O",  TicTacToe.checkColumnForWinner(board, 2));
	}
	
	@Test
	public void columns5() {
		String[][] board = {
				{"X", "X", null},
				{"X", "X", null},
				{null,   null,   null}
		};
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 0));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 1));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 2));
	}

	@Test
	public void testColumnsLarge() {
		String board[][] = {{"X", null, "X", null}, 
				            {"+", null, "+", null}, 
				            {"X", null, "X", null}, 
				            {"+", null, "+", null}};
		
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 0));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 1));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 2));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 3));
		
		String board2[][] = {{"X", "+", "X", "+"}, 
				             {"X", "+", "X", "+"}, 
				             {"X", "+", "X", "+"}, 
				             {"+", "+", "X", "+"}};

		assertEquals(null, TicTacToe.checkColumnForWinner(board2, 0));
		assertEquals("+", TicTacToe.checkColumnForWinner(board2, 1));
		assertEquals("X", TicTacToe.checkColumnForWinner(board2, 2));
		assertEquals("+", TicTacToe.checkColumnForWinner(board2, 3));
		
	}
	

	@Test
	public void testColumnsSmall() {
		String board[][] = {{"X", null}, 
				            {"+", null}};
		
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 0));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 1));
		
		board[0][1] = "+";
		board[1][1] = "X";

		assertEquals(null, TicTacToe.checkColumnForWinner(board, 0));
		assertEquals(null, TicTacToe.checkColumnForWinner(board, 1));
		
		board[1][1] = "+";

		assertEquals(null, TicTacToe.checkColumnForWinner(board, 0));
		assertEquals("+", TicTacToe.checkColumnForWinner(board, 1));
		
	}
	

}
