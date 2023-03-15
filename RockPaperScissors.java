import java.util.Scanner;

public class RockPaperScissors {

		public static void main(String[] args) {
			int win = 0;
			Scanner console = new Scanner(System.in);
			char i = 'w';
			while (i != 'q'){
			System.out.print("Please enter your pick (1 rock, 2 paper, 3 scissors, q quit): ");
			i = console.next().charAt(0);
			int j =(int) (Math.random()*3)+1;
			if ((i=='1'&&j==2)||(i=='2'&&j==3)||(i=='3'&&j==1)){
				System.out.println("Computer picks: " + j);
				System.out.println("Result: You lose");
			} else if((i=='1'&&j==3)||(i=='2'&&j==1)||(i=='3'&&j==2)){
				System.out.println("Computer picks: " + j);
				System.out.println("Result: You win!");
				win++;
			}
			else if((i=='3'&&j==3)||(i=='2'&&j==2)||(i=='1'&&j==1)){
				System.out.println("Computer picks: " + j);
				System.out.println("Result: Tie");
			}else if(i=='q'){
				if(win==1){
					System.out.println("Game over\n\nUser totally wins " + win +" time");	
				} else
				System.out.println("Game over\n\nUser totally wins " + win +" times");
			}else{
				System.out.println("Illegal variable, Try again");
			}
			System.out.println();
			}
			
		}
	}




