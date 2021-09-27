



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> playerX = new ArrayList<Integer>();
    static ArrayList<Integer> playerY = new ArrayList<Integer>();
    public static void main(String[] args) {

        char [][] board =
                {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
                };

        GameBoard gameBoard = new GameBoard();
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        gameBoard.GameBoard(board);

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Player 1 enter a number 1-9 : ");
            int player1pos = input.nextInt();

            player1.position(player1pos,board,playerX);
            gameBoard.GameBoard(board);

            System.out.println("Player 2 enter a number 1-9 : ");
            int player2pos = input.nextInt();
            player2.position(player2pos,board,playerY);
            gameBoard.GameBoard(board);

            String result = checkWinner();
            System.out.println(result);

        }


    }
    public static String  checkWinner(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List BotRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(3,5,7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List l : winning){
            if(playerX.containsAll(l)){
                return "congratulations player X won";
            }else if (playerY.containsAll(l)){
                return "congratulations player Y won";
            }else if(playerX.size()+ playerY.size() == 9){
                return "Cat";
            }
        }
        return "";
    }
}
