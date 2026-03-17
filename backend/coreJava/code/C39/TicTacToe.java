import java.util.Scanner;

class TicTacToe {

    int clicks = 0;
    boolean isGameActive = true;
    String []cells = {"","","","","","","","",""};
    String player = "O";

    void printBoard(){

        System.out.println("***************************");
        System.out.println("\tTic Tac Toe");
        System.out.println("***************************");

        for(int i = 0; i < 9; i++){
            if(cells[i].equals("")){
                System.out.print(("__") + "\t");
            }
            else{
                System.out.print(cells[i] + "\t");
            }
            if(i == 2 || i == 5) System.out.println("\n");
        }

        System.out.println();

    }

    void checkWinner(String current){
        if(cells[0].equals(current) && cells[1].equals(current) && cells[2].equals(current)){
            printBoard();
            System.out.println(current + " won the game.");
            System.out.println("Please restart the game!");
            isGameActive = false;
        }
        else if(cells[3].equals(current) && cells[4].equals(current) && cells[5].equals(current)){
            printBoard();
            System.out.println(current + " won the game.");
            System.out.println("Please restart the game!");
            isGameActive = false;
        }
        else if(cells[6].equals(current) && cells[7].equals(current) && cells[8].equals(current)){
            printBoard();
            System.out.println(current + " won the game.");
            System.out.println("Please restart the game!");
            isGameActive = false;
        }
        else if(cells[0].equals(current) && cells[3].equals(current) && cells[6].equals(current)){
            printBoard();
            System.out.println(current + " won the game.");
            System.out.println("Please restart the game!");
            isGameActive = false;
        }
        else if(cells[1].equals(current) && cells[4].equals(current) && cells[7].equals(current)){
            printBoard();
            System.out.println(current + " won the game.");
            System.out.println("Please restart the game!");
            isGameActive = false;
        }
        else if(cells[2].equals(current) && cells[5].equals(current) && cells[8].equals(current)){
            printBoard();
            System.out.println(current + " won the game.");
            System.out.println("Please restart the game!");
            isGameActive = false;
        }
        else if(cells[0].equals(current) && cells[4].equals(current) && cells[8].equals(current)){
            printBoard();
            System.out.println(current + " won the game.");
            System.out.println("Please restart the game!");
            isGameActive = false;
        }
        else if(cells[2].equals(current) && cells[4].equals(current) && cells[6].equals(current)){
            printBoard();
            System.out.println(current + " won the game.");
            System.out.println("Please restart the game!");
            isGameActive = false;
        }
    }
    public static void main(String[] args) {

        TicTacToe ttt = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (ttt.isGameActive) {
            ttt.printBoard();

            if (ttt.clicks == 9) {
                ttt.printBoard();
                System.out.println("Game Drawn.\nPlease restart the game.");
                ttt.isGameActive = false;
                break;
            }

            System.out.println("\nPlayer " + ttt.player + " enter your cell number.");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number (1-9).");
                scanner.next(); // consume invalid input
                continue;
            }

            int num = scanner.nextInt();

            if (num >= 1 && num <= 9 && ttt.cells[num - 1].equals("")) {
                ttt.cells[num - 1] = ttt.player;
                ttt.clicks++;
                ttt.checkWinner(ttt.player);

                if ("O".equals(ttt.player)) ttt.player = "X";
                else ttt.player = "O";

            } else {

                System.out.println("Wrong choice!!! Choose an empty cell between 1 and 9.");

            }
        }

        scanner.close();
    }
}
