import java.util.ArrayList;

public class Player2 extends Player1{

    @Override
    public void position(int pos, char[][] board, ArrayList<Integer> p) {
        switch (pos){
            case 1:
                board [0][0]='O';
                p.add(pos);
                break;
            case 2:
                board[0][2]= 'O';
                p.add(pos);
                break;
            case 3:
                board[0][4]= 'O';
                p.add(pos);
                break;
            case 4:
                board[2][0]= 'O';
                p.add(pos);
                break;
            case 5:
                board[2][2]= 'O';
                p.add(pos);
                break;
            case 6:
                board[2][4]= 'O';
                p.add(pos);
                break;
            case 7:
                board[4][0]= 'O';
                p.add(pos);
                break;
            case 8:
                board[4][2]= 'O';
                p.add(pos);
                break;
            case 9:
                board[4][4]= 'O';
                p.add(pos);
                break;
            default:
                break;
        }
    }
}
