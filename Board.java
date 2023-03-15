package classes_test;

import java.util.Arrays;

public class Board {
	int x;
	int y;
	//int[][] bd = new int[x][y];
	int[][] bd;
	int sunk=0;
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b1 = new Board(6, 6);
		Board b2 = new Board(7);
		//Board b1 = new Board(); //without constructor
		//b1.x = 19;
		//b1.y = 19;
		//int [][] b = new int[5][10];
		// b1.bd = Initialize(b, 0);
		System.out.println(b1.x + ", " + b1.y);
		b1.bd = Initialize(0, b1.x, b1.y);
		for (int i = 0; i < b1.bd.length; i++) {
			System.out.println(Arrays.toString(b1.bd[i]));
		}

		b2.bd = Initialize(0, b2.x, b2.y);
		for (int i = 0; i < b2.bd.length; i++) {
			System.out.println(Arrays.toString(b2.bd[i]));
		}
		//Board(8); //try to test Board(x)

	
	}
	public static int[][] Initialize(int v, int a, int b) {
		int[][] d= new int[a][b];
		for (int i = 0; i <= d.length - 1; i++) {
			for (int j = 0; j <= d[0].length - 1; j++) {
				 //d[i][j] = v;
				 System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		return d;

	}
	
	//public void Board(int initialX) { :  note: Wrong! do not use void in constructor
    public Board(int initialX) {
	   // int x = initialX; note: Wrong!  do not redeclare fields in constructor
	   this.x = initialX;
	   this.y = 3;
    }
	
	public Board(int initialX, int initialY) {
		x = initialX;
		y = initialY;
	}
  


	
	
}	


