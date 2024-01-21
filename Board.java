import java.util.Scanner;

public class Board {
    int height;
    int width; 

    public Board(int height, int width){
        this.height = height;  
        this.width = width;
    }

    public void drawBoard(char[] arr){
        System.out.println("     |     |      ");
        System.out.printf("  %c  |  %c  |  %c%n", arr[1], arr[2], arr[3]);
        System.out.println("_____|_____|_____ ");
        System.out.println("     |     |      ");
        System.out.printf("  %c  |  %c  |  %c%n", arr[4], arr[5], arr[6]);
        System.out.println("_____|_____|_____ ");
        System.out.println("     |     |      ");
        System.out.printf("  %c  |  %c  |  %c%n", arr[7], arr[8], arr[9]);
        System.out.println("     |     |      ");

    }

    public void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    

    public void makeMove(int player, char[] arr){

        char mark;  
        if (player % 2 != 0) {
            mark = 'X';
        }
        else{
            mark = 'O';
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Player " + player + " enter move: ");
        int move = in.nextInt();

        if (move > 9) {
            System.out.print("Wrong Enter a number bewtween 1-9: ");
            move = in.nextInt();
        }
        //Check so the box is empty 
        while (arr[move] != ' ') {
            System.out.print("Choose another box: ");
            move = in.nextInt();
            
        }
        arr[move] = mark;

    }

    public boolean checkBoard(char[] arr, int player){
        // X Horizontally 
        if (arr[1] == 'X' && arr[2] == 'X' && arr[3] == 'X') {
            return true; 
        }
        else if (arr[4] == 'X' && arr[5] == 'X' && arr[6] == 'X') {
            return true; 
        }
        else if (arr[7] == 'X' && arr[8] == 'X' && arr[9] == 'X') {
            return true; 
        }

        //X vertically 
        else if (arr[1] == 'X' && arr[4] == 'X' && arr[7] == 'X') {
            return true; 
        }
        else if (arr[2] == 'X' && arr[5] == 'X' && arr[8] == 'X') {
            return true; 
        }
        else if (arr[3] == 'X' && arr[6] == 'X' && arr[9] == 'X') {
            return true; 
        }

        //X Diagonally
        else if (arr[1] == 'X' && arr[5] == 'X' && arr[9] == 'X') {
            return true; 
        }
        else if (arr[3] == 'X' && arr[5] == 'X' && arr[7] == 'X') {
            return true; 
        }


        //O Horizontally  
        else if (arr[1] == 'O' && arr[2] == 'O' && arr[3] == 'O') {
            return true; 
        }
        else if (arr[4] == 'O' && arr[5] == 'O' && arr[6] == 'O') {
            return true; 
        }
        else if (arr[7] == 'O' && arr[8] == 'O' && arr[9] == 'O') {
            return true; 
        }
        //O vertically 
        else if (arr[1] == 'O' && arr[4] == 'O' && arr[7] == 'O') {
            return true; 
        }
        else if (arr[2] == 'O' && arr[5] == 'O' && arr[8] == 'O') {
            return true; 
        }
        else if (arr[3] == 'O' && arr[6] == 'O' && arr[9] == 'O') {
            return true; 
        }

        //O Diagonally
        else if (arr[1] == 'O' && arr[5] == 'O' && arr[9] == 'O') {
            return true; 
        }
        else if (arr[3] == 'O' && arr[5] == 'O' && arr[7] == 'O') {
            return true; 
        }


        return false; 
        //Add code
    }



}


