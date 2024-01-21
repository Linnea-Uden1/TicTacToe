import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Board board = new Board(3,3);
        board.clearScreen();
        //Create scanner 
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to tic tac toe");


        boolean gameOver = false;
        int player = 1;

        char[] startBoard = {' ', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println("Rules: ");
        board.drawBoard(startBoard);
        System.out.println("");
        System.out.println("Let the game begin!");
        System.out.println("----------------------");


        char[] moves = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        
        while (!gameOver)
        {
            board.drawBoard(moves);
            board.makeMove(player, moves);
            gameOver = board.checkBoard(moves, player);
            if (player == 2 && gameOver == false) {
                player = 1;
            }
            else if(player == 1 && gameOver == false){
                player = 2; 
            }
            board.clearScreen();
        }

        board.drawBoard(moves);
        System.out.println("Game over! Player " + player + " winner");

    }  
}