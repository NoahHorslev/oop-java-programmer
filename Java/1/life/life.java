public class life {

    public static int[][] createBoard(int n){
        int[][] gameBoard = new int[n][n];

        for (int y = 0; y < n; y++){
            for (int x = 0; x < n; x++){
                gameBoard[y][x] = 0;
            }
        }

        return gameBoard;
    }

    // Test comment

    public static int updateCell(int gameBoard[][], int yCoordinate, int xCoordinate){
        int currentState = gameBoard[yCoordinate][xCoordinate];

        return updatedState;
    }

    public static int[][] updateBoard(int gameBoard[][]){




        return gameBoard;
    }

    

    static void renderScreen(int gameBoard[][]){
        // Render y-værdierne 'nedad'

        for (int y = 0; y < gameBoard.length; y++){
            for (int x = 0; x < gameBoard[0].length; x++){
                System.out.print(gameBoard[y][x]);
            }
            System.out.print("\n");
        }
    }

    
    

    public static void main(String[] args) {
        // laver boardet;
        int[][] gameBoard = createBoard(5);

        renderScreen(gameBoard);
        
    }
}
