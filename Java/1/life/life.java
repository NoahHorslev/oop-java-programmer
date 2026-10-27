import java.util.Random;

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

    public static int[][] populateBoard(int gameBoard[][], int n){

        Random r = new Random();

        for (int y = 0; y < n; y++){
            for (int x = 0; x < n; x++){
                gameBoard[y][x] = r.nextInt(2);
            }
        }

        return gameBoard;
    }

    public static int updateCell(int gameBoard[][], int yCoordinate, int xCoordinate, int n){
        int currentState = gameBoard[yCoordinate][xCoordinate];
        int updatedState = 0;


        // Tæl mængde af levende naboer
        int aliveNeighbours = 0;

        for (int y = yCoordinate - 1; y <= yCoordinate + 1; y++){
            if (y == -1 || y == n){
                continue;
            }
            for (int x = xCoordinate - 1; x <= xCoordinate + 1; x++){
                if (x == -1 || x == n){
                    continue;
                }
                if (y == yCoordinate && x == xCoordinate){
                    continue;
                }
                if (gameBoard[y][x] == 1){
                    aliveNeighbours++;
                }
            }
        }

        // System.out.println("Total alive neighbours; " + aliveNeighbours);

        if (currentState == 0){
            if (aliveNeighbours < 2){
                updatedState = 0;
            }
            if (aliveNeighbours == 2 || aliveNeighbours == 3){
                updatedState = 1;
            }
            if (aliveNeighbours > 3){
                updatedState = 0;
            }
        }
        if (currentState == 1){
            if (aliveNeighbours == 3){
                updatedState = 1;
            }
        }

        // System.out.println("The updated state should be; " + updatedState);

        return updatedState;
    }

    public static int[][] updateBoard(int gameBoard[][], int n){

        int[][] currentBoard = gameBoard;

        int[][] nextBoard = createBoard(n);
        
        for (int y = 0; y < n; y++){
            for (int x = 0; x < n; x++){
                nextBoard[y][x] = updateCell(currentBoard, y, x, n);
            }
        }
        return nextBoard;
    }

    

    static void renderScreen(int gameBoard[][], int n){
        // Render y-værdierne 'nedad'

        for (int y = 0; y < n; y++){
            for (int x = 0; x < n; x++){
                System.out.print(gameBoard[y][x]);
            }
            System.out.print("\n");
        }
    }

    
    

    public static void main(String[] args) {
        // laver boardet;
        int n = 5;
        int[][] gameBoard = createBoard(n);
        gameBoard = populateBoard(gameBoard, n);

        renderScreen(gameBoard, n);

        for (int i = 0; i < 5; i++){
            System.out.println("\n");
            gameBoard = updateBoard(gameBoard, n);
            renderScreen(gameBoard, n);

        }
    }
}
