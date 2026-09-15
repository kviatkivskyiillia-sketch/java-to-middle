package Middle;

import java.util.Scanner;

public class Tic_tac_toe_game {
    public static void main(String[] args) {
        char[][] gameBord =
                        {{' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBord);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement: (1-9):");
        int position = scan.nextInt();

        System.out.println(position);

        printGameBoard(gameBord);
        placePiece(gameBord, position, "player");
    }

    public static void printGameBoard(char[][] gameBord) {
        for (char[] row : gameBord){
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBord, int position, String user) {

        char symbol = ' ';

        if (user.equals("player")){
            symbol = 'X';
        } else if (user.equals("cpu")){
            symbol = 'O';
        }


        switch (position) {
            case 1:
                gameBord[0][0] = symbol;
                break;
            case 2:
                gameBord[0][2] = symbol;
                break;
            case 3:
                gameBord[0][4] = symbol;
                break;
            case 4:
                gameBord[2][0] = symbol;
                break;
            case 5:
                gameBord[2][2] = symbol;
                break;
            case 6:
                gameBord[2][4] = symbol;
                break;
            case 7:
                gameBord[4][0] = symbol;
                break;
            case 8:
                gameBord[4][2] = symbol;
                break;
            case 9:
                gameBord[4][4] = symbol;
                break;
            default:
                break;
        }
    }



}
