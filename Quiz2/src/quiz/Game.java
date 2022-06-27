package quiz;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 * This class creates a pattern depends on its boolean statement.
 * This class also write txt file the pattern.
 * 
 * @author <Hazel Ahn>
 * STUDENT ID: <16945085>
 *
 */
public class Game {
	
	//2-d array of boolean variable
	private boolean[][] board;

	
	//constructor to initialize the board of 10x10 array
	public Game() {
		board = new boolean[10][10];
		
		//set elements to false
		for (int i = 0; i < 10; ++i) {
			for(int j = 0; j <10; ++j) {
				board[i][j] = false;
			}
		}
	}
	
	//set the patterns for the board
	public String display() {
		//Create String builder object
		StringBuilder builtBoard = new StringBuilder();
		
		//set the patterns
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				if(board[i][j] == false) {
					builtBoard.append("[ ]");
				}
				else {
					builtBoard.append("[X]");
				}
			}
			builtBoard.append('\n');
		}
		return builtBoard.toString();
	}
	
	//set the pattern's position for the board
	public void setupBoard() {
		for(int i = 0; i < 10; ++i) {
			board[0][i] = true;
			board[9][i] = true;
			board[i][0] = true;
			board[i][9] = true;
		}
		for(int j = 0; j < 10; ++j) {
			board[j][9-j] = true;
			board[j][j] = true;
		}
	}
	
	//write the patterns to file
	public void writeToFile() {
		try {
			PrintWriter write = new PrintWriter(new FileWriter("output.txt"));
			
			//write to File
			write.println(display());
			write.close();
		}catch(IOException e) {
			System.out.println("Error reading file");
			e.printStackTrace();
		}
	}
	//main of this class
	public static void main(String[] args) {
		Game game = new Game();
		game.setupBoard();
		System.out.println();
		System.out.println(game.display());
		game.writeToFile();
	}

}