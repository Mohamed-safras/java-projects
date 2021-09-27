class GameBoard {
    public void GameBoard(char[][] gameBoard){
        for(char[] row : gameBoard){
            for(char col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
